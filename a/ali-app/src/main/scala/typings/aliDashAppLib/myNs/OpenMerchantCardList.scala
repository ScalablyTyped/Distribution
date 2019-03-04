package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenMerchantCardList
  extends BaseOptions[js.Any, js.Any] {
  var partnerId: java.lang.String
}

object OpenMerchantCardList {
  @scala.inline
  def apply(
    partnerId: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): OpenMerchantCardList = {
    val __obj = js.Dynamic.literal(partnerId = partnerId)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[OpenMerchantCardList]
  }
}

