package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDevicePoolResult extends js.Object {
  /**
    * The device pool you just updated.
    */
  var devicePool: js.UndefOr[DevicePool] = js.undefined
}

object UpdateDevicePoolResult {
  @scala.inline
  def apply(devicePool: DevicePool = null): UpdateDevicePoolResult = {
    val __obj = js.Dynamic.literal()
    if (devicePool != null) __obj.updateDynamic("devicePool")(devicePool)
    __obj.asInstanceOf[UpdateDevicePoolResult]
  }
}

