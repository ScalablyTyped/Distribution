package typings.antlr4

import typings.antlr4.antlr4Booleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionRuleTransitionMod {
  
  @JSImport("antlr4/transition/RuleTransition", JSImport.Default)
  @js.native
  open class default protected () extends RuleTransition {
    def this(
      ruleStart: typings.antlr4.stateRuleStartStateMod.default,
      ruleIndex: Double,
      precedence: Double,
      followState: typings.antlr4.stateAtnstateMod.default
    ) = this()
  }
  
  @js.native
  trait RuleTransition
    extends typings.antlr4.transitionTransitionMod.default {
    
    var followState: typings.antlr4.stateAtnstateMod.default = js.native
    
    def matches(symbol: Double, minVocabSymbol: Double, maxVocabSymbol: Double): `false` = js.native
    
    val precedence: Double = js.native
    
    val ruleIndex: Double = js.native
    
    val serializationType: Double = js.native
  }
}
