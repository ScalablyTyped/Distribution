package typings.aliDashApp.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyBLECharacteristicValueChangeOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙特征值的 uuid
  		 */
  var characteristicId: String
  /**
  		 * notify 的 descriptor 的 uuid （只有android 会用到，非必填，默认值00002902-0000-10008000-00805f9b34fb）
  		 */
  var descriptorId: js.UndefOr[String] = js.undefined
  /**
  		 * 蓝牙设备 id，参考 device 对象
  		 */
  var deviceId: String
  /**
  		 * 蓝牙特征值对应 service 的 uuid
  		 */
  var serviceId: String
  /**
  		 * 是否启用notify或indicate
  		 */
  var state: js.UndefOr[Boolean] = js.undefined
}

object NotifyBLECharacteristicValueChangeOptions {
  @scala.inline
  def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    complete: /* res */ js.Any => Unit = null,
    descriptorId: String = null,
    fail: js.Any => Unit = null,
    state: js.UndefOr[Boolean] = js.undefined,
    success: js.Any => Unit = null
  ): NotifyBLECharacteristicValueChangeOptions = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId, deviceId = deviceId, serviceId = serviceId)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (descriptorId != null) __obj.updateDynamic("descriptorId")(descriptorId)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[NotifyBLECharacteristicValueChangeOptions]
  }
}

