package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.anon.Devices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1ReportStateRequest extends js.Object {
  
  var agentUserId: String = js.native
  
  var payload: Devices = js.native
  
  var requestId: String = js.native
}
object SmartHomeV1ReportStateRequest {
  
  @scala.inline
  def apply(agentUserId: String, payload: Devices, requestId: String): SmartHomeV1ReportStateRequest = {
    val __obj = js.Dynamic.literal(agentUserId = agentUserId.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ReportStateRequest]
  }
  
  @scala.inline
  implicit class SmartHomeV1ReportStateRequestOps[Self <: SmartHomeV1ReportStateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgentUserId(value: String): Self = this.set("agentUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Devices): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
}
