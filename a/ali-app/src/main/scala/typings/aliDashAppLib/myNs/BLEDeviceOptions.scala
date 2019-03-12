package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BLEDeviceOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙设备id
  		 */
  var deviceId: java.lang.String
}

object BLEDeviceOptions {
  @scala.inline
  def apply(
    deviceId: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): BLEDeviceOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[BLEDeviceOptions]
  }
}

