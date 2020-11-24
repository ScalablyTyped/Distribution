package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3LineItem extends js.Object {
  
  /**
    * Line item description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Follow up actions at line item.
    */
  var followUpActions: js.UndefOr[js.Array[GoogleActionsOrdersV3Action]] = js.native
  
  /**
    * Required: Merchant assigned identifier for line item.
    * Used for identifying existing line item in applying partial updates.
    * Max allowed length is 64 chars.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Small image associated with this item, if any.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  
  /**
    * Name of line item as displayed on the receipt.
    * Max allowed length is 100 chars.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Additional notes applicable to this particular line item, for example
    * cancellation policy.
    */
  var notes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Line item level price and adjustments.
    */
  var priceAttributes: js.UndefOr[js.Array[GoogleActionsOrdersV3PriceAttribute]] = js.native
  
  /**
    * The provider of the particular line item, if different from the overall
    * order. Example: Expedia Order with line item provider ANA.
    */
  var provider: js.UndefOr[GoogleActionsOrdersV3Merchant] = js.native
  
  /**
    * Purchase orders like goods, food etc.
    */
  var purchase: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension] = js.native
  
  /**
    * Line item level customers, this could be different from Order level buyer.
    * Example: User X made restaurant reservation under name of user Y.
    */
  var recipients: js.UndefOr[js.Array[GoogleActionsOrdersV3UserInfo]] = js.native
  
  /**
    * Reservation orders like restaurant, haircut etc.
    */
  var reservation: js.UndefOr[GoogleActionsOrdersV3VerticalsReservationReservationItemExtension] = js.native
  
  /**
    * Deprecated. Use vertical level status instead. For example, for purchases,
    * use PurchaseOrderExtension.status.
    * User visible label for the state of this line item.
    */
  var userVisibleStateLabel: js.UndefOr[String] = js.native
  
  /**
    * Deprecated: Use verticals instead.
    * Required: Semantic Contents of line item based on its type/vertical.
    * Every vertical should include its own fulfillment details.
    * Must be either one of the following values:
    * google.actions.orders.v3.verticals.purchase.PurchaseItemExtension
    * google.actions.orders.v3.verticals.reservation.ReservationItemExtension
    * google.actions.orders.v3.verticals.ticket.TicketItemExtension
    */
  var vertical: js.UndefOr[ApiClientObjectMap[_]] = js.native
}
object GoogleActionsOrdersV3LineItem {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3LineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3LineItem]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3LineItemOps[Self <: GoogleActionsOrdersV3LineItem] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFollowUpActionsVarargs(value: GoogleActionsOrdersV3Action*): Self = this.set("followUpActions", js.Array(value :_*))
    
    @scala.inline
    def setFollowUpActions(value: js.Array[GoogleActionsOrdersV3Action]): Self = this.set("followUpActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowUpActions: Self = this.set("followUpActions", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: String*): Self = this.set("notes", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: js.Array[String]): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setPriceAttributesVarargs(value: GoogleActionsOrdersV3PriceAttribute*): Self = this.set("priceAttributes", js.Array(value :_*))
    
    @scala.inline
    def setPriceAttributes(value: js.Array[GoogleActionsOrdersV3PriceAttribute]): Self = this.set("priceAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceAttributes: Self = this.set("priceAttributes", js.undefined)
    
    @scala.inline
    def setProvider(value: GoogleActionsOrdersV3Merchant): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    
    @scala.inline
    def setPurchase(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension): Self = this.set("purchase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchase: Self = this.set("purchase", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: GoogleActionsOrdersV3UserInfo*): Self = this.set("recipients", js.Array(value :_*))
    
    @scala.inline
    def setRecipients(value: js.Array[GoogleActionsOrdersV3UserInfo]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
    
    @scala.inline
    def setReservation(value: GoogleActionsOrdersV3VerticalsReservationReservationItemExtension): Self = this.set("reservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservation: Self = this.set("reservation", js.undefined)
    
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
