package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumberError extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.clientsChimeMod.ErrorCode] = js.undefined
  
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The phone number ID for which the action failed.
    */
  var PhoneNumberId: js.UndefOr[NonEmptyString] = js.undefined
}
object PhoneNumberError {
  
  inline def apply(): PhoneNumberError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberError]
  }
  
  extension [Self <: PhoneNumberError](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setPhoneNumberId(value: NonEmptyString): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberIdUndefined: Self = StObject.set(x, "PhoneNumberId", js.undefined)
  }
}
