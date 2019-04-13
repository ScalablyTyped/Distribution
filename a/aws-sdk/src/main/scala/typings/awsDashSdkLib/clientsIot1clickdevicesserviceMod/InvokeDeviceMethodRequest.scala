package typings
package awsDashSdkLib.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokeDeviceMethodRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: __string
  /**
    * The device method to invoke.
    */
  var DeviceMethod: js.UndefOr[DeviceMethod] = js.undefined
  /**
    * A JSON encoded string containing the device method request parameters.
    */
  var DeviceMethodParameters: js.UndefOr[__string] = js.undefined
}

object InvokeDeviceMethodRequest {
  @scala.inline
  def apply(DeviceId: __string, DeviceMethod: DeviceMethod = null, DeviceMethodParameters: __string = null): InvokeDeviceMethodRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId)
    if (DeviceMethod != null) __obj.updateDynamic("DeviceMethod")(DeviceMethod)
    if (DeviceMethodParameters != null) __obj.updateDynamic("DeviceMethodParameters")(DeviceMethodParameters)
    __obj.asInstanceOf[InvokeDeviceMethodRequest]
  }
}

