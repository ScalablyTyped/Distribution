package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 快速接入 https://docs.alipay.com/mini/api/bluetooth-intro
//#endregion
//#region API https://docs.alipay.com/mini/api/bluetooth-api
trait OpenBluetoothAdapterOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 不传的话默认是true，表示是否在离开当前页面时自动断开蓝牙(仅对android有效) */
  var autoClose: scala.Boolean
  @JSName("success")
  def success_MOpenBluetoothAdapterOptions(res: aliDashAppLib.Anon_IsSupportBLE): scala.Unit
}

object OpenBluetoothAdapterOptions {
  @scala.inline
  def apply(
    autoClose: scala.Boolean,
    success: js.Function1[aliDashAppLib.Anon_IsSupportBLE, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): OpenBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal(autoClose = autoClose, success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[OpenBluetoothAdapterOptions]
  }
}

