package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFlowResponse extends js.Object {
  
  /**
    * Indicates the current status of the flow. 
    */
  var flowStatus: js.UndefOr[FlowStatus] = js.native
}
object UpdateFlowResponse {
  
  @scala.inline
  def apply(): UpdateFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowResponse]
  }
  
  @scala.inline
  implicit class UpdateFlowResponseOps[Self <: UpdateFlowResponse] (val x: Self) extends AnyVal {
    
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
    def setFlowStatus(value: FlowStatus): Self = this.set("flowStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowStatus: Self = this.set("flowStatus", js.undefined)
  }
}
