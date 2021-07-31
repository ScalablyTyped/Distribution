package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3Order extends StObject {
  
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
  var vertical: js.UndefOr[ApiClientObjectMap[js.Any]] = js.undefined
}
object GoogleActionsOrdersV3Order {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3Order = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3Order]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3OrderMutableBuilder[Self <: GoogleActionsOrdersV3Order] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuyerInfo(value: GoogleActionsOrdersV3UserInfo): Self = StObject.set(x, "buyerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerInfoUndefined: Self = StObject.set(x, "buyerInfo", js.undefined)
    
    @scala.inline
    def setContents(value: GoogleActionsOrdersV3OrderContents): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setFollowUpActions(value: js.Array[GoogleActionsOrdersV3Action]): Self = StObject.set(x, "followUpActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowUpActionsUndefined: Self = StObject.set(x, "followUpActions", js.undefined)
    
    @scala.inline
    def setFollowUpActionsVarargs(value: GoogleActionsOrdersV3Action*): Self = StObject.set(x, "followUpActions", js.Array(value :_*))
    
    @scala.inline
    def setGoogleOrderId(value: String): Self = StObject.set(x, "googleOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleOrderIdUndefined: Self = StObject.set(x, "googleOrderId", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    @scala.inline
    def setMerchantOrderId(value: String): Self = StObject.set(x, "merchantOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantOrderIdUndefined: Self = StObject.set(x, "merchantOrderId", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setPaymentData(value: GoogleActionsTransactionsV3PaymentData): Self = StObject.set(x, "paymentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentDataUndefined: Self = StObject.set(x, "paymentData", js.undefined)
    
    @scala.inline
    def setPriceAttributes(value: js.Array[GoogleActionsOrdersV3PriceAttribute]): Self = StObject.set(x, "priceAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceAttributesUndefined: Self = StObject.set(x, "priceAttributes", js.undefined)
    
    @scala.inline
    def setPriceAttributesVarargs(value: GoogleActionsOrdersV3PriceAttribute*): Self = StObject.set(x, "priceAttributes", js.Array(value :_*))
    
    @scala.inline
    def setPromotions(value: js.Array[GoogleActionsOrdersV3Promotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: GoogleActionsOrdersV3Promotion*): Self = StObject.set(x, "promotions", js.Array(value :_*))
    
    @scala.inline
    def setPurchase(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension): Self = StObject.set(x, "purchase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseUndefined: Self = StObject.set(x, "purchase", js.undefined)
    
    @scala.inline
    def setTermsOfServiceUrl(value: String): Self = StObject.set(x, "termsOfServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsOfServiceUrlUndefined: Self = StObject.set(x, "termsOfServiceUrl", js.undefined)
    
    @scala.inline
    def setTicket(value: GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicketUndefined: Self = StObject.set(x, "ticket", js.undefined)
    
    @scala.inline
    def setTransactionMerchant(value: GoogleActionsOrdersV3Merchant): Self = StObject.set(x, "transactionMerchant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionMerchantUndefined: Self = StObject.set(x, "transactionMerchant", js.undefined)
    
    @scala.inline
    def setUserVisibleOrderId(value: String): Self = StObject.set(x, "userVisibleOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserVisibleOrderIdUndefined: Self = StObject.set(x, "userVisibleOrderId", js.undefined)
    
    @scala.inline
    def setUserVisibleStateLabel(value: String): Self = StObject.set(x, "userVisibleStateLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserVisibleStateLabelUndefined: Self = StObject.set(x, "userVisibleStateLabel", js.undefined)
    
    @scala.inline
    def setVertical(value: ApiClientObjectMap[js.Any]): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
