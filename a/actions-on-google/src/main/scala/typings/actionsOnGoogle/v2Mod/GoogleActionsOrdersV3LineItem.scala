package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3LineItem extends StObject {
  
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
  var vertical: js.UndefOr[ApiClientObjectMap[js.Any]] = js.undefined
}
object GoogleActionsOrdersV3LineItem {
  
  inline def apply(): GoogleActionsOrdersV3LineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3LineItem]
  }
  
  extension [Self <: GoogleActionsOrdersV3LineItem](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFollowUpActions(value: js.Array[GoogleActionsOrdersV3Action]): Self = StObject.set(x, "followUpActions", value.asInstanceOf[js.Any])
    
    inline def setFollowUpActionsUndefined: Self = StObject.set(x, "followUpActions", js.undefined)
    
    inline def setFollowUpActionsVarargs(value: GoogleActionsOrdersV3Action*): Self = StObject.set(x, "followUpActions", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: js.Array[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: String*): Self = StObject.set(x, "notes", js.Array(value :_*))
    
    inline def setPriceAttributes(value: js.Array[GoogleActionsOrdersV3PriceAttribute]): Self = StObject.set(x, "priceAttributes", value.asInstanceOf[js.Any])
    
    inline def setPriceAttributesUndefined: Self = StObject.set(x, "priceAttributes", js.undefined)
    
    inline def setPriceAttributesVarargs(value: GoogleActionsOrdersV3PriceAttribute*): Self = StObject.set(x, "priceAttributes", js.Array(value :_*))
    
    inline def setProvider(value: GoogleActionsOrdersV3Merchant): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setPurchase(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension): Self = StObject.set(x, "purchase", value.asInstanceOf[js.Any])
    
    inline def setPurchaseUndefined: Self = StObject.set(x, "purchase", js.undefined)
    
    inline def setRecipients(value: js.Array[GoogleActionsOrdersV3UserInfo]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    inline def setRecipientsVarargs(value: GoogleActionsOrdersV3UserInfo*): Self = StObject.set(x, "recipients", js.Array(value :_*))
    
    inline def setReservation(value: GoogleActionsOrdersV3VerticalsReservationReservationItemExtension): Self = StObject.set(x, "reservation", value.asInstanceOf[js.Any])
    
    inline def setReservationUndefined: Self = StObject.set(x, "reservation", js.undefined)
    
    inline def setUserVisibleStateLabel(value: String): Self = StObject.set(x, "userVisibleStateLabel", value.asInstanceOf[js.Any])
    
    inline def setUserVisibleStateLabelUndefined: Self = StObject.set(x, "userVisibleStateLabel", js.undefined)
    
    inline def setVertical(value: ApiClientObjectMap[js.Any]): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
