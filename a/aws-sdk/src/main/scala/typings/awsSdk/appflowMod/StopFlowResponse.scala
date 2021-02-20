package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopFlowResponse extends StObject {
  
  /**
    *  The flow's Amazon Resource Name (ARN). 
    */
  var flowArn: js.UndefOr[FlowArn] = js.native
  
  /**
    *  Indicates the current status of the flow. 
    */
  var flowStatus: js.UndefOr[FlowStatus] = js.native
}
object StopFlowResponse {
  
  @scala.inline
  def apply(): StopFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopFlowResponse]
  }
  
  @scala.inline
  implicit class StopFlowResponseMutableBuilder[Self <: StopFlowResponse] (val x: Self) extends AnyVal {
    
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
