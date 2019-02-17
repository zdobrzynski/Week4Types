package com.ZachD.week4.Types;

import java.util.Scanner;

public class Main {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        //    Create a class that includes a main method that asks the user for a number.
        //    The code should then determine which data type that uses the least amount of memory the number fits into.
        //    The name of the data type should be printed out.

        System.out.println("Please enter a number:");
        double input = keyboard.nextDouble();

        if((input <= Byte.MAX_VALUE) && (input >= Byte.MIN_VALUE) && (input % 2 == 1)){
            System.out.println((byte)input + " should use a BYTE.");
        }else if((input <= Short.MAX_VALUE) && (input >= Short.MIN_VALUE) && (input % 2 == 1)){
            System.out.println((short)input + " should use a SHORT.");
        }else if((input <= Integer.MAX_VALUE) && (input >= Integer.MIN_VALUE) && (input % 2 == 1)){
            System.out.println((int)input + " should use an INT.");
        }else if((input <= Long.MAX_VALUE) && (input >= Long.MIN_VALUE) && (input % 2 == 1)){
            System.out.println((long)input + " should use a Long.");
        }else if((input <= Float.MAX_VALUE) && (input >= Float.MIN_VALUE)){
            System.out.println(input + " should use a Float.");
        }else{
            System.out.println(input + " should use a Double.");
        }

    }
}
