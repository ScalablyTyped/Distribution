package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyBLECharacteristicValueChangeOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙特征值的 uuid
  		 */
  var characteristicId: java.lang.String
  /**
  		 * notify 的 descriptor 的 uuid （只有android 会用到，非必填，默认值00002902-0000-10008000-00805f9b34fb）
  		 */
  var descriptorId: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 蓝牙设备 id，参考 device 对象
  		 */
  var deviceId: java.lang.String
  /**
  		 * 蓝牙特征值对应 service 的 uuid
  		 */
  var serviceId: java.lang.String
  /**
  		 * 是否启用notify或indicate
  		 */
  var state: js.UndefOr[scala.Boolean] = js.undefined
}

object NotifyBLECharacteristicValueChangeOptions {
  @scala.inline
  def apply(
    characteristicId: java.lang.String,
    deviceId: java.lang.String,
    serviceId: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    descriptorId: java.lang.String = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    state: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function1[js.Any, scala.Unit] = null
  ): NotifyBLECharacteristicValueChangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("characteristicId")(characteristicId)
    __obj.updateDynamic("deviceId")(deviceId)
    __obj.updateDynamic("serviceId")(serviceId)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (descriptorId != null) __obj.updateDynamic("descriptorId")(descriptorId)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[NotifyBLECharacteristicValueChangeOptions]
  }
}

