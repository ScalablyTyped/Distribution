package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /**
    * The user specified attributes associated with the device for an event.
    */
  var Attributes: js.UndefOr[typings.awsDashSdk.clientsIot1clickdevicesserviceMod.Attributes] = js.undefined
  /**
    * The unique identifier of the device.
    */
  var DeviceId: js.UndefOr[__string] = js.undefined
  /**
    * The device type, such as "button".
    */
  var Type: js.UndefOr[__string] = js.undefined
}

object Device {
  @scala.inline
  def apply(Attributes: Attributes = null, DeviceId: __string = null, Type: __string = null): Device = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[Device]
  }
}

