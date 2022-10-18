package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPhoneNumbersResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The phone number details.
    */
  var PhoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined
}
object ListPhoneNumbersResponse {
  
  inline def apply(): ListPhoneNumbersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhoneNumbersResponse]
  }
  
  extension [Self <: ListPhoneNumbersResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPhoneNumbers(value: PhoneNumberList): Self = StObject.set(x, "PhoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersUndefined: Self = StObject.set(x, "PhoneNumbers", js.undefined)
    
    inline def setPhoneNumbersVarargs(value: PhoneNumber*): Self = StObject.set(x, "PhoneNumbers", js.Array(value*))
  }
}
