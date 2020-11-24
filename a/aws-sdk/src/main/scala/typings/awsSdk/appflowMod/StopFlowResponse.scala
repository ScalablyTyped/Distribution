package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopFlowResponse extends js.Object {
  
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
  implicit class StopFlowResponseOps[Self <: StopFlowResponse] (val x: Self) extends AnyVal {
    
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
    def setFlowArn(value: FlowArn): Self = this.set("flowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowArn: Self = this.set("flowArn", js.undefined)
    
    @scala.inline
    def setFlowStatus(value: FlowStatus): Self = this.set("flowStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowStatus: Self = this.set("flowStatus", js.undefined)
  }
}
