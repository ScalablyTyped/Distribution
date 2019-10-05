package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenKBVoucherDetailOptions1
  extends BaseOptions[js.Any, js.Any] {
  var passId: String
}

object OpenKBVoucherDetailOptions1 {
  @scala.inline
  def apply(
    passId: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): OpenKBVoucherDetailOptions1 = {
    val __obj = js.Dynamic.literal(passId = passId)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenKBVoucherDetailOptions1]
  }
}

