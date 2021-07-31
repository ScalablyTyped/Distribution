package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFlowRequest extends StObject {
  
  /**
    *  The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only. 
    */
  var flowName: FlowName
}
object StartFlowRequest {
  
  @scala.inline
  def apply(flowName: FlowName): StartFlowRequest = {
    val __obj = js.Dynamic.literal(flowName = flowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFlowRequest]
  }
  
  @scala.inline
  implicit class StartFlowRequestMutableBuilder[Self <: StartFlowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowName(value: FlowName): Self = StObject.set(x, "flowName", value.asInstanceOf[js.Any])
  }
}
