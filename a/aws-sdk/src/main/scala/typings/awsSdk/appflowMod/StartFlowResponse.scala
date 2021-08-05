package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFlowResponse extends StObject {
  
  /**
    *  Returns the internal execution ID of an on-demand flow when the flow is started. For scheduled or event-triggered flows, this value is null. 
    */
  var executionId: js.UndefOr[ExecutionId] = js.undefined
  
  /**
    *  The flow's Amazon Resource Name (ARN). 
    */
  var flowArn: js.UndefOr[FlowArn] = js.undefined
  
  /**
    *  Indicates the current status of the flow. 
    */
  var flowStatus: js.UndefOr[FlowStatus] = js.undefined
}
object StartFlowResponse {
  
  inline def apply(): StartFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartFlowResponse]
  }
  
  extension [Self <: StartFlowResponse](x: Self) {
    
    inline def setExecutionId(value: ExecutionId): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setFlowArn(value: FlowArn): Self = StObject.set(x, "flowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "flowArn", js.undefined)
    
    inline def setFlowStatus(value: FlowStatus): Self = StObject.set(x, "flowStatus", value.asInstanceOf[js.Any])
    
    inline def setFlowStatusUndefined: Self = StObject.set(x, "flowStatus", js.undefined)
  }
}
