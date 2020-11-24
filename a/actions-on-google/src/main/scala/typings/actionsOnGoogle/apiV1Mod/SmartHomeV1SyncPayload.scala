package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1SyncPayload extends js.Object {
  
  var agentUserId: js.UndefOr[String] = js.native
  
  var debugString: js.UndefOr[String] = js.native
  
  var devices: js.Array[SmartHomeV1SyncDevices] = js.native
  
  var errorCode: js.UndefOr[String] = js.native
}
object SmartHomeV1SyncPayload {
  
  @scala.inline
  def apply(devices: js.Array[SmartHomeV1SyncDevices]): SmartHomeV1SyncPayload = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncPayload]
  }
  
  @scala.inline
  implicit class SmartHomeV1SyncPayloadOps[Self <: SmartHomeV1SyncPayload] (val x: Self) extends AnyVal {
    
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
    def setDevicesVarargs(value: SmartHomeV1SyncDevices*): Self = this.set("devices", js.Array(value :_*))
    
    @scala.inline
    def setDevices(value: js.Array[SmartHomeV1SyncDevices]): Self = this.set("devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentUserId(value: String): Self = this.set("agentUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentUserId: Self = this.set("agentUserId", js.undefined)
    
    @scala.inline
    def setDebugString(value: String): Self = this.set("debugString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugString: Self = this.set("debugString", js.undefined)
    
    @scala.inline
    def setErrorCode(value: String): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
  }
}
