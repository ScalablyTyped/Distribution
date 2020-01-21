package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3PaymentParameters extends js.Object {
  /**
    * Info for requesting payment info from google.
    */
  var googlePaymentOption: js.UndefOr[GoogleActionsTransactionsV3GooglePaymentOption] = js.undefined
  /**
    * Info for payment methods provided by Action/Merchant.
    */
  var merchantPaymentOption: js.UndefOr[GoogleActionsTransactionsV3MerchantPaymentOption] = js.undefined
}

object GoogleActionsTransactionsV3PaymentParameters {
  @scala.inline
  def apply(
    googlePaymentOption: GoogleActionsTransactionsV3GooglePaymentOption = null,
    merchantPaymentOption: GoogleActionsTransactionsV3MerchantPaymentOption = null
  ): GoogleActionsTransactionsV3PaymentParameters = {
    val __obj = js.Dynamic.literal()
    if (googlePaymentOption != null) __obj.updateDynamic("googlePaymentOption")(googlePaymentOption.asInstanceOf[js.Any])
    if (merchantPaymentOption != null) __obj.updateDynamic("merchantPaymentOption")(merchantPaymentOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentParameters]
  }
}

