package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3MerchantPaymentMethod extends js.Object {
  /**
    * Required. Display info of this payment method.
    */
  var paymentMethodDisplayInfo: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodDisplayInfo] = js.undefined
  /**
    * Optional. The group / profile name that the payment method belongs to.
    */
  var paymentMethodGroup: js.UndefOr[String] = js.undefined
  /**
    * Required. Id of the payment method passed from merchant / action.
    * Note this id is should be unique if multiple payment methods are sent from
    * Merchant/Action.
    */
  var paymentMethodId: js.UndefOr[String] = js.undefined
  /**
    * Optional. Status of the payment method.
    * If not present, the payment method is assumed to be in OK status.
    */
  var paymentMethodStatus: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodStatus] = js.undefined
}

object GoogleActionsTransactionsV3MerchantPaymentMethod {
  @scala.inline
  def apply(
    paymentMethodDisplayInfo: GoogleActionsTransactionsV3PaymentMethodDisplayInfo = null,
    paymentMethodGroup: String = null,
    paymentMethodId: String = null,
    paymentMethodStatus: GoogleActionsTransactionsV3PaymentMethodStatus = null
  ): GoogleActionsTransactionsV3MerchantPaymentMethod = {
    val __obj = js.Dynamic.literal()
    if (paymentMethodDisplayInfo != null) __obj.updateDynamic("paymentMethodDisplayInfo")(paymentMethodDisplayInfo.asInstanceOf[js.Any])
    if (paymentMethodGroup != null) __obj.updateDynamic("paymentMethodGroup")(paymentMethodGroup.asInstanceOf[js.Any])
    if (paymentMethodId != null) __obj.updateDynamic("paymentMethodId")(paymentMethodId.asInstanceOf[js.Any])
    if (paymentMethodStatus != null) __obj.updateDynamic("paymentMethodStatus")(paymentMethodStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsTransactionsV3MerchantPaymentMethod]
  }
}

