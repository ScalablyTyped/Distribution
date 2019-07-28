package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokeDeviceMethodResponse extends js.Object {
  /**
    * A JSON encoded string containing the device method response.
    */
  var DeviceMethodResponse: js.UndefOr[__string] = js.undefined
}

object InvokeDeviceMethodResponse {
  @scala.inline
  def apply(DeviceMethodResponse: __string = null): InvokeDeviceMethodResponse = {
    val __obj = js.Dynamic.literal()
    if (DeviceMethodResponse != null) __obj.updateDynamic("DeviceMethodResponse")(DeviceMethodResponse)
    __obj.asInstanceOf[InvokeDeviceMethodResponse]
  }
}

