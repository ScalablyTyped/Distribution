package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3CompletePurchaseValue extends js.Object {
  /**
    * A unique order identifier for the transaction. This identifier corresponds
    * to the Google provided order ID.
    */
  var orderId: js.UndefOr[String] = js.undefined
  /**
    * Status of current purchase.
    */
  var purchaseStatus: js.UndefOr[GoogleActionsTransactionsV3CompletePurchaseValuePurchaseStatus] = js.undefined
  /**
    * A opaque token that uniquely identifies a purchase for a given item and
    * user pair.
    */
  var purchaseToken: js.UndefOr[String] = js.undefined
}

object GoogleActionsTransactionsV3CompletePurchaseValue {
  @scala.inline
  def apply(
    orderId: String = null,
    purchaseStatus: GoogleActionsTransactionsV3CompletePurchaseValuePurchaseStatus = null,
    purchaseToken: String = null
  ): GoogleActionsTransactionsV3CompletePurchaseValue = {
    val __obj = js.Dynamic.literal()
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (purchaseStatus != null) __obj.updateDynamic("purchaseStatus")(purchaseStatus.asInstanceOf[js.Any])
    if (purchaseToken != null) __obj.updateDynamic("purchaseToken")(purchaseToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsTransactionsV3CompletePurchaseValue]
  }
}

