package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceInstanceResult extends js.Object {
  /**
    * An object that contains information about your device instance.
    */
  var deviceInstance: js.UndefOr[DeviceInstance] = js.native
}

object GetDeviceInstanceResult {
  @scala.inline
  def apply(deviceInstance: DeviceInstance = null): GetDeviceInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (deviceInstance != null) __obj.updateDynamic("deviceInstance")(deviceInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceInstanceResult]
  }
}

