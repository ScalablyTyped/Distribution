package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumberCountry extends StObject {
  
  /**
    * The phone number country code. Format: ISO 3166-1 alpha-2.
    */
  var CountryCode: js.UndefOr[Alpha2CountryCode] = js.undefined
  
  /**
    * The supported phone number types. 
    */
  var SupportedPhoneNumberTypes: js.UndefOr[PhoneNumberTypeList] = js.undefined
}
object PhoneNumberCountry {
  
  inline def apply(): PhoneNumberCountry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberCountry]
  }
  
  extension [Self <: PhoneNumberCountry](x: Self) {
    
    inline def setCountryCode(value: Alpha2CountryCode): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "CountryCode", js.undefined)
    
    inline def setSupportedPhoneNumberTypes(value: PhoneNumberTypeList): Self = StObject.set(x, "SupportedPhoneNumberTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedPhoneNumberTypesUndefined: Self = StObject.set(x, "SupportedPhoneNumberTypes", js.undefined)
    
    inline def setSupportedPhoneNumberTypesVarargs(value: PhoneNumberType*): Self = StObject.set(x, "SupportedPhoneNumberTypes", js.Array(value*))
  }
}
