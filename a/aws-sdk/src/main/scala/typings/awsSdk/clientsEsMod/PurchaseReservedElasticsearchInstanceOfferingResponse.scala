package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseReservedElasticsearchInstanceOfferingResponse extends StObject {
  
  /**
    * The customer-specified identifier used to track this reservation.
    */
  var ReservationName: js.UndefOr[ReservationToken] = js.undefined
  
  /**
    * Details of the reserved Elasticsearch instance which was purchased.
    */
  var ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined
}
object PurchaseReservedElasticsearchInstanceOfferingResponse {
  
  inline def apply(): PurchaseReservedElasticsearchInstanceOfferingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedElasticsearchInstanceOfferingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PurchaseReservedElasticsearchInstanceOfferingResponse] (val x: Self) extends AnyVal {
    
    inline def setReservationName(value: ReservationToken): Self = StObject.set(x, "ReservationName", value.asInstanceOf[js.Any])
    
    inline def setReservationNameUndefined: Self = StObject.set(x, "ReservationName", js.undefined)
    
    inline def setReservedElasticsearchInstanceId(value: GUID): Self = StObject.set(x, "ReservedElasticsearchInstanceId", value.asInstanceOf[js.Any])
    
    inline def setReservedElasticsearchInstanceIdUndefined: Self = StObject.set(x, "ReservedElasticsearchInstanceId", js.undefined)
  }
}
