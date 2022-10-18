package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPhoneNumbersOptedOutResponse extends StObject {
  
  /**
    * A NextToken string is returned when you call the ListPhoneNumbersOptedOut action if additional records are available after the first page of results.
    */
  var nextToken: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * A list of phone numbers that are opted out of receiving SMS messages. The list is paginated, and each page can contain up to 100 phone numbers.
    */
  var phoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined
}
object ListPhoneNumbersOptedOutResponse {
  
  inline def apply(): ListPhoneNumbersOptedOutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhoneNumbersOptedOutResponse]
  }
  
  extension [Self <: ListPhoneNumbersOptedOutResponse](x: Self) {
    
    inline def setNextToken(value: java.lang.String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPhoneNumbers(value: PhoneNumberList): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersUndefined: Self = StObject.set(x, "phoneNumbers", js.undefined)
    
    inline def setPhoneNumbersVarargs(value: PhoneNumber*): Self = StObject.set(x, "phoneNumbers", js.Array(value*))
  }
}
