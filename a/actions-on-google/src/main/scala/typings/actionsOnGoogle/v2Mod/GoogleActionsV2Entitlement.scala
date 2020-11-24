package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2Entitlement extends js.Object {
  
  /**
    * Only present for in-app purchase and in-app subs.
    */
  var inAppDetails: js.UndefOr[GoogleActionsV2SignedData] = js.native
  
  /**
    * Product sku. Package name for paid app, suffix of Finsky docid for
    * in-app purchase and in-app subscription.
    * Match getSku() in Play InApp Billing API.
    */
  var sku: js.UndefOr[String] = js.native
  
  var skuType: js.UndefOr[GoogleActionsV2EntitlementSkuType] = js.native
}
object GoogleActionsV2Entitlement {
  
  @scala.inline
  def apply(): GoogleActionsV2Entitlement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Entitlement]
  }
  
  @scala.inline
  implicit class GoogleActionsV2EntitlementOps[Self <: GoogleActionsV2Entitlement] (val x: Self) extends AnyVal {
    
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
    def setInAppDetails(value: GoogleActionsV2SignedData): Self = this.set("inAppDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInAppDetails: Self = this.set("inAppDetails", js.undefined)
    
    @scala.inline
    def setSku(value: String): Self = this.set("sku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSku: Self = this.set("sku", js.undefined)
    
    @scala.inline
    def setSkuType(value: GoogleActionsV2EntitlementSkuType): Self = this.set("skuType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkuType: Self = this.set("skuType", js.undefined)
  }
}
