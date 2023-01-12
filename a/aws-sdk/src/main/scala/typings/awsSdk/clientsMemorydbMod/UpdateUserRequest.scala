package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserRequest extends StObject {
  
  /**
    * Access permissions string used for this user.
    */
  var AccessString: js.UndefOr[typings.awsSdk.clientsMemorydbMod.AccessString] = js.undefined
  
  /**
    * Denotes the user's authentication properties, such as whether it requires a password to authenticate.
    */
  var AuthenticationMode: js.UndefOr[typings.awsSdk.clientsMemorydbMod.AuthenticationMode] = js.undefined
  
  /**
    * The name of the user
    */
  var UserName: typings.awsSdk.clientsMemorydbMod.UserName
}
object UpdateUserRequest {
  
  inline def apply(UserName: UserName): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateUserRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessString(value: AccessString): Self = StObject.set(x, "AccessString", value.asInstanceOf[js.Any])
    
    inline def setAccessStringUndefined: Self = StObject.set(x, "AccessString", js.undefined)
    
    inline def setAuthenticationMode(value: AuthenticationMode): Self = StObject.set(x, "AuthenticationMode", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationModeUndefined: Self = StObject.set(x, "AuthenticationMode", js.undefined)
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
