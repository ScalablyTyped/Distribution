package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeviceResult extends js.Object {
  /**
    * An object containing information about the requested device.
    */
  var device: js.UndefOr[Device] = js.undefined
}

object GetDeviceResult {
  @scala.inline
  def apply(device: Device = null): GetDeviceResult = {
    val __obj = js.Dynamic.literal()
    if (device != null) __obj.updateDynamic("device")(device)
    __obj.asInstanceOf[GetDeviceResult]
  }
}

