package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeviceInstanceResult extends js.Object {
  /**
    * An object containing information about your device instance.
    */
  var deviceInstance: js.UndefOr[DeviceInstance] = js.undefined
}

object GetDeviceInstanceResult {
  @scala.inline
  def apply(deviceInstance: DeviceInstance = null): GetDeviceInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (deviceInstance != null) __obj.updateDynamic("deviceInstance")(deviceInstance)
    __obj.asInstanceOf[GetDeviceInstanceResult]
  }
}

