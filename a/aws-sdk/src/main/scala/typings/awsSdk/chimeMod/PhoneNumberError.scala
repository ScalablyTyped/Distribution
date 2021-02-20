package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumberError extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.chimeMod.ErrorCode] = js.native
  
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * The phone number ID for which the action failed.
    */
  var PhoneNumberId: js.UndefOr[NonEmptyString] = js.native
}
object PhoneNumberError {
  
  @scala.inline
  def apply(): PhoneNumberError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberError]
  }
  
  @scala.inline
  implicit class PhoneNumberErrorMutableBuilder[Self <: PhoneNumberError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setPhoneNumberId(value: NonEmptyString): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberIdUndefined: Self = StObject.set(x, "PhoneNumberId", js.undefined)
  }
}
