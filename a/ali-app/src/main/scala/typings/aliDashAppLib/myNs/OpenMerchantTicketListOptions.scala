package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenMerchantTicketListOptions
  extends BaseOptions[js.Any, js.Any] {
  var partnerId: java.lang.String
}

object OpenMerchantTicketListOptions {
  @scala.inline
  def apply(
    partnerId: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): OpenMerchantTicketListOptions = {
    val __obj = js.Dynamic.literal(partnerId = partnerId)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenMerchantTicketListOptions]
  }
}

