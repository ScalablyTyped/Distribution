package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atnPrecedencePredicateMod {
  
  @JSImport("antlr4/atn/PrecedencePredicate", JSImport.Default)
  @js.native
  open class default protected () extends PrecedencePredicate {
    def this(precedence: Double) = this()
  }
  
  @js.native
  trait PrecedencePredicate
    extends typings.antlr4.atnSemanticContextMod.default {
    
    def compareTo(other: PrecedencePredicate): Double = js.native
    
    def equals(other: PrecedencePredicate): Boolean = js.native
    
    def evalPrecedence(
      parser: typings.antlr4.parserMod.default,
      outerContext: typings.antlr4.contextParserRuleContextMod.default
    ): PrecedencePredicate = js.native
    
    def evaluate(
      parser: typings.antlr4.parserMod.default,
      outerContext: typings.antlr4.contextParserRuleContextMod.default
    ): Boolean = js.native
    
    val precedence: Double = js.native
    
    def updateHashCode(hash: typings.antlr4.miscHashCodeMod.default): Unit = js.native
  }
}
