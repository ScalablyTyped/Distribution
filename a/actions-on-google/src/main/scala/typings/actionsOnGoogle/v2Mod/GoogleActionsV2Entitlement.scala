package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2Entitlement extends StObject {
  
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
  implicit class GoogleActionsV2EntitlementMutableBuilder[Self <: GoogleActionsV2Entitlement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInAppDetails(value: GoogleActionsV2SignedData): Self = StObject.set(x, "inAppDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAppDetailsUndefined: Self = StObject.set(x, "inAppDetails", js.undefined)
    
    @scala.inline
    def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuType(value: GoogleActionsV2EntitlementSkuType): Self = StObject.set(x, "skuType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuTypeUndefined: Self = StObject.set(x, "skuType", js.undefined)
    
    @scala.inline
    def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
  }
}
