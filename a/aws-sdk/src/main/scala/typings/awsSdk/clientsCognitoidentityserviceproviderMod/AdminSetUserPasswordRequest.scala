package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminSetUserPasswordRequest extends StObject {
  
  /**
    * The password for the user.
    */
  var Password: PasswordType
  
  /**
    *  True if the password is permanent, False if it is temporary.
    */
  var Permanent: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The user pool ID for the user pool where you want to set the user's password.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The user name of the user whose password you want to set.
    */
  var Username: UsernameType
}
object AdminSetUserPasswordRequest {
  
  inline def apply(Password: PasswordType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminSetUserPasswordRequest = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminSetUserPasswordRequest]
  }
  
  extension [Self <: AdminSetUserPasswordRequest](x: Self) {
    
    inline def setPassword(value: PasswordType): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPermanent(value: BooleanType): Self = StObject.set(x, "Permanent", value.asInstanceOf[js.Any])
    
    inline def setPermanentUndefined: Self = StObject.set(x, "Permanent", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
