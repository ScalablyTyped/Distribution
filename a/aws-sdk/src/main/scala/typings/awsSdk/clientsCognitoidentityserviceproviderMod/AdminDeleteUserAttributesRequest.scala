package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminDeleteUserAttributesRequest extends StObject {
  
  /**
    * An array of strings representing the user attribute names you want to delete. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributeNames: AttributeNameListType
  
  /**
    * The user pool ID for the user pool where you want to delete user attributes.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The user name of the user from which you would like to delete attributes.
    */
  var Username: UsernameType
}
object AdminDeleteUserAttributesRequest {
  
  inline def apply(UserAttributeNames: AttributeNameListType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminDeleteUserAttributesRequest = {
    val __obj = js.Dynamic.literal(UserAttributeNames = UserAttributeNames.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDeleteUserAttributesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdminDeleteUserAttributesRequest] (val x: Self) extends AnyVal {
    
    inline def setUserAttributeNames(value: AttributeNameListType): Self = StObject.set(x, "UserAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setUserAttributeNamesVarargs(value: AttributeNameType*): Self = StObject.set(x, "UserAttributeNames", js.Array(value*))
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
