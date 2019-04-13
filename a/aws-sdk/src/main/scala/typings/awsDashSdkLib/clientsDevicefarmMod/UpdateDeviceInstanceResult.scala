package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDeviceInstanceResult extends js.Object {
  /**
    * An object containing information about your device instance.
    */
  var deviceInstance: js.UndefOr[DeviceInstance] = js.undefined
}

object UpdateDeviceInstanceResult {
  @scala.inline
  def apply(deviceInstance: DeviceInstance = null): UpdateDeviceInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (deviceInstance != null) __obj.updateDynamic("deviceInstance")(deviceInstance)
    __obj.asInstanceOf[UpdateDeviceInstanceResult]
  }
}

