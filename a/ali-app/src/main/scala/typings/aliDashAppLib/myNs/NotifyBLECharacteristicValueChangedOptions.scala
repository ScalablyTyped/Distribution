package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyBLECharacteristicValueChangedOptions
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
  		 * 蓝牙特征值对应服务的 uuid
  		 */
  var serviceId: java.lang.String
  /**
  		 * true: 启用 notify; false: 停用 notify
  		 */
  var state: scala.Boolean
  @JSName("success")
  def success_MNotifyBLECharacteristicValueChangedOptions(res: ErrMsgResponse): scala.Unit
}

object NotifyBLECharacteristicValueChangedOptions {
  @scala.inline
  def apply(
    characteristicId: java.lang.String,
    deviceId: java.lang.String,
    serviceId: java.lang.String,
    state: scala.Boolean,
    success: js.Function1[ErrMsgResponse, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    descriptorId: java.lang.String = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): NotifyBLECharacteristicValueChangedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("characteristicId")(characteristicId)
    __obj.updateDynamic("deviceId")(deviceId)
    __obj.updateDynamic("serviceId")(serviceId)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (descriptorId != null) __obj.updateDynamic("descriptorId")(descriptorId)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[NotifyBLECharacteristicValueChangedOptions]
  }
}

