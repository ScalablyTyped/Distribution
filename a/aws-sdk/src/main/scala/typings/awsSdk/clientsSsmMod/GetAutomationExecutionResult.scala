package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAutomationExecutionResult extends StObject {
  
  /**
    * Detailed information about the current state of an automation execution.
    */
  var AutomationExecution: js.UndefOr[typings.awsSdk.clientsSsmMod.AutomationExecution] = js.undefined
}
object GetAutomationExecutionResult {
  
  inline def apply(): GetAutomationExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAutomationExecutionResult]
  }
  
  extension [Self <: GetAutomationExecutionResult](x: Self) {
    
    inline def setAutomationExecution(value: AutomationExecution): Self = StObject.set(x, "AutomationExecution", value.asInstanceOf[js.Any])
    
    inline def setAutomationExecutionUndefined: Self = StObject.set(x, "AutomationExecution", js.undefined)
  }
}
