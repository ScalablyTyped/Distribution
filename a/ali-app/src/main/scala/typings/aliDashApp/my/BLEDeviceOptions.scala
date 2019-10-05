package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BLEDeviceOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙设备id
  		 */
  var deviceId: String
}

object BLEDeviceOptions {
  @scala.inline
  def apply(
    deviceId: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): BLEDeviceOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[BLEDeviceOptions]
  }
}

