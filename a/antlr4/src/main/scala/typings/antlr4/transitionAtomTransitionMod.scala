package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionAtomTransitionMod {
  
  @JSImport("antlr4/transition/AtomTransition", JSImport.Default)
  @js.native
  open class default protected () extends AtomTransition {
    def this(target: typings.antlr4.stateAtnstateMod.default, label: Double) = this()
  }
  
  @js.native
  trait AtomTransition
    extends typings.antlr4.transitionTransitionMod.default {
    
    val label: typings.antlr4.miscIntervalSetMod.default = js.native
    
    def makeLabel(): typings.antlr4.miscIntervalSetMod.default = js.native
    
    def matches(symbol: Double, minVocabSymbol: Double, maxVocabSymbol: Double): Boolean = js.native
    
    val serializationType: Double = js.native
  }
}
