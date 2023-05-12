package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAvailablePhoneNumbersResponse extends StObject {
  
  /**
    * Confines a search to just the phone numbers in the E.164 format.
    */
  var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.undefined
  
  /**
    * The token used to return the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object SearchAvailablePhoneNumbersResponse {
  
  inline def apply(): SearchAvailablePhoneNumbersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAvailablePhoneNumbersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchAvailablePhoneNumbersResponse] (val x: Self) extends AnyVal {
    
    inline def setE164PhoneNumbers(value: E164PhoneNumberList): Self = StObject.set(x, "E164PhoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setE164PhoneNumbersUndefined: Self = StObject.set(x, "E164PhoneNumbers", js.undefined)
    
    inline def setE164PhoneNumbersVarargs(value: E164PhoneNumber*): Self = StObject.set(x, "E164PhoneNumbers", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
