package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  var deviceId: String = js.native
  var supportedInterfaces: DeviceInterfaces = js.native
}

object Device {
  @scala.inline
  def apply(deviceId: String, supportedInterfaces: DeviceInterfaces): Device = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], supportedInterfaces = supportedInterfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
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
    def setSupportedInterfaces(value: DeviceInterfaces): Self = this.set("supportedInterfaces", value.asInstanceOf[js.Any])
  }
  
}

