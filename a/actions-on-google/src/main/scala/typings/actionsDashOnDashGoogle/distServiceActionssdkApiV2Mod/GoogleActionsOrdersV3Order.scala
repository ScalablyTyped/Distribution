package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3Order extends js.Object {
  /**
    * Info about the buyer.
    */
  var buyerInfo: js.UndefOr[GoogleActionsOrdersV3UserInfo] = js.undefined
  /**
    * Required: Order contents which is a group of line items.
    */
  var contents: js.UndefOr[GoogleActionsOrdersV3OrderContents] = js.undefined
  /**
    * Required: Date and time the order was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  /**
    * Follow up actions at order level.
    */
  var followUpActions: js.UndefOr[js.Array[GoogleActionsOrdersV3Action]] = js.undefined
  /**
    * Google assigned order id.
    */
  var googleOrderId: js.UndefOr[String] = js.undefined
  /**
    * Image associated with the order.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * Date and time the order was last updated.
    * Required for OrderUpdate.
    */
  var lastUpdateTime: js.UndefOr[String] = js.undefined
  /**
    * Required: Merchant assigned internal order id. This id must be unique, and
    * is required for subsequent order update operations. This id may be set to
    * the provided google_order_id, or any other unique value. Note that the id
    * presented to users is the user_visible_order_id, which may be a different,
    * more user-friendly value.
    * Max allowed length is 64 chars.
    */
  var merchantOrderId: js.UndefOr[String] = js.undefined
  /**
    * Notes attached to an order.
    */
  var note: js.UndefOr[String] = js.undefined
  /**
    * Payment related data for the order.
    */
  var paymentData: js.UndefOr[GoogleActionsTransactionsV3PaymentData] = js.undefined
  /**
    * Price, discounts, taxes and so on.
    */
  var priceAttributes: js.UndefOr[js.Array[GoogleActionsOrdersV3PriceAttribute]] = js.undefined
  /**
    * All promotions that are associated with this order.
    */
  var promotions: js.UndefOr[js.Array[GoogleActionsOrdersV3Promotion]] = js.undefined
  /**
    * Purchase order
    */
  var purchase: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension] = js.undefined
  /**
    * A link to the terms of service that apply to order/proposed order.
    */
  var termsOfServiceUrl: js.UndefOr[String] = js.undefined
  /**
    * Ticket order
    */
  var ticket: js.UndefOr[GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension] = js.undefined
  /**
    * Merchant that facilitated the checkout. This could be different from
    * a line item level provider. Example: Expedia Order with line item from ANA.
    */
  var transactionMerchant: js.UndefOr[GoogleActionsOrdersV3Merchant] = js.undefined
  /**
    * The user facing id referencing to current order. This id should be
    * consistent with the id displayed for this order in other contexts,
    * including websites, apps and email.
    */
  var userVisibleOrderId: js.UndefOr[String] = js.undefined
  /**
    * Deprecated: Use OrderExtensions status instead.
    * User visible label for the state of this order.
    */
  var userVisibleStateLabel: js.UndefOr[String] = js.undefined
  /**
    * Deprecated: Use verticals instead.
    * These properties will apply to all line items, unless overridden in
    * some line item. This vertical must match the line item level vertical type.
    * Possible values:
    * google.actions.orders.v3.verticals.purchase.PurchaseOrderExtension
    * google.actions.orders.v3.verticals.ticket.TicketOrderExtension
    */
  var vertical: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
}

object GoogleActionsOrdersV3Order {
  @scala.inline
  def apply(
    buyerInfo: GoogleActionsOrdersV3UserInfo = null,
    contents: GoogleActionsOrdersV3OrderContents = null,
    createTime: String = null,
    followUpActions: js.Array[GoogleActionsOrdersV3Action] = null,
    googleOrderId: String = null,
    image: GoogleActionsV2UiElementsImage = null,
    lastUpdateTime: String = null,
    merchantOrderId: String = null,
    note: String = null,
    paymentData: GoogleActionsTransactionsV3PaymentData = null,
    priceAttributes: js.Array[GoogleActionsOrdersV3PriceAttribute] = null,
    promotions: js.Array[GoogleActionsOrdersV3Promotion] = null,
    purchase: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension = null,
    termsOfServiceUrl: String = null,
    ticket: GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension = null,
    transactionMerchant: GoogleActionsOrdersV3Merchant = null,
    userVisibleOrderId: String = null,
    userVisibleStateLabel: String = null,
    vertical: ApiClientObjectMap[_] = null
  ): GoogleActionsOrdersV3Order = {
    val __obj = js.Dynamic.literal()
    if (buyerInfo != null) __obj.updateDynamic("buyerInfo")(buyerInfo)
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (followUpActions != null) __obj.updateDynamic("followUpActions")(followUpActions)
    if (googleOrderId != null) __obj.updateDynamic("googleOrderId")(googleOrderId)
    if (image != null) __obj.updateDynamic("image")(image)
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId)
    if (note != null) __obj.updateDynamic("note")(note)
    if (paymentData != null) __obj.updateDynamic("paymentData")(paymentData)
    if (priceAttributes != null) __obj.updateDynamic("priceAttributes")(priceAttributes)
    if (promotions != null) __obj.updateDynamic("promotions")(promotions)
    if (purchase != null) __obj.updateDynamic("purchase")(purchase)
    if (termsOfServiceUrl != null) __obj.updateDynamic("termsOfServiceUrl")(termsOfServiceUrl)
    if (ticket != null) __obj.updateDynamic("ticket")(ticket)
    if (transactionMerchant != null) __obj.updateDynamic("transactionMerchant")(transactionMerchant)
    if (userVisibleOrderId != null) __obj.updateDynamic("userVisibleOrderId")(userVisibleOrderId)
    if (userVisibleStateLabel != null) __obj.updateDynamic("userVisibleStateLabel")(userVisibleStateLabel)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[GoogleActionsOrdersV3Order]
  }
}

