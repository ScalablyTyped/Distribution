package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteBLECharacteristicValueOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙特征值的 uuid
  		 */
  var characteristicId: java.lang.String
  /**
  		 * 蓝牙设备 id，参考 device 对象
  		 */
  var deviceId: java.lang.String
  /**
  		 * 蓝牙特征值对应服务的 uuid
  		 */
  var serviceId: java.lang.String
  /**
  		 * 蓝牙设备特征值对应的值，16进制字符串，限制在20字节内
  		 */
  var value: java.lang.String
}

object WriteBLECharacteristicValueOptions {
  @scala.inline
  def apply(
    characteristicId: java.lang.String,
    deviceId: java.lang.String,
    serviceId: java.lang.String,
    value: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): WriteBLECharacteristicValueOptions = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId, deviceId = deviceId, serviceId = serviceId, value = value)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[WriteBLECharacteristicValueOptions]
  }
}

