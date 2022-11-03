package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionRangeTransitionMod {
  
  @JSImport("antlr4/transition/RangeTransition", JSImport.Default)
  @js.native
  open class default protected () extends RangeTransition {
    def this(target: typings.antlr4.stateAtnstateMod.default, start: Double, stop: Double) = this()
  }
  
  @js.native
  trait RangeTransition
    extends typings.antlr4.transitionTransitionMod.default {
    
    val label: typings.antlr4.miscIntervalSetMod.default = js.native
    
    def makeLabel(): typings.antlr4.miscIntervalSetMod.default = js.native
    
    def matches(symbol: Double, minVocabSymbol: Double, maxVocabSymbol: Double): Boolean = js.native
    
    val serializationType: Double = js.native
    
    val start: Double = js.native
    
    val stop: Double = js.native
  }
}
