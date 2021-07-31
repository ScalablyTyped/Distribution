package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFlowResponse extends StObject {
  
  /**
    *  The flow's Amazon Resource Name (ARN). 
    */
  var flowArn: js.UndefOr[FlowArn] = js.undefined
  
  /**
    *  Indicates the current status of the flow. 
    */
  var flowStatus: js.UndefOr[FlowStatus] = js.undefined
}
object CreateFlowResponse {
  
  @scala.inline
  def apply(): CreateFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFlowResponse]
  }
  
  @scala.inline
  implicit class CreateFlowResponseMutableBuilder[Self <: CreateFlowResponse] (val x: Self) extends AnyVal {
    
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
