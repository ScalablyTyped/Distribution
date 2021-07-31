package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAvailablePhoneNumbersRequest extends StObject {
  
  /**
    * The area code used to filter results.
    */
  var AreaCode: js.UndefOr[String] = js.undefined
  
  /**
    * The city used to filter results.
    */
  var City: js.UndefOr[String] = js.undefined
  
  /**
    * The country used to filter results.
    */
  var Country: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[PhoneNumberMaxResults] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The state used to filter results.
    */
  var State: js.UndefOr[String] = js.undefined
  
  /**
    * The toll-free prefix that you use to filter results.
    */
  var TollFreePrefix: js.UndefOr[typings.awsSdk.chimeMod.TollFreePrefix] = js.undefined
}
object SearchAvailablePhoneNumbersRequest {
  
  @scala.inline
  def apply(): SearchAvailablePhoneNumbersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAvailablePhoneNumbersRequest]
  }
  
  @scala.inline
  implicit class SearchAvailablePhoneNumbersRequestMutableBuilder[Self <: SearchAvailablePhoneNumbersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreaCode(value: String): Self = StObject.set(x, "AreaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaCodeUndefined: Self = StObject.set(x, "AreaCode", js.undefined)
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PhoneNumberMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTollFreePrefix(value: TollFreePrefix): Self = StObject.set(x, "TollFreePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTollFreePrefixUndefined: Self = StObject.set(x, "TollFreePrefix", js.undefined)
  }
}
