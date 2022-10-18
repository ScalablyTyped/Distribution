package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOriginationNumbersResult extends StObject {
  
  /**
    * A NextToken string is returned when you call the ListOriginationNumbers operation if additional pages of records are available.
    */
  var NextToken: js.UndefOr[nextToken] = js.undefined
  
  /**
    * A list of the calling account's verified and pending origination numbers.
    */
  var PhoneNumbers: js.UndefOr[PhoneNumberInformationList] = js.undefined
}
object ListOriginationNumbersResult {
  
  inline def apply(): ListOriginationNumbersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOriginationNumbersResult]
  }
  
  extension [Self <: ListOriginationNumbersResult](x: Self) {
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPhoneNumbers(value: PhoneNumberInformationList): Self = StObject.set(x, "PhoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersUndefined: Self = StObject.set(x, "PhoneNumbers", js.undefined)
    
    inline def setPhoneNumbersVarargs(value: PhoneNumberInformation*): Self = StObject.set(x, "PhoneNumbers", js.Array(value*))
  }
}
