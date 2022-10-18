package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserRequest extends StObject {
  
  /**
    * Access permissions string used for this user.
    */
  var AccessString: typings.awsSdk.clientsMemorydbMod.AccessString
  
  /**
    * Denotes the user's authentication properties, such as whether it requires a password to authenticate.
    */
  var AuthenticationMode: typings.awsSdk.clientsMemorydbMod.AuthenticationMode
  
  /**
    * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag value, although null is accepted.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The name of the user. This value must be unique as it also serves as the user identifier.
    */
  var UserName: typings.awsSdk.clientsMemorydbMod.UserName
}
object CreateUserRequest {
  
  inline def apply(AccessString: AccessString, AuthenticationMode: AuthenticationMode, UserName: UserName): CreateUserRequest = {
    val __obj = js.Dynamic.literal(AccessString = AccessString.asInstanceOf[js.Any], AuthenticationMode = AuthenticationMode.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
  
  extension [Self <: CreateUserRequest](x: Self) {
    
    inline def setAccessString(value: AccessString): Self = StObject.set(x, "AccessString", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationMode(value: AuthenticationMode): Self = StObject.set(x, "AuthenticationMode", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
