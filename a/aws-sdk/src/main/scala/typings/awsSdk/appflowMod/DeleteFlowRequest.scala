package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFlowRequest extends js.Object {
  
  /**
    *  The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only. 
    */
  var flowName: FlowName = js.native
  
  /**
    *  Indicates whether Amazon AppFlow should delete the flow, even if it is currently in use. 
    */
  var forceDelete: js.UndefOr[Boolean] = js.native
}
object DeleteFlowRequest {
  
  @scala.inline
  def apply(flowName: FlowName): DeleteFlowRequest = {
    val __obj = js.Dynamic.literal(flowName = flowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFlowRequest]
  }
  
  @scala.inline
  implicit class DeleteFlowRequestOps[Self <: DeleteFlowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFlowName(value: FlowName): Self = this.set("flowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDelete(value: Boolean): Self = this.set("forceDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceDelete: Self = this.set("forceDelete", js.undefined)
  }
}
