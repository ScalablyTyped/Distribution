package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceEvent extends js.Object {
  /**
    * The time (in epoch) when the event occurred. 
    */
  var Timestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The type of device event.
    */
  var Type: js.UndefOr[DeviceEventType] = js.undefined
  /**
    * The value of the event.
    */
  var Value: js.UndefOr[DeviceEventValue] = js.undefined
}

object DeviceEvent {
  @scala.inline
  def apply(Timestamp: Timestamp = null, Type: DeviceEventType = null, Value: DeviceEventValue = null): DeviceEvent = {
    val __obj = js.Dynamic.literal()
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[DeviceEvent]
  }
}

