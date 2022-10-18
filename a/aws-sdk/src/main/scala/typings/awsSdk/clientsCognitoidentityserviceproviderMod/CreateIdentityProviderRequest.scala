package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIdentityProviderRequest extends StObject {
  
  /**
    * A mapping of IdP attributes to standard and custom user pool attributes.
    */
  var AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined
  
  /**
    * A list of IdP identifiers.
    */
  var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined
  
  /**
    * The IdP details. The following list describes the provider detail keys for each IdP type.   For Google and Login with Amazon:   client_id   client_secret   authorize_scopes     For Facebook:   client_id   client_secret   authorize_scopes   api_version     For Sign in with Apple:   client_id   team_id   key_id   private_key   authorize_scopes     For OpenID Connect (OIDC) providers:   client_id   client_secret   attributes_request_method   oidc_issuer   authorize_scopes   The following keys are only present if Amazon Cognito didn't discover them at the oidc_issuer URL.   authorize_url    token_url    attributes_url    jwks_uri      Amazon Cognito sets the value of the following keys automatically. They are read-only.   attributes_url_add_attributes        For SAML providers:   MetadataFile or MetadataURL   IDPSignout optional     
    */
  var ProviderDetails: ProviderDetailsType
  
  /**
    * The IdP name.
    */
  var ProviderName: ProviderNameTypeV1
  
  /**
    * The IdP type.
    */
  var ProviderType: IdentityProviderTypeType
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}
object CreateIdentityProviderRequest {
  
  inline def apply(
    ProviderDetails: ProviderDetailsType,
    ProviderName: ProviderNameTypeV1,
    ProviderType: IdentityProviderTypeType,
    UserPoolId: UserPoolIdType
  ): CreateIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ProviderDetails = ProviderDetails.asInstanceOf[js.Any], ProviderName = ProviderName.asInstanceOf[js.Any], ProviderType = ProviderType.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityProviderRequest]
  }
  
  extension [Self <: CreateIdentityProviderRequest](x: Self) {
    
    inline def setAttributeMapping(value: AttributeMappingType): Self = StObject.set(x, "AttributeMapping", value.asInstanceOf[js.Any])
    
    inline def setAttributeMappingUndefined: Self = StObject.set(x, "AttributeMapping", js.undefined)
    
    inline def setIdpIdentifiers(value: IdpIdentifiersListType): Self = StObject.set(x, "IdpIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setIdpIdentifiersUndefined: Self = StObject.set(x, "IdpIdentifiers", js.undefined)
    
    inline def setIdpIdentifiersVarargs(value: IdpIdentifierType*): Self = StObject.set(x, "IdpIdentifiers", js.Array(value*))
    
    inline def setProviderDetails(value: ProviderDetailsType): Self = StObject.set(x, "ProviderDetails", value.asInstanceOf[js.Any])
    
    inline def setProviderName(value: ProviderNameTypeV1): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    inline def setProviderType(value: IdentityProviderTypeType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
