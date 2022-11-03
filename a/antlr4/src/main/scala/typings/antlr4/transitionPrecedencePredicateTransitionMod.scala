package typings.antlr4

import typings.antlr4.antlr4Booleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionPrecedencePredicateTransitionMod {
  
  @JSImport("antlr4/transition/PrecedencePredicateTransition", JSImport.Default)
  @js.native
  open class default protected () extends PrecedencePredicateTransition {
    def this(target: typings.antlr4.stateAtnstateMod.default, precedence: Double) = this()
  }
  
  @js.native
  trait PrecedencePredicateTransition
    extends typings.antlr4.atnAbstractPredicateTransitionMod.default {
    
    def getPredicate(): typings.antlr4.atnPrecedencePredicateMod.default = js.native
    
    def matches(symbol: Double, minVocabSymbol: Double, maxVocabSymbol: Double): `false` = js.native
    
    val precedence: Double = js.native
    
    val serializationType: Double = js.native
  }
}
