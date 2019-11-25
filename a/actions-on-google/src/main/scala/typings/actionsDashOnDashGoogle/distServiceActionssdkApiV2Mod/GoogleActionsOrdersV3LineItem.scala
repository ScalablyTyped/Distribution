package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3LineItem extends js.Object {
  /**
    * Line item description.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Follow up actions at line item.
    */
  var followUpActions: js.UndefOr[js.Array[GoogleActionsOrdersV3Action]] = js.undefined
  /**
    * Required: Merchant assigned identifier for line item.
    * Used for identifying existing line item in applying partial updates.
    * Max allowed length is 64 chars.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Small image associated with this item, if any.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * Name of line item as displayed on the receipt.
    * Max allowed length is 100 chars.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Additional notes applicable to this particular line item, for example
    * cancellation policy.
    */
  var notes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Line item level price and adjustments.
    */
  var priceAttributes: js.UndefOr[js.Array[GoogleActionsOrdersV3PriceAttribute]] = js.undefined
  /**
    * The provider of the particular line item, if different from the overall
    * order. Example: Expedia Order with line item provider ANA.
    */
  var provider: js.UndefOr[GoogleActionsOrdersV3Merchant] = js.undefined
  /**
    * Purchase orders like goods, food etc.
    */
  var purchase: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension] = js.undefined
  /**
    * Line item level customers, this could be different from Order level buyer.
    * Example: User X made restaurant reservation under name of user Y.
    */
  var recipients: js.UndefOr[js.Array[GoogleActionsOrdersV3UserInfo]] = js.undefined
  /**
    * Reservation orders like restaurant, haircut etc.
    */
  var reservation: js.UndefOr[GoogleActionsOrdersV3VerticalsReservationReservationItemExtension] = js.undefined
  /**
    * Deprecated. Use vertical level status instead. For example, for purchases,
    * use PurchaseOrderExtension.status.
    * User visible label for the state of this line item.
    */
  var userVisibleStateLabel: js.UndefOr[String] = js.undefined
  /**
    * Deprecated: Use verticals instead.
    * Required: Semantic Contents of line item based on its type/vertical.
    * Every vertical should include its own fulfillment details.
    * Must be either one of the following values:
    * google.actions.orders.v3.verticals.purchase.PurchaseItemExtension
    * google.actions.orders.v3.verticals.reservation.ReservationItemExtension
    * google.actions.orders.v3.verticals.ticket.TicketItemExtension
    */
  var vertical: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
}

object GoogleActionsOrdersV3LineItem {
  @scala.inline
  def apply(
    description: String = null,
    followUpActions: js.Array[GoogleActionsOrdersV3Action] = null,
    id: String = null,
    image: GoogleActionsV2UiElementsImage = null,
    name: String = null,
    notes: js.Array[String] = null,
    priceAttributes: js.Array[GoogleActionsOrdersV3PriceAttribute] = null,
    provider: GoogleActionsOrdersV3Merchant = null,
    purchase: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension = null,
    recipients: js.Array[GoogleActionsOrdersV3UserInfo] = null,
    reservation: GoogleActionsOrdersV3VerticalsReservationReservationItemExtension = null,
    userVisibleStateLabel: String = null,
    vertical: ApiClientObjectMap[_] = null
  ): GoogleActionsOrdersV3LineItem = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (followUpActions != null) __obj.updateDynamic("followUpActions")(followUpActions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (priceAttributes != null) __obj.updateDynamic("priceAttributes")(priceAttributes.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (purchase != null) __obj.updateDynamic("purchase")(purchase.asInstanceOf[js.Any])
    if (recipients != null) __obj.updateDynamic("recipients")(recipients.asInstanceOf[js.Any])
    if (reservation != null) __obj.updateDynamic("reservation")(reservation.asInstanceOf[js.Any])
    if (userVisibleStateLabel != null) __obj.updateDynamic("userVisibleStateLabel")(userVisibleStateLabel.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3LineItem]
  }
}

