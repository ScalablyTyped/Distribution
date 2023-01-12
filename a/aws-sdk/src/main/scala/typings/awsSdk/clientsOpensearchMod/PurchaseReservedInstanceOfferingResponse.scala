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
    * The ID of the Reserved Instance offering that was purchased.
    */
  var ReservedInstanceId: js.UndefOr[GUID] = js.undefined
}
object PurchaseReservedInstanceOfferingResponse {
  
  inline def apply(): PurchaseReservedInstanceOfferingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedInstanceOfferingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PurchaseReservedInstanceOfferingResponse] (val x: Self) extends AnyVal {
    
    inline def setReservationName(value: ReservationToken): Self = StObject.set(x, "ReservationName", value.asInstanceOf[js.Any])
    
    inline def setReservationNameUndefined: Self = StObject.set(x, "ReservationName", js.undefined)
    
    inline def setReservedInstanceId(value: GUID): Self = StObject.set(x, "ReservedInstanceId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstanceIdUndefined: Self = StObject.set(x, "ReservedInstanceId", js.undefined)
  }
}
