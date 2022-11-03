package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atnPredicateMod {
  
  @JSImport("antlr4/atn/Predicate", JSImport.Default)
  @js.native
  open class default () extends Predicate {
    def this(ruleIndex: Double) = this()
    def this(ruleIndex: Double, predIndex: Double) = this()
    def this(ruleIndex: Unit, predIndex: Double) = this()
    def this(ruleIndex: Double, predIndex: Double, isCtxDependent: Boolean) = this()
    def this(ruleIndex: Double, predIndex: Unit, isCtxDependent: Boolean) = this()
    def this(ruleIndex: Unit, predIndex: Double, isCtxDependent: Boolean) = this()
    def this(ruleIndex: Unit, predIndex: Unit, isCtxDependent: Boolean) = this()
  }
  
  @js.native
  trait Predicate
    extends typings.antlr4.atnSemanticContextMod.default {
    
    def equals(other: Predicate): Boolean = js.native
    
    val isCtxDependent: Boolean = js.native
    
    val predIndex: Double = js.native
    
    val ruleIndex: Double = js.native
    
    def updateHashCode(hash: typings.antlr4.miscHashCodeMod.default): Unit = js.native
  }
}
