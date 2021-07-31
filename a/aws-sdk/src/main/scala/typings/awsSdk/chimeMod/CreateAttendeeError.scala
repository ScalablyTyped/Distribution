package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAttendeeError extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a builder application. If you create an attendee with the same external user id, the service returns the existing record.
    */
  var ExternalUserId: js.UndefOr[ExternalUserIdType] = js.undefined
}
object CreateAttendeeError {
  
  @scala.inline
  def apply(): CreateAttendeeError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAttendeeError]
  }
  
  @scala.inline
  implicit class CreateAttendeeErrorMutableBuilder[Self <: CreateAttendeeError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setExternalUserId(value: ExternalUserIdType): Self = StObject.set(x, "ExternalUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalUserIdUndefined: Self = StObject.set(x, "ExternalUserId", js.undefined)
  }
}
