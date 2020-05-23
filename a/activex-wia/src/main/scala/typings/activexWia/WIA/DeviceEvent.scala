package typings.activexWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DeviceEvent object describes an EventID that can be used when calling RegisterEvent or RegisterPersistentEvent on a DeviceManager object. */
trait DeviceEvent extends js.Object {
  /** Returns the event Description */
  val Description: String
  /** Returns the EventID for this Event */
  val EventID: String
  /** Returns the event Name */
  val Name: String
  /** Returns the Type of this Event */
  val Type: WiaEventFlag
  @JSName("WIA.DeviceEvent_typekey")
  var WIADotDeviceEvent_typekey: DeviceEvent
}

object DeviceEvent {
  @scala.inline
  def apply(
    Description: String,
    EventID: String,
    Name: String,
    Type: WiaEventFlag,
    WIADotDeviceEvent_typekey: DeviceEvent
  ): DeviceEvent = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], EventID = EventID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.DeviceEvent_typekey")(WIADotDeviceEvent_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceEvent]
  }
}

