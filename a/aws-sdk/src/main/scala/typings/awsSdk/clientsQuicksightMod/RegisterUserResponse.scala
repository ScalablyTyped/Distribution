package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterUserResponse extends StObject {
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * The user's user name.
    */
  var User: js.UndefOr[typings.awsSdk.clientsQuicksightMod.User] = js.undefined
  
  /**
    * The URL the user visits to complete registration and provide a password. This is returned only for users with an identity type of QUICKSIGHT.
    */
  var UserInvitationUrl: js.UndefOr[String] = js.undefined
}
object RegisterUserResponse {
  
  inline def apply(): RegisterUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterUserResponse]
  }
  
  extension [Self <: RegisterUserResponse](x: Self) {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserInvitationUrl(value: String): Self = StObject.set(x, "UserInvitationUrl", value.asInstanceOf[js.Any])
    
    inline def setUserInvitationUrlUndefined: Self = StObject.set(x, "UserInvitationUrl", js.undefined)
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
