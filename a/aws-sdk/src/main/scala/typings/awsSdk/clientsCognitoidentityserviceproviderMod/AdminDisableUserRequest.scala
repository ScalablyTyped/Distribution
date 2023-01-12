package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminDisableUserRequest extends StObject {
  
  /**
    * The user pool ID for the user pool where you want to disable the user.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The user name of the user you want to disable.
    */
  var Username: UsernameType
}
object AdminDisableUserRequest {
  
  inline def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminDisableUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDisableUserRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdminDisableUserRequest] (val x: Self) extends AnyVal {
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
