package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2Entitlement extends StObject {
  
  /**
    * Only present for in-app purchase and in-app subs.
    */
  var inAppDetails: js.UndefOr[GoogleActionsV2SignedData] = js.undefined
  
  /**
    * Product sku. Package name for paid app, suffix of Finsky docid for
    * in-app purchase and in-app subscription.
    * Match getSku() in Play InApp Billing API.
    */
  var sku: js.UndefOr[String] = js.undefined
  
  var skuType: js.UndefOr[GoogleActionsV2EntitlementSkuType] = js.undefined
}
object GoogleActionsV2Entitlement {
  
  inline def apply(): GoogleActionsV2Entitlement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Entitlement]
  }
  
  extension [Self <: GoogleActionsV2Entitlement](x: Self) {
    
    inline def setInAppDetails(value: GoogleActionsV2SignedData): Self = StObject.set(x, "inAppDetails", value.asInstanceOf[js.Any])
    
    inline def setInAppDetailsUndefined: Self = StObject.set(x, "inAppDetails", js.undefined)
    
    inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setSkuType(value: GoogleActionsV2EntitlementSkuType): Self = StObject.set(x, "skuType", value.asInstanceOf[js.Any])
    
    inline def setSkuTypeUndefined: Self = StObject.set(x, "skuType", js.undefined)
    
    inline def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
  }
}
