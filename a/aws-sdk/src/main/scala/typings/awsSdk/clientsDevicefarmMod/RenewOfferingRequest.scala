package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenewOfferingRequest extends StObject {
  
  /**
    * The ID of a request to renew an offering.
    */
  var offeringId: OfferingIdentifier
  
  /**
    * The quantity requested in an offering renewal.
    */
  var quantity: Integer
}
object RenewOfferingRequest {
  
  inline def apply(offeringId: OfferingIdentifier, quantity: Integer): RenewOfferingRequest = {
    val __obj = js.Dynamic.literal(offeringId = offeringId.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenewOfferingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenewOfferingRequest] (val x: Self) extends AnyVal {
    
    inline def setOfferingId(value: OfferingIdentifier): Self = StObject.set(x, "offeringId", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Integer): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
  }
}
