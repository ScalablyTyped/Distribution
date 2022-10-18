package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseOfferingRequest extends StObject {
  
  /**
    * The ID of the offering.
    */
  var offeringId: OfferingIdentifier
  
  /**
    * The ID of the offering promotion to be applied to the purchase.
    */
  var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier] = js.undefined
  
  /**
    * The number of device slots to purchase in an offering request.
    */
  var quantity: Integer
}
object PurchaseOfferingRequest {
  
  inline def apply(offeringId: OfferingIdentifier, quantity: Integer): PurchaseOfferingRequest = {
    val __obj = js.Dynamic.literal(offeringId = offeringId.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseOfferingRequest]
  }
  
  extension [Self <: PurchaseOfferingRequest](x: Self) {
    
    inline def setOfferingId(value: OfferingIdentifier): Self = StObject.set(x, "offeringId", value.asInstanceOf[js.Any])
    
    inline def setOfferingPromotionId(value: OfferingPromotionIdentifier): Self = StObject.set(x, "offeringPromotionId", value.asInstanceOf[js.Any])
    
    inline def setOfferingPromotionIdUndefined: Self = StObject.set(x, "offeringPromotionId", js.undefined)
    
    inline def setQuantity(value: Integer): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
  }
}
