package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionWildcardTransitionMod {
  
  @JSImport("antlr4/transition/WildcardTransition", JSImport.Default)
  @js.native
  open class default () extends WildcardTransition
  
  @js.native
  trait WildcardTransition
    extends typings.antlr4.transitionTransitionMod.default {
    
    def matches(symbol: Double, minVocabSymbol: Double, maxVocabSymbol: Double): Boolean = js.native
    
    val serializationType: Double = js.native
  }
}
