package typings.aliDashApp.my

import typings.aliDashApp.Anon_IsSupportBLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 快速接入 https://docs.alipay.com/mini/api/bluetooth-intro
//#endregion
//#region API https://docs.alipay.com/mini/api/bluetooth-api
trait OpenBluetoothAdapterOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 不传的话默认是true，表示是否在离开当前页面时自动断开蓝牙(仅对android有效) */
  var autoClose: Boolean
  @JSName("success")
  def success_MOpenBluetoothAdapterOptions(res: Anon_IsSupportBLE): Unit
}

object OpenBluetoothAdapterOptions {
  @scala.inline
  def apply(
    autoClose: Boolean,
    success: Anon_IsSupportBLE => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): OpenBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[OpenBluetoothAdapterOptions]
  }
}

