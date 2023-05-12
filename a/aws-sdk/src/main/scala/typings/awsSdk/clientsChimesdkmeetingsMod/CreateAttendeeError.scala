package typings.awsSdk.clientsChimesdkmeetingsMod

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
    * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a builder application. Pattern: [-_&amp;@+=,(){}\[\]\/«».:|'"#a-zA-Z0-9À-ÿ\s]*  Values that begin with aws: are reserved. You can't configure a value that uses this prefix. Case insensitive.
    */
  var ExternalUserId: js.UndefOr[typings.awsSdk.clientsChimesdkmeetingsMod.ExternalUserId] = js.undefined
}
object CreateAttendeeError {
  
  inline def apply(): CreateAttendeeError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAttendeeError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAttendeeError] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setExternalUserId(value: ExternalUserId): Self = StObject.set(x, "ExternalUserId", value.asInstanceOf[js.Any])
    
    inline def setExternalUserIdUndefined: Self = StObject.set(x, "ExternalUserId", js.undefined)
  }
}
