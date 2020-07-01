package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceStateChanged extends Event {
  /**
    * Device state object.
    */
  var device_state: DeviceState
}

object DeviceStateChanged {
  @scala.inline
  def apply(
    application: String,
    device_state: DeviceState,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null
  ): DeviceStateChanged = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], device_state = device_state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceStateChanged]
  }
}

