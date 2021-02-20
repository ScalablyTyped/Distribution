package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartFlowResponse extends StObject {
  
  /**
    *  Returns the internal execution ID of an on-demand flow when the flow is started. For scheduled or event-triggered flows, this value is null. 
    */
  var executionId: js.UndefOr[ExecutionId] = js.native
  
  /**
    *  The flow's Amazon Resource Name (ARN). 
    */
  var flowArn: js.UndefOr[FlowArn] = js.native
  
  /**
    *  Indicates the current status of the flow. 
    */
  var flowStatus: js.UndefOr[FlowStatus] = js.native
}
object StartFlowResponse {
  
  @scala.inline
  def apply(): StartFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartFlowResponse]
  }
  
  @scala.inline
  implicit class StartFlowResponseMutableBuilder[Self <: StartFlowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionId(value: ExecutionId): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    @scala.inline
    def setFlowArn(value: FlowArn): Self = StObject.set(x, "flowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowArnUndefined: Self = StObject.set(x, "flowArn", js.undefined)
    
    @scala.inline
    def setFlowStatus(value: FlowStatus): Self = StObject.set(x, "flowStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowStatusUndefined: Self = StObject.set(x, "flowStatus", js.undefined)
  }
}
