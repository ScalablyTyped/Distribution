package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostReservation extends StObject {
  
  /**
    * The number of Dedicated Hosts the reservation is associated with.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    * The currency in which the upfrontPrice and hourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
  
  /**
    * The length of the reservation's term, specified in seconds. Can be 31536000 (1 year) | 94608000 (3 years).
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  
  /**
    * The date and time that the reservation ends.
    */
  var End: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The IDs of the Dedicated Hosts associated with the reservation.
    */
  var HostIdSet: js.UndefOr[ResponseHostIdSet] = js.undefined
  
  /**
    * The ID of the reservation that specifies the associated Dedicated Hosts.
    */
  var HostReservationId: js.UndefOr[typings.awsSdk.clientsEc2Mod.HostReservationId] = js.undefined
  
  /**
    * The hourly price of the reservation.
    */
  var HourlyPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The instance family of the Dedicated Host Reservation. The instance family on the Dedicated Host must be the same in order for it to benefit from the reservation.
    */
  var InstanceFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the reservation. This remains the same regardless of which Dedicated Hosts are associated with it.
    */
  var OfferingId: js.UndefOr[typings.awsSdk.clientsEc2Mod.OfferingId] = js.undefined
  
  /**
    * The payment option selected for this reservation.
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.clientsEc2Mod.PaymentOption] = js.undefined
  
  /**
    * The date and time that the reservation started.
    */
  var Start: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the reservation.
    */
  var State: js.UndefOr[ReservationState] = js.undefined
  
  /**
    * Any tags assigned to the Dedicated Host Reservation.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The upfront price of the reservation.
    */
  var UpfrontPrice: js.UndefOr[String] = js.undefined
}
object HostReservation {
  
  inline def apply(): HostReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostReservation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostReservation] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setCurrencyCode(value: CurrencyCodeValues): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setEnd(value: js.Date): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
    
    inline def setHostIdSet(value: ResponseHostIdSet): Self = StObject.set(x, "HostIdSet", value.asInstanceOf[js.Any])
    
    inline def setHostIdSetUndefined: Self = StObject.set(x, "HostIdSet", js.undefined)
    
    inline def setHostIdSetVarargs(value: String*): Self = StObject.set(x, "HostIdSet", js.Array(value*))
    
    inline def setHostReservationId(value: HostReservationId): Self = StObject.set(x, "HostReservationId", value.asInstanceOf[js.Any])
    
    inline def setHostReservationIdUndefined: Self = StObject.set(x, "HostReservationId", js.undefined)
    
    inline def setHourlyPrice(value: String): Self = StObject.set(x, "HourlyPrice", value.asInstanceOf[js.Any])
    
    inline def setHourlyPriceUndefined: Self = StObject.set(x, "HourlyPrice", js.undefined)
    
    inline def setInstanceFamily(value: String): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
    
    inline def setInstanceFamilyUndefined: Self = StObject.set(x, "InstanceFamily", js.undefined)
    
    inline def setOfferingId(value: OfferingId): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
    
    inline def setOfferingIdUndefined: Self = StObject.set(x, "OfferingId", js.undefined)
    
    inline def setPaymentOption(value: PaymentOption): Self = StObject.set(x, "PaymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionUndefined: Self = StObject.set(x, "PaymentOption", js.undefined)
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
    
    inline def setState(value: ReservationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUpfrontPrice(value: String): Self = StObject.set(x, "UpfrontPrice", value.asInstanceOf[js.Any])
    
    inline def setUpfrontPriceUndefined: Self = StObject.set(x, "UpfrontPrice", js.undefined)
  }
}
