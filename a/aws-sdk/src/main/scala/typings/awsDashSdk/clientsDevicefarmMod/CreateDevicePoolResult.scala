package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDevicePoolResult extends js.Object {
  /**
    * The newly created device pool.
    */
  var devicePool: js.UndefOr[DevicePool] = js.undefined
}

object CreateDevicePoolResult {
  @scala.inline
  def apply(devicePool: DevicePool = null): CreateDevicePoolResult = {
    val __obj = js.Dynamic.literal()
    if (devicePool != null) __obj.updateDynamic("devicePool")(devicePool)
    __obj.asInstanceOf[CreateDevicePoolResult]
  }
}

