package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateDecisionStateMod {
  
  @JSImport("antlr4/state/DecisionState", JSImport.Default)
  @js.native
  open class default () extends DecisionState
  
  @js.native
  trait DecisionState
    extends typings.antlr4.stateAtnstateMod.default {
    
    var decision: Double = js.native
    
    var nonGreedy: Boolean = js.native
  }
}
