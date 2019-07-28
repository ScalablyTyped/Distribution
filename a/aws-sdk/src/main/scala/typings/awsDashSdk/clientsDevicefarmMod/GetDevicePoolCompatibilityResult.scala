package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDevicePoolCompatibilityResult extends js.Object {
  /**
    * Information about compatible devices.
    */
  var compatibleDevices: js.UndefOr[DevicePoolCompatibilityResults] = js.undefined
  /**
    * Information about incompatible devices.
    */
  var incompatibleDevices: js.UndefOr[DevicePoolCompatibilityResults] = js.undefined
}

object GetDevicePoolCompatibilityResult {
  @scala.inline
  def apply(
    compatibleDevices: DevicePoolCompatibilityResults = null,
    incompatibleDevices: DevicePoolCompatibilityResults = null
  ): GetDevicePoolCompatibilityResult = {
    val __obj = js.Dynamic.literal()
    if (compatibleDevices != null) __obj.updateDynamic("compatibleDevices")(compatibleDevices)
    if (incompatibleDevices != null) __obj.updateDynamic("incompatibleDevices")(incompatibleDevices)
    __obj.asInstanceOf[GetDevicePoolCompatibilityResult]
  }
}

