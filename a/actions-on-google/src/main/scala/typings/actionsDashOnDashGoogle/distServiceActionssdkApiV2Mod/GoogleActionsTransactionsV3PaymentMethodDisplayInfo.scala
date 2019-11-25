package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3PaymentMethodDisplayInfo extends js.Object {
  /**
    * User visible name of the payment method. For example,
    * VISA **** 1234
    * Checking acct **** 5678
    */
  var paymentMethodDisplayName: js.UndefOr[String] = js.undefined
  /**
    * The type of the payment.
    */
  var paymentType: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodDisplayInfoPaymentType] = js.undefined
}

object GoogleActionsTransactionsV3PaymentMethodDisplayInfo {
  @scala.inline
  def apply(
    paymentMethodDisplayName: String = null,
    paymentType: GoogleActionsTransactionsV3PaymentMethodDisplayInfoPaymentType = null
  ): GoogleActionsTransactionsV3PaymentMethodDisplayInfo = {
    val __obj = js.Dynamic.literal()
    if (paymentMethodDisplayName != null) __obj.updateDynamic("paymentMethodDisplayName")(paymentMethodDisplayName.asInstanceOf[js.Any])
    if (paymentType != null) __obj.updateDynamic("paymentType")(paymentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentMethodDisplayInfo]
  }
}

