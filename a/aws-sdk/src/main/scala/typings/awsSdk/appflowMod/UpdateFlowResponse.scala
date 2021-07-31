package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlowResponse extends StObject {
  
  /**
    * Indicates the current status of the flow. 
    */
  var flowStatus: js.UndefOr[FlowStatus] = js.undefined
}
object UpdateFlowResponse {
  
  @scala.inline
  def apply(): UpdateFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowResponse]
  }
  
  @scala.inline
  implicit class UpdateFlowResponseMutableBuilder[Self <: UpdateFlowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowStatus(value: FlowStatus): Self = StObject.set(x, "flowStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowStatusUndefined: Self = StObject.set(x, "flowStatus", js.undefined)
  }
}
