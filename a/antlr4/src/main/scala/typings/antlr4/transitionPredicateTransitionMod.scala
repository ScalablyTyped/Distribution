package typings.antlr4

import typings.antlr4.antlr4Booleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionPredicateTransitionMod {
  
  @JSImport("antlr4/transition/PredicateTransition", JSImport.Default)
  @js.native
  open class default protected () extends PredicateTransition {
    def this(
      target: typings.antlr4.stateAtnstateMod.default,
      ruleIndex: Double,
      predIndex: Double,
      isCtxDependent: Boolean
    ) = this()
  }
  
  @js.native
  trait PredicateTransition
    extends typings.antlr4.atnAbstractPredicateTransitionMod.default {
    
    def getPredicate(): typings.antlr4.atnPredicateMod.default = js.native
    
    val isCtxDependent: Boolean = js.native
    
    def matches(symbol: Double, minVocabSymbol: Double, maxVocabSymbol: Double): `false` = js.native
    
    val predIndex: Double = js.native
    
    val ruleIndex: Double = js.native
    
    val serializationType: Double = js.native
  }
}
