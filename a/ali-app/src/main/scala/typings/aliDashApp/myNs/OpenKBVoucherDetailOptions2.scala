package typings.aliDashApp.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenKBVoucherDetailOptions2
  extends BaseOptions[js.Any, js.Any] {
  var partnerId: String
  		// 商户编号（如果传入了passId则不需传入）
  var serialNumber: String
}

object OpenKBVoucherDetailOptions2 {
  @scala.inline
  def apply(
    partnerId: String,
    serialNumber: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): OpenKBVoucherDetailOptions2 = {
    val __obj = js.Dynamic.literal(partnerId = partnerId, serialNumber = serialNumber)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenKBVoucherDetailOptions2]
  }
}

