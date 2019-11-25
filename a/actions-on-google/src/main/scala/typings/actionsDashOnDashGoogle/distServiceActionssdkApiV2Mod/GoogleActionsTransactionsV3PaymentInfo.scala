package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3PaymentInfo extends js.Object {
  /**
    * The display info of the payment method used for the transaction.
    */
  var paymentMethodDisplayInfo: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodDisplayInfo] = js.undefined
  /**
    * Provenance of the payment method used for the transaction.
    * User may have registered the same payment method with both google and
    * merchant.
    */
  var paymentMethodProvenance: js.UndefOr[GoogleActionsTransactionsV3PaymentInfoPaymentMethodProvenance] = js.undefined
}

object GoogleActionsTransactionsV3PaymentInfo {
  @scala.inline
  def apply(
    paymentMethodDisplayInfo: GoogleActionsTransactionsV3PaymentMethodDisplayInfo = null,
    paymentMethodProvenance: GoogleActionsTransactionsV3PaymentInfoPaymentMethodProvenance = null
  ): GoogleActionsTransactionsV3PaymentInfo = {
    val __obj = js.Dynamic.literal()
    if (paymentMethodDisplayInfo != null) __obj.updateDynamic("paymentMethodDisplayInfo")(paymentMethodDisplayInfo.asInstanceOf[js.Any])
    if (paymentMethodProvenance != null) __obj.updateDynamic("paymentMethodProvenance")(paymentMethodProvenance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentInfo]
  }
}

