package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension extends js.Object {
  
  /**
    * Optional: Errors because of which this order was rejected.
    */
  var errors: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseError]] = js.native
  
  /**
    * Any extra fields exchanged between merchant and google.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  /**
    * Fulfillment info for the order.
    */
  var fulfillmentInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo] = js.native
  
  /**
    * Location of the purchase (in-store / online)
    */
  var purchaseLocationType: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionPurchaseLocationType] = js.native
  
  /**
    * Return info for the order.
    */
  var returnsInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo] = js.native
  
  /**
    * Required: Overall Status for the order.
    */
  var status: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionStatus] = js.native
  
  /**
    * Required: Type of purchase.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionType] = js.native
  
  /**
    * User visible label/string for the status.
    * Max allowed length is 50 chars.
    */
  var userVisibleStatusLabel: js.UndefOr[String] = js.native
}
object GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionOps[Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setExtension(value: ApiClientObjectMap[_]): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setFulfillmentInfo(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo): Self = this.set("fulfillmentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulfillmentInfo: Self = this.set("fulfillmentInfo", js.undefined)
    
    @scala.inline
    def setPurchaseLocationType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionPurchaseLocationType): Self = this.set("purchaseLocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseLocationType: Self = this.set("purchaseLocationType", js.undefined)
    
    @scala.inline
    def setReturnsInfo(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo): Self = this.set("returnsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnsInfo: Self = this.set("returnsInfo", js.undefined)
    
    @scala.inline
    def setStatus(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUserVisibleStatusLabel(value: String): Self = this.set("userVisibleStatusLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVisibleStatusLabel: Self = this.set("userVisibleStatusLabel", js.undefined)
  }
}
