package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenTicketDetailOptions2
  extends BaseOptions[js.Any, js.Any] {
  var partnerId: String
      // 商户编号（如果传入了passId则不需要传入partnerId）
  var serialNumber: String
}

object OpenTicketDetailOptions2 {
  @scala.inline
  def apply(
    partnerId: String,
    serialNumber: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): OpenTicketDetailOptions2 = {
    val __obj = js.Dynamic.literal(partnerId = partnerId.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenTicketDetailOptions2]
  }
}

