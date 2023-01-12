package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityProviderByIdentifierRequest extends StObject {
  
  /**
    * The IdP identifier.
    */
  var IdpIdentifier: IdpIdentifierType
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}
object GetIdentityProviderByIdentifierRequest {
  
  inline def apply(IdpIdentifier: IdpIdentifierType, UserPoolId: UserPoolIdType): GetIdentityProviderByIdentifierRequest = {
    val __obj = js.Dynamic.literal(IdpIdentifier = IdpIdentifier.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityProviderByIdentifierRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIdentityProviderByIdentifierRequest] (val x: Self) extends AnyVal {
    
    inline def setIdpIdentifier(value: IdpIdentifierType): Self = StObject.set(x, "IdpIdentifier", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
