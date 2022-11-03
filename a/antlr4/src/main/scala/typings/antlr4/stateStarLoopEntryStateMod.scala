package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateStarLoopEntryStateMod {
  
  @JSImport("antlr4/state/StarLoopEntryState", JSImport.Default)
  @js.native
  open class default () extends StarLoopEntryState
  
  @js.native
  trait StarLoopEntryState
    extends typings.antlr4.stateDecisionStateMod.default {
    
    var isPrecedenceDecision: Boolean | Null = js.native
    
    var loopBackState: typings.antlr4.stateStarLoopbackStateMod.default | Null = js.native
    
    @JSName("stateType")
    var stateType_StarLoopEntryState: Double = js.native
  }
}
