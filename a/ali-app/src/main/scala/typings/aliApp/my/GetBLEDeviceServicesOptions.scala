package typings.aliApp.my

import typings.aliApp.servicesArrayserviceIdstr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBLEDeviceServicesOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙设备 id，参考 device 对象
  		 */
  var deviceId: String
  /**
  		 * 成功则返回本机蓝牙适配器状态
  		 */
  @JSName("success")
  def success_MGetBLEDeviceServicesOptions(res: servicesArrayserviceIdstr): Unit
}

object GetBLEDeviceServicesOptions {
  @scala.inline
  def apply(
    deviceId: String,
    success: servicesArrayserviceIdstr => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetBLEDeviceServicesOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetBLEDeviceServicesOptions]
  }
}

