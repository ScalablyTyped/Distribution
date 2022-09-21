package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2SignedData extends StObject {
  
  /**
    * Matches IN_APP_DATA_SIGNATURE from getPurchases() method in Play InApp
    * Billing API.
    */
  var inAppDataSignature: js.UndefOr[String] = js.undefined
  
  /**
    * Match INAPP_PURCHASE_DATA
    * from getPurchases() method. Contains all inapp purchase data in JSON format
    * See details in table 6 of
    * https://developer.android.com/google/play/billing/billing_reference.html.
    */
  var inAppPurchaseData: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
}
object GoogleActionsV2SignedData {
  
  inline def apply(): GoogleActionsV2SignedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SignedData]
  }
  
  extension [Self <: GoogleActionsV2SignedData](x: Self) {
    
    inline def setInAppDataSignature(value: String): Self = StObject.set(x, "inAppDataSignature", value.asInstanceOf[js.Any])
    
    inline def setInAppDataSignatureUndefined: Self = StObject.set(x, "inAppDataSignature", js.undefined)
    
    inline def setInAppPurchaseData(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "inAppPurchaseData", value.asInstanceOf[js.Any])
    
    inline def setInAppPurchaseDataUndefined: Self = StObject.set(x, "inAppPurchaseData", js.undefined)
  }
}
