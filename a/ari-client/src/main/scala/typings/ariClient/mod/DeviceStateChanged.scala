package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceStateChanged extends Event {
  /**
    * Device state object.
    */
  var device_state: DeviceState = js.native
}

object DeviceStateChanged {
  @scala.inline
  def apply(application: String, device_state: DeviceState, timestamp: Date, `type`: String): DeviceStateChanged = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], device_state = device_state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceStateChanged]
  }
  @scala.inline
  implicit class DeviceStateChangedOps[Self <: DeviceStateChanged] (val x: Self) extends AnyVal {
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
    def setDevice_state(value: DeviceState): Self = this.set("device_state", value.asInstanceOf[js.Any])
  }
  
}

