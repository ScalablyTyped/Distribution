package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceEvent extends js.Object {
  /**
    * The time (in epoch) when the event occurred. 
    */
  var Timestamp: js.UndefOr[DeviceEventTime] = js.native
  /**
    * The type of device event.
    */
  var Type: js.UndefOr[DeviceEventType] = js.native
  /**
    * The value of the event.
    */
  var Value: js.UndefOr[DeviceEventValue] = js.native
}

object DeviceEvent {
  @scala.inline
  def apply(Timestamp: DeviceEventTime = null, Type: DeviceEventType = null, Value: DeviceEventValue = null): DeviceEvent = {
    val __obj = js.Dynamic.literal()
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceEvent]
  }
}

