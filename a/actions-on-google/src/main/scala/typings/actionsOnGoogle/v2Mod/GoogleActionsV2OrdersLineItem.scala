package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersLineItem extends js.Object {
  
  /**
    * Description of the item.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Extension to the line item based on its type.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  /**
    * Unique id of the line item within the Cart/Order. Required.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Small image associated with this item.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  
  /**
    * Name of the line item as displayed in the receipt. Required.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional product or offer id for this item.
    */
  var offerId: js.UndefOr[String] = js.native
  
  /**
    * Each line item should have a price, even if the price is 0. Required.
    * This is the total price as displayed on the receipt for this line
    * (i.e. unit price * quantity).
    */
  var price: js.UndefOr[GoogleActionsV2OrdersPrice] = js.native
  
  /**
    * Number of items included.
    */
  var quantity: js.UndefOr[Double] = js.native
  
  /**
    * Sub-line item(s). Only valid if type is `REGULAR`.
    */
  var subLines: js.UndefOr[js.Array[GoogleActionsV2OrdersLineItemSubLine]] = js.native
  
  /**
    * Type of line item.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersLineItemType] = js.native
}
object GoogleActionsV2OrdersLineItem {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersLineItem]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersLineItemOps[Self <: GoogleActionsV2OrdersLineItem] (val x: Self) extends AnyVal {
    
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
    def setExtension(value: ApiClientObjectMap[_]): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
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
    def setOfferId(value: String): Self = this.set("offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferId: Self = this.set("offerId", js.undefined)
    
    @scala.inline
    def setPrice(value: GoogleActionsV2OrdersPrice): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setSubLinesVarargs(value: GoogleActionsV2OrdersLineItemSubLine*): Self = this.set("subLines", js.Array(value :_*))
    
    @scala.inline
    def setSubLines(value: js.Array[GoogleActionsV2OrdersLineItemSubLine]): Self = this.set("subLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubLines: Self = this.set("subLines", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsV2OrdersLineItemType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
