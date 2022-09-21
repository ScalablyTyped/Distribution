package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MerchantAddress extends StObject {
  
  var merchantAddress: js.UndefOr[String] = js.undefined
  
  var merchantCity: js.UndefOr[String] = js.undefined
  
  var merchantName: js.UndefOr[String] = js.undefined
  
  var merchantPhone: js.UndefOr[String] = js.undefined
  
  var merchantState: js.UndefOr[String] = js.undefined
  
  var merchantZip: js.UndefOr[String] = js.undefined
}
object MerchantAddress {
  
  inline def apply(): MerchantAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantAddress]
  }
  
  extension [Self <: MerchantAddress](x: Self) {
    
    inline def setMerchantAddress(value: String): Self = StObject.set(x, "merchantAddress", value.asInstanceOf[js.Any])
    
    inline def setMerchantAddressUndefined: Self = StObject.set(x, "merchantAddress", js.undefined)
    
    inline def setMerchantCity(value: String): Self = StObject.set(x, "merchantCity", value.asInstanceOf[js.Any])
    
    inline def setMerchantCityUndefined: Self = StObject.set(x, "merchantCity", js.undefined)
    
    inline def setMerchantName(value: String): Self = StObject.set(x, "merchantName", value.asInstanceOf[js.Any])
    
    inline def setMerchantNameUndefined: Self = StObject.set(x, "merchantName", js.undefined)
    
    inline def setMerchantPhone(value: String): Self = StObject.set(x, "merchantPhone", value.asInstanceOf[js.Any])
    
    inline def setMerchantPhoneUndefined: Self = StObject.set(x, "merchantPhone", js.undefined)
    
    inline def setMerchantState(value: String): Self = StObject.set(x, "merchantState", value.asInstanceOf[js.Any])
    
    inline def setMerchantStateUndefined: Self = StObject.set(x, "merchantState", js.undefined)
    
    inline def setMerchantZip(value: String): Self = StObject.set(x, "merchantZip", value.asInstanceOf[js.Any])
    
    inline def setMerchantZipUndefined: Self = StObject.set(x, "merchantZip", js.undefined)
  }
}
