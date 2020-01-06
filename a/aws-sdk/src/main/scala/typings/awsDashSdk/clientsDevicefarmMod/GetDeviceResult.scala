package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceResult extends js.Object {
  /**
    * An object that contains information about the requested device.
    */
  var device: js.UndefOr[Device] = js.native
}

object GetDeviceResult {
  @scala.inline
  def apply(device: Device = null): GetDeviceResult = {
    val __obj = js.Dynamic.literal()
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceResult]
  }
}

