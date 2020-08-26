package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceState extends js.Object {
  var deviceName: String = js.native
  var deviceState: String = js.native
}

object DeviceState {
  @scala.inline
  def apply(deviceName: String, deviceState: String): DeviceState = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceState = deviceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceState]
  }
  @scala.inline
  implicit class DeviceStateOps[Self <: DeviceState] (val x: Self) extends AnyVal {
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
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceState(value: String): Self = this.set("deviceState", value.asInstanceOf[js.Any])
  }
  
}

