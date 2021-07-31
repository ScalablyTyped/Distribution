package typings.antlr4

import typings.antlr4.tokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intervalSetMod {
  
  @JSImport("antlr4/IntervalSet", "Interval")
  @js.native
  class Interval protected () extends StObject {
    def this(start: Double, stop: Double) = this()
    
    def contains(item: Double): Boolean = js.native
    
    val length: Double = js.native
    
    val start: Double = js.native
    
    val stop: Double = js.native
  }
  
  @JSImport("antlr4/IntervalSet", "IntervalSet")
  @js.native
  class IntervalSet () extends StObject {
    
    def addInterval(interval: Interval): Unit = js.native
    
    def addOne(v: Double): Unit = js.native
    
    def addRange(l: Double, h: Double): Unit = js.native
    
    def addSet(other: IntervalSet): Unit = js.native
    
    def complement(start: Double, stop: Double): IntervalSet = js.native
    
    def contains(item: Double): Boolean = js.native
    
    def elementName(literalNames: js.Array[String], symbolicNames: js.Array[String], token: Token): String = js.native
    
    def first(): Double = js.native
    
    val intervals: js.Array[Interval] = js.native
    
    val length: Boolean = js.native
    
    val readOnly: Boolean = js.native
    
    def reduce(k: Double): Unit = js.native
    
    def removeOne(v: Double): Boolean = js.native
    
    def removeRange(interval: Interval): Boolean = js.native
    
    def toCharString(): String = js.native
    
    def toIndexString(): String = js.native
    
    def toString(literalNames: js.Array[String]): String = js.native
    def toString(literalNames: js.Array[String], symbolicNames: js.Array[String]): String = js.native
    def toString(literalNames: js.Array[String], symbolicNames: js.Array[String], elemsAreChar: Boolean): String = js.native
    def toString(literalNames: js.Array[String], symbolicNames: Unit, elemsAreChar: Boolean): String = js.native
    def toString(literalNames: Unit, symbolicNames: js.Array[String]): String = js.native
    def toString(literalNames: Unit, symbolicNames: js.Array[String], elemsAreChar: Boolean): String = js.native
    def toString(literalNames: Unit, symbolicNames: Unit, elemsAreChar: Boolean): String = js.native
    
    def toTokenString(literalNames: js.Array[String], symbolicNames: js.Array[String]): String = js.native
  }
}
