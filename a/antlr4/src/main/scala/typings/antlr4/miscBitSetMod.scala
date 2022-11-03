package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscBitSetMod {
  
  @JSImport("antlr4/misc/BitSet", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with BitSet
  
  @js.native
  trait BitSet extends StObject {
    
    def add(value: Double): Unit = js.native
    
    val data: js.Array[Boolean] = js.native
    
    def equals(other: BitSet): Boolean = js.native
    
    def has(value: Double): Boolean = js.native
    
    def length: Double = js.native
    
    def minValue(): Double = js.native
    
    def or(set: BitSet): Unit = js.native
    
    def remove(value: Double): Unit = js.native
    
    def values(): js.Array[String] = js.native
  }
}
