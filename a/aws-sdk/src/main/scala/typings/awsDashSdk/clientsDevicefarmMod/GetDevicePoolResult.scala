package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDevicePoolResult extends js.Object {
  /**
    * An object containing information about the requested device pool.
    */
  var devicePool: js.UndefOr[DevicePool] = js.undefined
}

object GetDevicePoolResult {
  @scala.inline
  def apply(devicePool: DevicePool = null): GetDevicePoolResult = {
    val __obj = js.Dynamic.literal()
    if (devicePool != null) __obj.updateDynamic("devicePool")(devicePool)
    __obj.asInstanceOf[GetDevicePoolResult]
  }
}

