package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeDeviceMethodRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: __string = js.native
  /**
    * The device method to invoke.
    */
  var DeviceMethod: js.UndefOr[typings.awsDashSdk.clientsIot1clickdevicesserviceMod.DeviceMethod] = js.native
  /**
    * A JSON encoded string containing the device method request parameters.
    */
  var DeviceMethodParameters: js.UndefOr[__string] = js.native
}

object InvokeDeviceMethodRequest {
  @scala.inline
  def apply(DeviceId: __string, DeviceMethod: DeviceMethod = null, DeviceMethodParameters: __string = null): InvokeDeviceMethodRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any])
    if (DeviceMethod != null) __obj.updateDynamic("DeviceMethod")(DeviceMethod.asInstanceOf[js.Any])
    if (DeviceMethodParameters != null) __obj.updateDynamic("DeviceMethodParameters")(DeviceMethodParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeDeviceMethodRequest]
  }
}

