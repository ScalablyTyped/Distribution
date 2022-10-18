package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseReservedInstanceOfferingResponse extends StObject {
  
  /**
    * The customer-specified identifier used to track this reservation.
    */
  var ReservationName: js.UndefOr[ReservationToken] = js.undefined
  
  /**
    * Details of the reserved OpenSearch instance which was purchased.
    */
  var ReservedInstanceId: js.UndefOr[GUID] = js.undefined
}
object PurchaseReservedInstanceOfferingResponse {
  
  inline def apply(): PurchaseReservedInstanceOfferingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedInstanceOfferingResponse]
  }
  
  extension [Self <: PurchaseReservedInstanceOfferingResponse](x: Self) {
    
    inline def setReservationName(value: ReservationToken): Self = StObject.set(x, "ReservationName", value.asInstanceOf[js.Any])
    
    inline def setReservationNameUndefined: Self = StObject.set(x, "ReservationName", js.undefined)
    
    inline def setReservedInstanceId(value: GUID): Self = StObject.set(x, "ReservedInstanceId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstanceIdUndefined: Self = StObject.set(x, "ReservedInstanceId", js.undefined)
  }
}
