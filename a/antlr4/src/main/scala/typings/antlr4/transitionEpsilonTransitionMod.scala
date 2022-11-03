package typings.antlr4

import typings.antlr4.antlr4Booleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionEpsilonTransitionMod {
  
  @JSImport("antlr4/transition/EpsilonTransition", JSImport.Default)
  @js.native
  open class default protected () extends EpsilonTransition {
    def this(target: typings.antlr4.stateAtnstateMod.default, outermostPrecedenceReturn: Double) = this()
  }
  
  @js.native
  trait EpsilonTransition
    extends typings.antlr4.transitionTransitionMod.default {
    
    def matches(symbol: Double, minVocabSymbol: Double, maxVocabSymbol: Double): `false` = js.native
    
    val outermostPrecedenceReturn: Double = js.native
    
    val serializationType: Double = js.native
  }
}
