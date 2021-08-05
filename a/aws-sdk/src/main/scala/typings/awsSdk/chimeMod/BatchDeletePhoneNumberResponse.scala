package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeletePhoneNumberResponse extends StObject {
  
  /**
    * If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned, along with error codes and error messages.
    */
  var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
}
object BatchDeletePhoneNumberResponse {
  
  inline def apply(): BatchDeletePhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeletePhoneNumberResponse]
  }
  
  extension [Self <: BatchDeletePhoneNumberResponse](x: Self) {
    
    inline def setPhoneNumberErrors(value: PhoneNumberErrorList): Self = StObject.set(x, "PhoneNumberErrors", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberErrorsUndefined: Self = StObject.set(x, "PhoneNumberErrors", js.undefined)
    
    inline def setPhoneNumberErrorsVarargs(value: PhoneNumberError*): Self = StObject.set(x, "PhoneNumberErrors", js.Array(value :_*))
  }
}
