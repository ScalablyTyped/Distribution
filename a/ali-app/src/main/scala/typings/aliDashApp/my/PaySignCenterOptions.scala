package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 支付代扣签约 https://docs.alipay.com/mini/api/pay-sign
trait PaySignCenterOptions
  extends BaseOptions[js.Any, js.Any] {
  var signStr: String
}

object PaySignCenterOptions {
  @scala.inline
  def apply(
    signStr: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): PaySignCenterOptions = {
    val __obj = js.Dynamic.literal(signStr = signStr.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[PaySignCenterOptions]
  }
}

