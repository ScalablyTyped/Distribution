package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelFlowExecutionsRequest extends StObject {
  
  /**
    * The ID of each active run to cancel. These runs must belong to the flow you specify in your request. If you omit this parameter, your request ends all active runs that belong to the flow.
    */
  var executionIds: js.UndefOr[ExecutionIds] = js.undefined
  
  /**
    * The name of a flow with active runs that you want to cancel.
    */
  var flowName: FlowName
}
object CancelFlowExecutionsRequest {
  
  inline def apply(flowName: FlowName): CancelFlowExecutionsRequest = {
    val __obj = js.Dynamic.literal(flowName = flowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelFlowExecutionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelFlowExecutionsRequest] (val x: Self) extends AnyVal {
    
    inline def setExecutionIds(value: ExecutionIds): Self = StObject.set(x, "executionIds", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdsUndefined: Self = StObject.set(x, "executionIds", js.undefined)
    
    inline def setExecutionIdsVarargs(value: ExecutionId*): Self = StObject.set(x, "executionIds", js.Array(value*))
    
    inline def setFlowName(value: FlowName): Self = StObject.set(x, "flowName", value.asInstanceOf[js.Any])
  }
}
