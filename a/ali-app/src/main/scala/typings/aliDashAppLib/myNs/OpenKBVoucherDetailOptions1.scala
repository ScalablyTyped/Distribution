package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenKBVoucherDetailOptions1
  extends BaseOptions[js.Any, js.Any] {
  var passId: java.lang.String
}

object OpenKBVoucherDetailOptions1 {
  @scala.inline
  def apply(
    passId: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): OpenKBVoucherDetailOptions1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("passId")(passId)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[OpenKBVoucherDetailOptions1]
  }
}

