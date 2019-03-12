package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenVoucherDetailOptions2
  extends BaseOptions[js.Any, js.Any] {
  var partnerId: java.lang.String
  		// 商户编号，以 2088 为开头（如果传入了passId则不需传入）
  var serialNumber: java.lang.String
}

object OpenVoucherDetailOptions2 {
  @scala.inline
  def apply(
    partnerId: java.lang.String,
    serialNumber: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): OpenVoucherDetailOptions2 = {
    val __obj = js.Dynamic.literal(partnerId = partnerId, serialNumber = serialNumber)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenVoucherDetailOptions2]
  }
}

