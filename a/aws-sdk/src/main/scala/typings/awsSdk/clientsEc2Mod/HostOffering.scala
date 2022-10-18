package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostOffering extends StObject {
  
  /**
    * The currency of the offering.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
  
  /**
    * The duration of the offering (in seconds).
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  
  /**
    * The hourly price of the offering.
    */
  var HourlyPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The instance family of the offering.
    */
  var InstanceFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the offering.
    */
  var OfferingId: js.UndefOr[typings.awsSdk.clientsEc2Mod.OfferingId] = js.undefined
  
  /**
    * The available payment option.
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.clientsEc2Mod.PaymentOption] = js.undefined
  
  /**
    * The upfront price of the offering. Does not apply to No Upfront offerings.
    */
  var UpfrontPrice: js.UndefOr[String] = js.undefined
}
object HostOffering {
  
  inline def apply(): HostOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostOffering]
  }
  
  extension [Self <: HostOffering](x: Self) {
    
    inline def setCurrencyCode(value: CurrencyCodeValues): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setHourlyPrice(value: String): Self = StObject.set(x, "HourlyPrice", value.asInstanceOf[js.Any])
    
    inline def setHourlyPriceUndefined: Self = StObject.set(x, "HourlyPrice", js.undefined)
    
    inline def setInstanceFamily(value: String): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
    
    inline def setInstanceFamilyUndefined: Self = StObject.set(x, "InstanceFamily", js.undefined)
    
    inline def setOfferingId(value: OfferingId): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
    
    inline def setOfferingIdUndefined: Self = StObject.set(x, "OfferingId", js.undefined)
    
    inline def setPaymentOption(value: PaymentOption): Self = StObject.set(x, "PaymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionUndefined: Self = StObject.set(x, "PaymentOption", js.undefined)
    
    inline def setUpfrontPrice(value: String): Self = StObject.set(x, "UpfrontPrice", value.asInstanceOf[js.Any])
    
    inline def setUpfrontPriceUndefined: Self = StObject.set(x, "UpfrontPrice", js.undefined)
  }
}
