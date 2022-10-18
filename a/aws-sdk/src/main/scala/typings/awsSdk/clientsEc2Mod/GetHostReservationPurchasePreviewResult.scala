package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHostReservationPurchasePreviewResult extends StObject {
  
  /**
    * The currency in which the totalUpfrontPrice and totalHourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
  
  /**
    * The purchase information of the Dedicated Host reservation and the Dedicated Hosts associated with it.
    */
  var Purchase: js.UndefOr[PurchaseSet] = js.undefined
  
  /**
    * The potential total hourly price of the reservation per hour.
    */
  var TotalHourlyPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The potential total upfront price. This is billed immediately.
    */
  var TotalUpfrontPrice: js.UndefOr[String] = js.undefined
}
object GetHostReservationPurchasePreviewResult {
  
  inline def apply(): GetHostReservationPurchasePreviewResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHostReservationPurchasePreviewResult]
  }
  
  extension [Self <: GetHostReservationPurchasePreviewResult](x: Self) {
    
    inline def setCurrencyCode(value: CurrencyCodeValues): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setPurchase(value: PurchaseSet): Self = StObject.set(x, "Purchase", value.asInstanceOf[js.Any])
    
    inline def setPurchaseUndefined: Self = StObject.set(x, "Purchase", js.undefined)
    
    inline def setPurchaseVarargs(value: Purchase*): Self = StObject.set(x, "Purchase", js.Array(value*))
    
    inline def setTotalHourlyPrice(value: String): Self = StObject.set(x, "TotalHourlyPrice", value.asInstanceOf[js.Any])
    
    inline def setTotalHourlyPriceUndefined: Self = StObject.set(x, "TotalHourlyPrice", js.undefined)
    
    inline def setTotalUpfrontPrice(value: String): Self = StObject.set(x, "TotalUpfrontPrice", value.asInstanceOf[js.Any])
    
    inline def setTotalUpfrontPriceUndefined: Self = StObject.set(x, "TotalUpfrontPrice", js.undefined)
  }
}
