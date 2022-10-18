package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseHostReservationRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The currency in which the totalUpfrontPrice, LimitPrice, and totalHourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
  
  /**
    * The IDs of the Dedicated Hosts with which the reservation will be associated.
    */
  var HostIdSet: RequestHostIdSet
  
  /**
    * The specified limit is checked against the total upfront cost of the reservation (calculated as the offering's upfront cost multiplied by the host count). If the total upfront cost is greater than the specified price limit, the request fails. This is used to ensure that the purchase does not exceed the expected upfront cost of the purchase. At this time, the only supported currency is USD. For example, to indicate a limit price of USD 100, specify 100.00.
    */
  var LimitPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the offering.
    */
  var OfferingId: typings.awsSdk.clientsEc2Mod.OfferingId
  
  /**
    * The tags to apply to the Dedicated Host Reservation during purchase.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object PurchaseHostReservationRequest {
  
  inline def apply(HostIdSet: RequestHostIdSet, OfferingId: OfferingId): PurchaseHostReservationRequest = {
    val __obj = js.Dynamic.literal(HostIdSet = HostIdSet.asInstanceOf[js.Any], OfferingId = OfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseHostReservationRequest]
  }
  
  extension [Self <: PurchaseHostReservationRequest](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setCurrencyCode(value: CurrencyCodeValues): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setHostIdSet(value: RequestHostIdSet): Self = StObject.set(x, "HostIdSet", value.asInstanceOf[js.Any])
    
    inline def setHostIdSetVarargs(value: DedicatedHostId*): Self = StObject.set(x, "HostIdSet", js.Array(value*))
    
    inline def setLimitPrice(value: String): Self = StObject.set(x, "LimitPrice", value.asInstanceOf[js.Any])
    
    inline def setLimitPriceUndefined: Self = StObject.set(x, "LimitPrice", js.undefined)
    
    inline def setOfferingId(value: OfferingId): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
