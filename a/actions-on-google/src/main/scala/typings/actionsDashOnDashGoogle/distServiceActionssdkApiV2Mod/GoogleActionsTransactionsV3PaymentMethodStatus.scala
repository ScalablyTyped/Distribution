package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3PaymentMethodStatus extends js.Object {
  var status: js.UndefOr[GoogleActionsTransactionsV3PaymentMethodStatusStatus] = js.undefined
  /**
    * User facing message regarding the payment method status, i.e. \"Expired\".
    * Only required when payment method requires fix or is inapplicable.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
}

object GoogleActionsTransactionsV3PaymentMethodStatus {
  @scala.inline
  def apply(status: GoogleActionsTransactionsV3PaymentMethodStatusStatus = null, statusMessage: String = null): GoogleActionsTransactionsV3PaymentMethodStatus = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status)
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    __obj.asInstanceOf[GoogleActionsTransactionsV3PaymentMethodStatus]
  }
}

