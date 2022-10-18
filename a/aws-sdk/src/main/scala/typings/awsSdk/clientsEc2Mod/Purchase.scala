package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Purchase extends StObject {
  
  /**
    * The currency in which the UpfrontPrice and HourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
  
  /**
    * The duration of the reservation's term in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  
  /**
    * The IDs of the Dedicated Hosts associated with the reservation.
    */
  var HostIdSet: js.UndefOr[ResponseHostIdSet] = js.undefined
  
  /**
    * The ID of the reservation.
    */
  var HostReservationId: js.UndefOr[typings.awsSdk.clientsEc2Mod.HostReservationId] = js.undefined
  
  /**
    * The hourly price of the reservation per hour.
    */
  var HourlyPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The instance family on the Dedicated Host that the reservation can be associated with.
    */
  var InstanceFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The payment option for the reservation.
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.clientsEc2Mod.PaymentOption] = js.undefined
  
  /**
    * The upfront price of the reservation.
    */
  var UpfrontPrice: js.UndefOr[String] = js.undefined
}
object Purchase {
  
  inline def apply(): Purchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Purchase]
  }
  
  extension [Self <: Purchase](x: Self) {
    
    inline def setCurrencyCode(value: CurrencyCodeValues): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setHostIdSet(value: ResponseHostIdSet): Self = StObject.set(x, "HostIdSet", value.asInstanceOf[js.Any])
    
    inline def setHostIdSetUndefined: Self = StObject.set(x, "HostIdSet", js.undefined)
    
    inline def setHostIdSetVarargs(value: String*): Self = StObject.set(x, "HostIdSet", js.Array(value*))
    
    inline def setHostReservationId(value: HostReservationId): Self = StObject.set(x, "HostReservationId", value.asInstanceOf[js.Any])
    
    inline def setHostReservationIdUndefined: Self = StObject.set(x, "HostReservationId", js.undefined)
    
    inline def setHourlyPrice(value: String): Self = StObject.set(x, "HourlyPrice", value.asInstanceOf[js.Any])
    
    inline def setHourlyPriceUndefined: Self = StObject.set(x, "HourlyPrice", js.undefined)
    
    inline def setInstanceFamily(value: String): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
    
    inline def setInstanceFamilyUndefined: Self = StObject.set(x, "InstanceFamily", js.undefined)
    
    inline def setPaymentOption(value: PaymentOption): Self = StObject.set(x, "PaymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionUndefined: Self = StObject.set(x, "PaymentOption", js.undefined)
    
    inline def setUpfrontPrice(value: String): Self = StObject.set(x, "UpfrontPrice", value.asInstanceOf[js.Any])
    
    inline def setUpfrontPriceUndefined: Self = StObject.set(x, "UpfrontPrice", js.undefined)
  }
}
