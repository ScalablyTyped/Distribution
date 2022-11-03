package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateRuleStartStateMod {
  
  @JSImport("antlr4/state/RuleStartState", JSImport.Default)
  @js.native
  open class default () extends RuleStartState
  
  @js.native
  trait RuleStartState
    extends typings.antlr4.stateAtnstateMod.default {
    
    var isPrecedenceRule: Boolean = js.native
    
    @JSName("stateType")
    var stateType_RuleStartState: Double = js.native
    
    var stopState: typings.antlr4.stateRuleStopStateMod.default = js.native
  }
}
