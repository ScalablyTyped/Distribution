package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserAttributesRequest extends StObject {
  
  /**
    * A valid access token that Amazon Cognito issued to the user whose attributes you want to delete.
    */
  var AccessToken: TokenModelType
  
  /**
    * An array of strings representing the user attribute names you want to delete. For custom attributes, you must prependattach the custom: prefix to the front of the attribute name.
    */
  var UserAttributeNames: AttributeNameListType
}
object DeleteUserAttributesRequest {
  
  inline def apply(AccessToken: TokenModelType, UserAttributeNames: AttributeNameListType): DeleteUserAttributesRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], UserAttributeNames = UserAttributeNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserAttributesRequest]
  }
  
  extension [Self <: DeleteUserAttributesRequest](x: Self) {
    
    inline def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setUserAttributeNames(value: AttributeNameListType): Self = StObject.set(x, "UserAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setUserAttributeNamesVarargs(value: AttributeNameType*): Self = StObject.set(x, "UserAttributeNames", js.Array(value*))
  }
}
