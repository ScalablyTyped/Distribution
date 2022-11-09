package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseReservedInstanceOfferingRequest extends StObject {
  
  /**
    * The number of OpenSearch instances to reserve.
    */
  var InstanceCount: js.UndefOr[typings.awsSdk.clientsOpensearchMod.InstanceCount] = js.undefined
  
  /**
    * A customer-specified identifier to track this reservation.
    */
  var ReservationName: ReservationToken
  
  /**
    * The ID of the Reserved Instance offering to purchase.
    */
  var ReservedInstanceOfferingId: GUID
}
object PurchaseReservedInstanceOfferingRequest {
  
  inline def apply(ReservationName: ReservationToken, ReservedInstanceOfferingId: GUID): PurchaseReservedInstanceOfferingRequest = {
    val __obj = js.Dynamic.literal(ReservationName = ReservationName.asInstanceOf[js.Any], ReservedInstanceOfferingId = ReservedInstanceOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedInstanceOfferingRequest]
  }
  
  extension [Self <: PurchaseReservedInstanceOfferingRequest](x: Self) {
    
    inline def setInstanceCount(value: InstanceCount): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setReservationName(value: ReservationToken): Self = StObject.set(x, "ReservationName", value.asInstanceOf[js.Any])
    
    inline def setReservedInstanceOfferingId(value: GUID): Self = StObject.set(x, "ReservedInstanceOfferingId", value.asInstanceOf[js.Any])
  }
}
