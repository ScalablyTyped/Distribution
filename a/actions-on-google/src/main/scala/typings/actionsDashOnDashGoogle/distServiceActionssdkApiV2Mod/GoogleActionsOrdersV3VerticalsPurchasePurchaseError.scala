package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3VerticalsPurchasePurchaseError extends js.Object {
  /**
    * Available quantity now. Applicable in case of AVAILABILITY_CHANGED.
    */
  var availableQuantity: js.UndefOr[Double] = js.undefined
  /**
    * Additional error description.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Entity Id that corresponds to the error. Example this can correspond to
    * LineItemId / ItemOptionId.
    */
  var entityId: js.UndefOr[String] = js.undefined
  /**
    * Required: This represents the granular reason why an order gets rejected by
    * the merchant.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseErrorType] = js.undefined
  /**
    * Relevant in case of PRICE_CHANGED / INCORRECT_PRICE error type.
    */
  var updatedPrice: js.UndefOr[GoogleActionsOrdersV3PriceAttribute] = js.undefined
}

object GoogleActionsOrdersV3VerticalsPurchasePurchaseError {
  @scala.inline
  def apply(
    availableQuantity: Int | Double = null,
    description: String = null,
    entityId: String = null,
    `type`: GoogleActionsOrdersV3VerticalsPurchasePurchaseErrorType = null,
    updatedPrice: GoogleActionsOrdersV3PriceAttribute = null
  ): GoogleActionsOrdersV3VerticalsPurchasePurchaseError = {
    val __obj = js.Dynamic.literal()
    if (availableQuantity != null) __obj.updateDynamic("availableQuantity")(availableQuantity.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updatedPrice != null) __obj.updateDynamic("updatedPrice")(updatedPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseError]
  }
}

