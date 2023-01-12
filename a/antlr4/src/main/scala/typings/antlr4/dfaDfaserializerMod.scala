package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dfaDfaserializerMod {
  
  @JSImport("antlr4/dfa/DFASerializer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DFASerializer {
    def this(dfa: typings.antlr4.dfaDfaMod.default) = this()
    def this(dfa: typings.antlr4.dfaDfaMod.default, literalNames: js.Array[String]) = this()
    def this(
      dfa: typings.antlr4.dfaDfaMod.default,
      literalNames: js.Array[String],
      symbolicNames: js.Array[String]
    ) = this()
    def this(dfa: typings.antlr4.dfaDfaMod.default, literalNames: Unit, symbolicNames: js.Array[String]) = this()
    
    /* CompleteClass */
    override val dfa: typings.antlr4.dfaDfaMod.default = js.native
    
    /* CompleteClass */
    override def getEdgeLabel(i: Double): String = js.native
    
    /* CompleteClass */
    override def getStateString(s: typings.antlr4.dfaDfastateMod.default): String = js.native
    
    /* CompleteClass */
    override val literalNames: js.Array[String] = js.native
    
    /* CompleteClass */
    override val symbolicNames: js.Array[String] = js.native
  }
  
  trait DFASerializer extends StObject {
    
    val dfa: typings.antlr4.dfaDfaMod.default
    
    def getEdgeLabel(i: Double): String
    
    def getStateString(s: typings.antlr4.dfaDfastateMod.default): String
    
    val literalNames: js.Array[String]
    
    val symbolicNames: js.Array[String]
  }
  object DFASerializer {
    
    inline def apply(
      dfa: typings.antlr4.dfaDfaMod.default,
      getEdgeLabel: Double => String,
      getStateString: typings.antlr4.dfaDfastateMod.default => String,
      literalNames: js.Array[String],
      symbolicNames: js.Array[String]
    ): DFASerializer = {
      val __obj = js.Dynamic.literal(dfa = dfa.asInstanceOf[js.Any], getEdgeLabel = js.Any.fromFunction1(getEdgeLabel), getStateString = js.Any.fromFunction1(getStateString), literalNames = literalNames.asInstanceOf[js.Any], symbolicNames = symbolicNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[DFASerializer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DFASerializer] (val x: Self) extends AnyVal {
      
      inline def setDfa(value: typings.antlr4.dfaDfaMod.default): Self = StObject.set(x, "dfa", value.asInstanceOf[js.Any])
      
      inline def setGetEdgeLabel(value: Double => String): Self = StObject.set(x, "getEdgeLabel", js.Any.fromFunction1(value))
      
      inline def setGetStateString(value: typings.antlr4.dfaDfastateMod.default => String): Self = StObject.set(x, "getStateString", js.Any.fromFunction1(value))
      
      inline def setLiteralNames(value: js.Array[String]): Self = StObject.set(x, "literalNames", value.asInstanceOf[js.Any])
      
      inline def setLiteralNamesVarargs(value: String*): Self = StObject.set(x, "literalNames", js.Array(value*))
      
      inline def setSymbolicNames(value: js.Array[String]): Self = StObject.set(x, "symbolicNames", value.asInstanceOf[js.Any])
      
      inline def setSymbolicNamesVarargs(value: String*): Self = StObject.set(x, "symbolicNames", js.Array(value*))
    }
  }
}
