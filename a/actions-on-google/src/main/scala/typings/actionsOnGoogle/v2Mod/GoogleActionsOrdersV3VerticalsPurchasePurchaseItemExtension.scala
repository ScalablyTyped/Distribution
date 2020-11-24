package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension extends js.Object {
  
  /**
    * Any extra fields exchanged between merchant and google.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  /**
    * Fulfillment info for this line item. If unset, this line item
    * inherits order level fulfillment info.
    */
  var fulfillmentInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo] = js.native
  
  /**
    * Additional add-ons or sub-items.
    */
  var itemOptions: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption]] = js.native
  
  /**
    * Details about the product.
    */
  var productDetails: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchaseProductDetails] = js.native
  
  /**
    * Product or offer id associated with this line item.
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * Quantity of the item.
    */
  var quantity: js.UndefOr[Double] = js.native
  
  /**
    * Returns info for this line item. If unset, this line item
    * inherits order level returns info.
    */
  var returnsInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo] = js.native
  
  /**
    * Required: Line item level status.
    */
  var status: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionStatus] = js.native
  
  /**
    * Required: Type of purchase.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionType] = js.native
  
  /**
    * Unit measure.
    * Specifies the size of the item in chosen units. The size, together with
    * the active price is used to determine the unit price.
    */
  var unitMeasure: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure] = js.native
  
  /**
    * Required: User visible label/string for the status.
    * Max allowed length is 50 chars.
    */
  var userVisibleStatusLabel: js.UndefOr[String] = js.native
}
object GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionOps[Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension] (val x: Self) extends AnyVal {
    
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
    def setExtension(value: ApiClientObjectMap[_]): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setFulfillmentInfo(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo): Self = this.set("fulfillmentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulfillmentInfo: Self = this.set("fulfillmentInfo", js.undefined)
    
    @scala.inline
    def setItemOptionsVarargs(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption*): Self = this.set("itemOptions", js.Array(value :_*))
    
    @scala.inline
    def setItemOptions(value: js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption]): Self = this.set("itemOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemOptions: Self = this.set("itemOptions", js.undefined)
    
    @scala.inline
    def setProductDetails(value: GoogleActionsOrdersV3VerticalsPurchaseProductDetails): Self = this.set("productDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductDetails: Self = this.set("productDetails", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setReturnsInfo(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo): Self = this.set("returnsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnsInfo: Self = this.set("returnsInfo", js.undefined)
    
    @scala.inline
    def setStatus(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnitMeasure(value: GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure): Self = this.set("unitMeasure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitMeasure: Self = this.set("unitMeasure", js.undefined)
    
    @scala.inline
    def setUserVisibleStatusLabel(value: String): Self = this.set("userVisibleStatusLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVisibleStatusLabel: Self = this.set("userVisibleStatusLabel", js.undefined)
  }
}
