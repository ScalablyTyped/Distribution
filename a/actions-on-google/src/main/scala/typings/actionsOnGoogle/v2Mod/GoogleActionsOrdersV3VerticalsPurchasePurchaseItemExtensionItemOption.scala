package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption extends js.Object {
  
  /**
    * For options that are items, unique item id.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Option name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Note related to the option.
    */
  var note: js.UndefOr[String] = js.native
  
  /**
    * Option total price.
    */
  var prices: js.UndefOr[js.Array[GoogleActionsOrdersV3PriceAttribute]] = js.native
  
  /**
    * Product or offer id associated with this option.
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * For options that are items, quantity.
    */
  var quantity: js.UndefOr[Double] = js.native
  
  /**
    * To define other nested sub options.
    */
  var subOptions: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption]] = js.native
}
object GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOptionOps[Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setPricesVarargs(value: GoogleActionsOrdersV3PriceAttribute*): Self = this.set("prices", js.Array(value :_*))
    
    @scala.inline
    def setPrices(value: js.Array[GoogleActionsOrdersV3PriceAttribute]): Self = this.set("prices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrices: Self = this.set("prices", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setSubOptionsVarargs(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption*): Self = this.set("subOptions", js.Array(value :_*))
    
    @scala.inline
    def setSubOptions(value: js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption]): Self = this.set("subOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubOptions: Self = this.set("subOptions", js.undefined)
  }
}
