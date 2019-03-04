package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 支付代扣签约 https://docs.alipay.com/mini/api/pay-sign
trait PaySignCenterOptions
  extends BaseOptions[js.Any, js.Any] {
  var signStr: java.lang.String
}

object PaySignCenterOptions {
  @scala.inline
  def apply(
    signStr: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): PaySignCenterOptions = {
    val __obj = js.Dynamic.literal(signStr = signStr)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[PaySignCenterOptions]
  }
}

