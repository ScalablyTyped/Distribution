package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSupportedPhoneNumberCountriesResponse extends StObject {
  
  /**
    * The supported phone number countries.
    */
  var PhoneNumberCountries: js.UndefOr[PhoneNumberCountriesList] = js.undefined
}
object ListSupportedPhoneNumberCountriesResponse {
  
  inline def apply(): ListSupportedPhoneNumberCountriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSupportedPhoneNumberCountriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSupportedPhoneNumberCountriesResponse] (val x: Self) extends AnyVal {
    
    inline def setPhoneNumberCountries(value: PhoneNumberCountriesList): Self = StObject.set(x, "PhoneNumberCountries", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberCountriesUndefined: Self = StObject.set(x, "PhoneNumberCountries", js.undefined)
    
    inline def setPhoneNumberCountriesVarargs(value: PhoneNumberCountry*): Self = StObject.set(x, "PhoneNumberCountries", js.Array(value*))
  }
}
