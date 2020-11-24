package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1QueryRequestPayload extends js.Object {
  
  var devices: js.Array[SmartHomeV1QueryRequestDevices] = js.native
}
object SmartHomeV1QueryRequestPayload {
  
  @scala.inline
  def apply(devices: js.Array[SmartHomeV1QueryRequestDevices]): SmartHomeV1QueryRequestPayload = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryRequestPayload]
  }
  
  @scala.inline
  implicit class SmartHomeV1QueryRequestPayloadOps[Self <: SmartHomeV1QueryRequestPayload] (val x: Self) extends AnyVal {
    
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
    def setDevicesVarargs(value: SmartHomeV1QueryRequestDevices*): Self = this.set("devices", js.Array(value :_*))
    
    @scala.inline
    def setDevices(value: js.Array[SmartHomeV1QueryRequestDevices]): Self = this.set("devices", value.asInstanceOf[js.Any])
  }
}
