package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserRequest extends StObject {
  
  /**
    * The authentication type for the user. You must specify USERPOOL.
    */
  var AuthenticationType: typings.awsSdk.appstreamMod.AuthenticationType
  
  /**
    * The email address of the user.  Users' email addresses are case-sensitive. 
    */
  var UserName: Username
}
object DeleteUserRequest {
  
  @scala.inline
  def apply(AuthenticationType: AuthenticationType, UserName: Username): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserRequest]
  }
  
  @scala.inline
  implicit class DeleteUserRequestMutableBuilder[Self <: DeleteUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: Username): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
