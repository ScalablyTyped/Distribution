package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAvailablePhoneNumbersResponse extends StObject {
  
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.undefined
  
  /**
    * The token used to retrieve the next page of search results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object SearchAvailablePhoneNumbersResponse {
  
  inline def apply(): SearchAvailablePhoneNumbersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAvailablePhoneNumbersResponse]
  }
  
  extension [Self <: SearchAvailablePhoneNumbersResponse](x: Self) {
    
    inline def setE164PhoneNumbers(value: E164PhoneNumberList): Self = StObject.set(x, "E164PhoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setE164PhoneNumbersUndefined: Self = StObject.set(x, "E164PhoneNumbers", js.undefined)
    
    inline def setE164PhoneNumbersVarargs(value: E164PhoneNumber*): Self = StObject.set(x, "E164PhoneNumbers", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
