package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3MerchantPaymentOption extends js.Object {
  /**
    * Optional. Id of the default payment method, if any.
    */
  var defaultMerchantPaymentMethodId: js.UndefOr[String] = js.undefined
  /**
    * Optional. A link to the action/merchant website for managing payment
    * method.
    */
  var managePaymentMethodUrl: js.UndefOr[String] = js.undefined
  /**
    * Required. List of payment methods provided by Action/Merchant.
    */
  var merchantPaymentMethod: js.UndefOr[js.Array[GoogleActionsTransactionsV3MerchantPaymentMethod]] = js.undefined
}

object GoogleActionsTransactionsV3MerchantPaymentOption {
  @scala.inline
  def apply(
    defaultMerchantPaymentMethodId: String = null,
    managePaymentMethodUrl: String = null,
    merchantPaymentMethod: js.Array[GoogleActionsTransactionsV3MerchantPaymentMethod] = null
  ): GoogleActionsTransactionsV3MerchantPaymentOption = {
    val __obj = js.Dynamic.literal()
    if (defaultMerchantPaymentMethodId != null) __obj.updateDynamic("defaultMerchantPaymentMethodId")(defaultMerchantPaymentMethodId)
    if (managePaymentMethodUrl != null) __obj.updateDynamic("managePaymentMethodUrl")(managePaymentMethodUrl)
    if (merchantPaymentMethod != null) __obj.updateDynamic("merchantPaymentMethod")(merchantPaymentMethod)
    __obj.asInstanceOf[GoogleActionsTransactionsV3MerchantPaymentOption]
  }
}

