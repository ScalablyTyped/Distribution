package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3PaymentData extends js.Object {
  /**
    * Payment information regarding the order that's useful for user facing
    * interaction.
    */
  var paymentInfo: js.UndefOr[GoogleActionsTransactionsV3PaymentInfo] = js.undefined
  /**
    * Payment result that's used by integrator for completing a transaction.
    * This field will be populated by Actions on Google if the checkout
    * experience is managed by Actions-on-Google.
    */
  var paymentResult: js.UndefOr[GoogleActionsTransactionsV3PaymentResult] = js.undefined
}

object GoogleActionsTransactionsV3PaymentData {
  @scala.inline
  def apply(
    paymentInfo: GoogleActionsTransactionsV3PaymentInfo = null,
    paymentResult: GoogleActionsTransactionsV3PaymentResult = null
  ): GoogleActionsTransactionsV3PaymentData = {
    val __obj = js.Dynamic.literal()
    if (paymentInfo != null) __obj.updateDynamic("paymentInfo")(paymentInfo.asInstanceOf[js.Any])
    if (paymentResult != null) __obj.updateDynamic("paymentResult")(paymentResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentData]
  }
}

