package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceSelectionResult extends js.Object {
  /**
    * The filters in a device selection result.
    */
  var filters: js.UndefOr[DeviceFilters] = js.undefined
  /**
    * The number of devices that matched the device filter selection criteria.
    */
  var matchedDevicesCount: js.UndefOr[Integer] = js.undefined
  /**
    * The maximum number of devices to be selected by a device filter and included in a test run.
    */
  var maxDevices: js.UndefOr[Integer] = js.undefined
}

object DeviceSelectionResult {
  @scala.inline
  def apply(
    filters: DeviceFilters = null,
    matchedDevicesCount: js.UndefOr[Integer] = js.undefined,
    maxDevices: js.UndefOr[Integer] = js.undefined
  ): DeviceSelectionResult = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(matchedDevicesCount)) __obj.updateDynamic("matchedDevicesCount")(matchedDevicesCount)
    if (!js.isUndefined(maxDevices)) __obj.updateDynamic("maxDevices")(maxDevices)
    __obj.asInstanceOf[DeviceSelectionResult]
  }
}

