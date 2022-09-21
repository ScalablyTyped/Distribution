package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension extends StObject {
  
  /**
    * Optional: Errors because of which this order was rejected.
    */
  var errors: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseError]] = js.undefined
  
  /**
    * Any extra fields exchanged between merchant and google.
    */
  var `extension`: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
  
  /**
    * Fulfillment info for the order.
    */
  var fulfillmentInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo] = js.undefined
  
  /**
    * Location of the purchase (in-store / online)
    */
  var purchaseLocationType: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionPurchaseLocationType] = js.undefined
  
  /**
    * Return info for the order.
    */
  var returnsInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo] = js.undefined
  
  /**
    * Required: Overall Status for the order.
    */
  var status: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionStatus] = js.undefined
  
  /**
    * Required: Type of purchase.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionType] = js.undefined
  
  /**
    * User visible label/string for the status.
    * Max allowed length is 50 chars.
    */
  var userVisibleStatusLabel: js.UndefOr[String] = js.undefined
}
object GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension {
  
  inline def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension]
  }
  
  extension [Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension](x: Self) {
    
    inline def setErrors(value: js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setExtension(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setFulfillmentInfo(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo): Self = StObject.set(x, "fulfillmentInfo", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentInfoUndefined: Self = StObject.set(x, "fulfillmentInfo", js.undefined)
    
    inline def setPurchaseLocationType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionPurchaseLocationType): Self = StObject.set(x, "purchaseLocationType", value.asInstanceOf[js.Any])
    
    inline def setPurchaseLocationTypeUndefined: Self = StObject.set(x, "purchaseLocationType", js.undefined)
    
    inline def setReturnsInfo(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo): Self = StObject.set(x, "returnsInfo", value.asInstanceOf[js.Any])
    
    inline def setReturnsInfoUndefined: Self = StObject.set(x, "returnsInfo", js.undefined)
    
    inline def setStatus(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtensionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserVisibleStatusLabel(value: String): Self = StObject.set(x, "userVisibleStatusLabel", value.asInstanceOf[js.Any])
    
    inline def setUserVisibleStatusLabelUndefined: Self = StObject.set(x, "userVisibleStatusLabel", js.undefined)
  }
}
