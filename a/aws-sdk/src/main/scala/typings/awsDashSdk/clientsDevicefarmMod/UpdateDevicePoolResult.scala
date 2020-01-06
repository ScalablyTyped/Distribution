package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDevicePoolResult extends js.Object {
  /**
    * The device pool you just updated.
    */
  var devicePool: js.UndefOr[DevicePool] = js.native
}

object UpdateDevicePoolResult {
  @scala.inline
  def apply(devicePool: DevicePool = null): UpdateDevicePoolResult = {
    val __obj = js.Dynamic.literal()
    if (devicePool != null) __obj.updateDynamic("devicePool")(devicePool.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDevicePoolResult]
  }
}

