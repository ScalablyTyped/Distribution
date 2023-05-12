package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAvailablePhoneNumbersRequest extends StObject {
  
  /**
    * Confines a search to just the phone numbers associated with the specified area code.
    */
  var AreaCode: js.UndefOr[String] = js.undefined
  
  /**
    * Confines a search to just the phone numbers associated with the specified city.
    */
  var City: js.UndefOr[String] = js.undefined
  
  /**
    * Confines a search to just the phone numbers associated with the specified country.
    */
  var Country: js.UndefOr[Alpha2CountryCode] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[PhoneNumberMaxResults] = js.undefined
  
  /**
    * The token used to return the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Confines a search to just the phone numbers associated with the specified phone number type, either local or toll-free.
    */
  var PhoneNumberType: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.PhoneNumberType] = js.undefined
  
  /**
    * Confines a search to just the phone numbers associated with the specified state.
    */
  var State: js.UndefOr[String] = js.undefined
  
  /**
    * Confines a search to just the phone numbers associated with the specified toll-free prefix.
    */
  var TollFreePrefix: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.TollFreePrefix] = js.undefined
}
object SearchAvailablePhoneNumbersRequest {
  
  inline def apply(): SearchAvailablePhoneNumbersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAvailablePhoneNumbersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchAvailablePhoneNumbersRequest] (val x: Self) extends AnyVal {
    
    inline def setAreaCode(value: String): Self = StObject.set(x, "AreaCode", value.asInstanceOf[js.Any])
    
    inline def setAreaCodeUndefined: Self = StObject.set(x, "AreaCode", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    inline def setCountry(value: Alpha2CountryCode): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setMaxResults(value: PhoneNumberMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPhoneNumberType(value: PhoneNumberType): Self = StObject.set(x, "PhoneNumberType", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberTypeUndefined: Self = StObject.set(x, "PhoneNumberType", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTollFreePrefix(value: TollFreePrefix): Self = StObject.set(x, "TollFreePrefix", value.asInstanceOf[js.Any])
    
    inline def setTollFreePrefixUndefined: Self = StObject.set(x, "TollFreePrefix", js.undefined)
  }
}
