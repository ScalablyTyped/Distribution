package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersActionProvidedPaymentOptions extends js.Object {
  /**
    * Name of the instrument displayed on the receipt.
    * Required for action-provided payment info.
    * For `PAYMENT_CARD`, this could be \"VISA-1234\".
    * For `BANK`, this could be \"Chase Checking-1234\".
    * For `LOYALTY_PROGRAM`, this could be \"Starbuck's points\".
    * For `ON_FULFILLMENT`, this could be something like \"pay on delivery\".
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * Type of payment.
    * Required.
    */
  var paymentType: js.UndefOr[GoogleActionsV2OrdersActionProvidedPaymentOptionsPaymentType] = js.undefined
}

object GoogleActionsV2OrdersActionProvidedPaymentOptions {
  @scala.inline
  def apply(
    displayName: String = null,
    paymentType: GoogleActionsV2OrdersActionProvidedPaymentOptionsPaymentType = null
  ): GoogleActionsV2OrdersActionProvidedPaymentOptions = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (paymentType != null) __obj.updateDynamic("paymentType")(paymentType)
    __obj.asInstanceOf[GoogleActionsV2OrdersActionProvidedPaymentOptions]
  }
}

