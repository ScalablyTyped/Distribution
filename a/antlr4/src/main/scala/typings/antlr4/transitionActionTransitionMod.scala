package typings.antlr4

import typings.antlr4.antlr4Booleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionActionTransitionMod {
  
  @JSImport("antlr4/transition/ActionTransition", JSImport.Default)
  @js.native
  open class default protected () extends ActionTransition {
    def this(
      target: typings.antlr4.stateAtnstateMod.default,
      ruleIndex: Double,
      actionIndex: Double,
      isCtxDependent: Boolean
    ) = this()
  }
  
  @js.native
  trait ActionTransition
    extends typings.antlr4.transitionTransitionMod.default {
    
    val actionIndex: Double = js.native
    
    val isCtxDependent: Boolean = js.native
    
    def matches(symbol: Double, minVocabSymbol: Double, maxVocabSymbol: Double): `false` = js.native
    
    val ruleIndex: Double = js.native
    
    val serializationType: Double = js.native
  }
}
