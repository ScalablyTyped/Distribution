package typings.antlr4

import typings.antlr4.antlr4Booleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscIntervalSetMod {
  
  @JSImport("antlr4/misc/IntervalSet", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with IntervalSet
  
  @js.native
  trait IntervalSet extends StObject {
    
    def addInterval(toAdd: typings.antlr4.miscIntervalMod.default): Unit = js.native
    
    def addOne(v: Double): Unit = js.native
    
    def addRange(l: Double, h: Double): Unit = js.native
    
    def addSet(other: IntervalSet): IntervalSet = js.native
    
    def complement(start: Double, stop: Double): IntervalSet = js.native
    
    def contains(item: Double): Boolean = js.native
    
    def elementName(literalNames: js.Array[String], symbolicNames: js.Array[String], token: Double): String = js.native
    
    def first(): Double = js.native
    
    val intervals: js.Array[typings.antlr4.miscIntervalMod.default] | Null = js.native
    
    def length: Double = js.native
    
    val readOnly: `false` = js.native
    
    def reduce(pos: Double): Unit = js.native
    
    def removeOne(value: Double): Unit = js.native
    
    def removeRange(toRemove: typings.antlr4.miscIntervalMod.default): Unit = js.native
    
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
