package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionSetTransitionMod {
  
  @JSImport("antlr4/transition/SetTransition", JSImport.Default)
  @js.native
  open class default protected () extends SetTransition {
    def this(target: typings.antlr4.stateAtnstateMod.default, set: typings.antlr4.miscIntervalSetMod.default) = this()
  }
  
  @js.native
  trait SetTransition
    extends typings.antlr4.transitionTransitionMod.default {
    
    def matches(symbol: Double, minVocabSymbol: Double, maxVocabSymbol: Double): Boolean = js.native
    
    val serializationType: Double = js.native
  }
}
