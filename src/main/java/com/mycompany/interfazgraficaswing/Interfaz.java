
package com.mycompany.interfazgraficaswing;

import javax.swing.*;

public class Interfaz extends JFrame {
 private JLabel label1;
 
 public Interfaz(){
  setLayout(null);
  label1 = new JLabel("Aqui va el Texto de ejemplo");
  label1.setBounds(10,20,200,300);
  add(label1);
 }
 
 public static void main(String argds[]){
  
     Interfaz interfaz1 = new Interfaz();
     interfaz1.setBounds(0,0,400,300);
     interfaz1.setVisible(true);
     interfaz1.setLocationRelativeTo(null);
 }
}
