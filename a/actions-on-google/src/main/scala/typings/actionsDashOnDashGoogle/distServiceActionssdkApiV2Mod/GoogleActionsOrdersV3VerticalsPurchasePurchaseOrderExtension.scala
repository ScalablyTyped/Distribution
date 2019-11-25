package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension extends js.Object {
  /**
    * Optional: Errors because of which this order was rejected.
    */
  var errors: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseError]] = js.undefined
  /**
    * Any extra fields exchanged between merchant and google.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  /**
    * Fulfillment info for the order.
    */
  var fulfillmentInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo] = js.undefined
  /**
    * Location of the purchase (in-store / online)
    */
  var purchaseLocationType: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionPurchaseLocationType] = js.undefined
  /**
    * Return info for the order.
    */
  var returnsInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo] = js.undefined
  /**
    * Required: Overall Status for the order.
    */
  var status: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionStatus] = js.undefined
  /**
    * Required: Type of purchase.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionType] = js.undefined
  /**
    * User visible label/string for the status.
    * Max allowed length is 50 chars.
    */
  var userVisibleStatusLabel: js.UndefOr[String] = js.undefined
}

object GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension {
  @scala.inline
  def apply(
    errors: js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseError] = null,
    extension: ApiClientObjectMap[_] = null,
    fulfillmentInfo: GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo = null,
    purchaseLocationType: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionPurchaseLocationType = null,
    returnsInfo: GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo = null,
    status: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionStatus = null,
    `type`: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionType = null,
    userVisibleStatusLabel: String = null
  ): GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fulfillmentInfo != null) __obj.updateDynamic("fulfillmentInfo")(fulfillmentInfo.asInstanceOf[js.Any])
    if (purchaseLocationType != null) __obj.updateDynamic("purchaseLocationType")(purchaseLocationType.asInstanceOf[js.Any])
    if (returnsInfo != null) __obj.updateDynamic("returnsInfo")(returnsInfo.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userVisibleStatusLabel != null) __obj.updateDynamic("userVisibleStatusLabel")(userVisibleStatusLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension]
  }
}

