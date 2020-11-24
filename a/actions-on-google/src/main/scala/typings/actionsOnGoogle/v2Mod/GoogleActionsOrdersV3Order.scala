package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3Order extends js.Object {
  
  /**
    * Info about the buyer.
    */
  var buyerInfo: js.UndefOr[GoogleActionsOrdersV3UserInfo] = js.native
  
  /**
    * Required: Order contents which is a group of line items.
    */
  var contents: js.UndefOr[GoogleActionsOrdersV3OrderContents] = js.native
  
  /**
    * Required: Date and time the order was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Follow up actions at order level.
    */
  var followUpActions: js.UndefOr[js.Array[GoogleActionsOrdersV3Action]] = js.native
  
  /**
    * Google assigned order id.
    */
  var googleOrderId: js.UndefOr[String] = js.native
  
  /**
    * Image associated with the order.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  
  /**
    * Date and time the order was last updated.
    * Required for OrderUpdate.
    */
  var lastUpdateTime: js.UndefOr[String] = js.native
  
  /**
    * Required: Merchant assigned internal order id. This id must be unique, and
    * is required for subsequent order update operations. This id may be set to
    * the provided google_order_id, or any other unique value. Note that the id
    * presented to users is the user_visible_order_id, which may be a different,
    * more user-friendly value.
    * Max allowed length is 64 chars.
    */
  var merchantOrderId: js.UndefOr[String] = js.native
  
  /**
    * Notes attached to an order.
    */
  var note: js.UndefOr[String] = js.native
  
  /**
    * Payment related data for the order.
    */
  var paymentData: js.UndefOr[GoogleActionsTransactionsV3PaymentData] = js.native
  
  /**
    * Price, discounts, taxes and so on.
    */
  var priceAttributes: js.UndefOr[js.Array[GoogleActionsOrdersV3PriceAttribute]] = js.native
  
  /**
    * All promotions that are associated with this order.
    */
  var promotions: js.UndefOr[js.Array[GoogleActionsOrdersV3Promotion]] = js.native
  
  /**
    * Purchase order
    */
  var purchase: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension] = js.native
  
  /**
    * A link to the terms of service that apply to order/proposed order.
    */
  var termsOfServiceUrl: js.UndefOr[String] = js.native
  
  /**
    * Ticket order
    */
  var ticket: js.UndefOr[GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension] = js.native
  
  /**
    * Merchant that facilitated the checkout. This could be different from
    * a line item level provider. Example: Expedia Order with line item from ANA.
    */
  var transactionMerchant: js.UndefOr[GoogleActionsOrdersV3Merchant] = js.native
  
  /**
    * The user facing id referencing to current order. This id should be
    * consistent with the id displayed for this order in other contexts,
    * including websites, apps and email.
    */
  var userVisibleOrderId: js.UndefOr[String] = js.native
  
  /**
    * Deprecated: Use OrderExtensions status instead.
    * User visible label for the state of this order.
    */
  var userVisibleStateLabel: js.UndefOr[String] = js.native
  
  /**
    * Deprecated: Use verticals instead.
    * These properties will apply to all line items, unless overridden in
    * some line item. This vertical must match the line item level vertical type.
    * Possible values:
    * google.actions.orders.v3.verticals.purchase.PurchaseOrderExtension
    * google.actions.orders.v3.verticals.ticket.TicketOrderExtension
    */
  var vertical: js.UndefOr[ApiClientObjectMap[_]] = js.native
}
object GoogleActionsOrdersV3Order {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3Order = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3Order]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3OrderOps[Self <: GoogleActionsOrdersV3Order] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuyerInfo(value: GoogleActionsOrdersV3UserInfo): Self = this.set("buyerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyerInfo: Self = this.set("buyerInfo", js.undefined)
    
    @scala.inline
    def setContents(value: GoogleActionsOrdersV3OrderContents): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setFollowUpActionsVarargs(value: GoogleActionsOrdersV3Action*): Self = this.set("followUpActions", js.Array(value :_*))
    
    @scala.inline
    def setFollowUpActions(value: js.Array[GoogleActionsOrdersV3Action]): Self = this.set("followUpActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowUpActions: Self = this.set("followUpActions", js.undefined)
    
    @scala.inline
    def setGoogleOrderId(value: String): Self = this.set("googleOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleOrderId: Self = this.set("googleOrderId", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: String): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    
    @scala.inline
    def setMerchantOrderId(value: String): Self = this.set("merchantOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantOrderId: Self = this.set("merchantOrderId", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setPaymentData(value: GoogleActionsTransactionsV3PaymentData): Self = this.set("paymentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentData: Self = this.set("paymentData", js.undefined)
    
    @scala.inline
    def setPriceAttributesVarargs(value: GoogleActionsOrdersV3PriceAttribute*): Self = this.set("priceAttributes", js.Array(value :_*))
    
    @scala.inline
    def setPriceAttributes(value: js.Array[GoogleActionsOrdersV3PriceAttribute]): Self = this.set("priceAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceAttributes: Self = this.set("priceAttributes", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: GoogleActionsOrdersV3Promotion*): Self = this.set("promotions", js.Array(value :_*))
    
    @scala.inline
    def setPromotions(value: js.Array[GoogleActionsOrdersV3Promotion]): Self = this.set("promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotions: Self = this.set("promotions", js.undefined)
    
    @scala.inline
    def setPurchase(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension): Self = this.set("purchase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchase: Self = this.set("purchase", js.undefined)
    
    @scala.inline
    def setTermsOfServiceUrl(value: String): Self = this.set("termsOfServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTermsOfServiceUrl: Self = this.set("termsOfServiceUrl", js.undefined)
    
    @scala.inline
    def setTicket(value: GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension): Self = this.set("ticket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicket: Self = this.set("ticket", js.undefined)
    
    @scala.inline
    def setTransactionMerchant(value: GoogleActionsOrdersV3Merchant): Self = this.set("transactionMerchant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionMerchant: Self = this.set("transactionMerchant", js.undefined)
    
    @scala.inline
    def setUserVisibleOrderId(value: String): Self = this.set("userVisibleOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVisibleOrderId: Self = this.set("userVisibleOrderId", js.undefined)
    
    @scala.inline
    def setUserVisibleStateLabel(value: String): Self = this.set("userVisibleStateLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVisibleStateLabel: Self = this.set("userVisibleStateLabel", js.undefined)
    
    @scala.inline
    def setVertical(value: ApiClientObjectMap[_]): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
