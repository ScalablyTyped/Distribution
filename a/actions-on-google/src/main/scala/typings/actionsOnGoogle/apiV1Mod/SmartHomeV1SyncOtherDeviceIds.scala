package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1SyncOtherDeviceIds extends js.Object {
  
  var agentId: js.UndefOr[String] = js.native
  
  var deviceId: String = js.native
}
object SmartHomeV1SyncOtherDeviceIds {
  
  @scala.inline
  def apply(deviceId: String): SmartHomeV1SyncOtherDeviceIds = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncOtherDeviceIds]
  }
  
  @scala.inline
  implicit class SmartHomeV1SyncOtherDeviceIdsOps[Self <: SmartHomeV1SyncOtherDeviceIds] (val x: Self) extends AnyVal {
    
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
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentId(value: String): Self = this.set("agentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentId: Self = this.set("agentId", js.undefined)
  }
}
