package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminLinkProviderForUserRequest extends StObject {
  
  /**
    * The existing user in the user pool that you want to assign to the external IdP user account. This user can be a native (Username + Password) Amazon Cognito user pools user or a federated user (for example, a SAML or Facebook user). If the user doesn't exist, Amazon Cognito generates an exception. Amazon Cognito returns this user when the new user (with the linked IdP attribute) signs in. For a native username + password user, the ProviderAttributeValue for the DestinationUser should be the username in the user pool. For a federated user, it should be the provider-specific user_id. The ProviderAttributeName of the DestinationUser is ignored. The ProviderName should be set to Cognito for users in Cognito user pools.  All attributes in the DestinationUser profile must be mutable. If you have assigned the user any immutable custom attributes, the operation won't succeed. 
    */
  var DestinationUser: ProviderUserIdentifierType
  
  /**
    * An external IdP account for a user who doesn't exist yet in the user pool. This user must be a federated user (for example, a SAML or Facebook user), not another native user. If the SourceUser is using a federated social IdP, such as Facebook, Google, or Login with Amazon, you must set the ProviderAttributeName to Cognito_Subject. For social IdPs, the ProviderName will be Facebook, Google, or LoginWithAmazon, and Amazon Cognito will automatically parse the Facebook, Google, and Login with Amazon tokens for id, sub, and user_id, respectively. The ProviderAttributeValue for the user must be the same value as the id, sub, or user_id value found in the social IdP token.  For SAML, the ProviderAttributeName can be any value that matches a claim in the SAML assertion. If you want to link SAML users based on the subject of the SAML assertion, you should map the subject to a claim through the SAML IdP and submit that claim name as the ProviderAttributeName. If you set ProviderAttributeName to Cognito_Subject, Amazon Cognito will automatically parse the default unique identifier found in the subject from the SAML token.
    */
  var SourceUser: ProviderUserIdentifierType
  
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: StringType
}
object AdminLinkProviderForUserRequest {
  
  inline def apply(
    DestinationUser: ProviderUserIdentifierType,
    SourceUser: ProviderUserIdentifierType,
    UserPoolId: StringType
  ): AdminLinkProviderForUserRequest = {
    val __obj = js.Dynamic.literal(DestinationUser = DestinationUser.asInstanceOf[js.Any], SourceUser = SourceUser.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminLinkProviderForUserRequest]
  }
  
  extension [Self <: AdminLinkProviderForUserRequest](x: Self) {
    
    inline def setDestinationUser(value: ProviderUserIdentifierType): Self = StObject.set(x, "DestinationUser", value.asInstanceOf[js.Any])
    
    inline def setSourceUser(value: ProviderUserIdentifierType): Self = StObject.set(x, "SourceUser", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: StringType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
