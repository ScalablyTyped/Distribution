package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminEnableUserRequest extends StObject {
  
  /**
    * The user pool ID for the user pool where you want to enable the user.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The user name of the user you want to enable.
    */
  var Username: UsernameType
}
object AdminEnableUserRequest {
  
  inline def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminEnableUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminEnableUserRequest]
  }
  
  extension [Self <: AdminEnableUserRequest](x: Self) {
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
