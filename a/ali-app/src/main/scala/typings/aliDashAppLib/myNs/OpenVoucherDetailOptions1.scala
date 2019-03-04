package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenVoucherDetailOptions1
  extends BaseOptions[js.Any, js.Any] {
  var passId: java.lang.String
}

object OpenVoucherDetailOptions1 {
  @scala.inline
  def apply(
    passId: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): OpenVoucherDetailOptions1 = {
    val __obj = js.Dynamic.literal(passId = passId)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[OpenVoucherDetailOptions1]
  }
}

