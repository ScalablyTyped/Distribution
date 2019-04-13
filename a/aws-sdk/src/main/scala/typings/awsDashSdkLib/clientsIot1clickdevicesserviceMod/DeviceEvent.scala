package typings
package awsDashSdkLib.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceEvent extends js.Object {
  /**
    * An object representing the device associated with the event.
    */
  var Device: js.UndefOr[Device] = js.undefined
  /**
    * A serialized JSON object representing the device-type specific event.
    */
  var StdEvent: js.UndefOr[__string] = js.undefined
}

object DeviceEvent {
  @scala.inline
  def apply(Device: Device = null, StdEvent: __string = null): DeviceEvent = {
    val __obj = js.Dynamic.literal()
    if (Device != null) __obj.updateDynamic("Device")(Device)
    if (StdEvent != null) __obj.updateDynamic("StdEvent")(StdEvent)
    __obj.asInstanceOf[DeviceEvent]
  }
}

