package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3PaymentResult extends js.Object {
  /**
    * Google provided payment method data.
    * If your payment processor is listed as Google supported payment processor
    * here: https://developers.google.com/pay/api/ Navigate to your payment
    * processor through the link to find out more details.
    * Otherwise, refer to following documentation for payload details.
    * https://developers.google.com/pay/api/payment-data-cryptography
    */
  var googlePaymentData: js.UndefOr[String] = js.undefined
  /**
    * Merchant/Action provided payment method chosen by user.
    */
  var merchantPaymentMethodId: js.UndefOr[String] = js.undefined
}

object GoogleActionsTransactionsV3PaymentResult {
  @scala.inline
  def apply(googlePaymentData: String = null, merchantPaymentMethodId: String = null): GoogleActionsTransactionsV3PaymentResult = {
    val __obj = js.Dynamic.literal()
    if (googlePaymentData != null) __obj.updateDynamic("googlePaymentData")(googlePaymentData.asInstanceOf[js.Any])
    if (merchantPaymentMethodId != null) __obj.updateDynamic("merchantPaymentMethodId")(merchantPaymentMethodId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentResult]
  }
}

