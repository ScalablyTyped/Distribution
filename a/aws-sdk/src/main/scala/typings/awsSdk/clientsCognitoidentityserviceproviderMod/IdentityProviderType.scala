package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProviderType extends StObject {
  
  /**
    * A mapping of IdP attributes to standard and custom user pool attributes.
    */
  var AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined
  
  /**
    * The date the IdP was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of IdP identifiers.
    */
  var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined
  
  /**
    * The date the IdP was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The IdP details. The following list describes the provider detail keys for each IdP type.   For Google and Login with Amazon:   client_id   client_secret   authorize_scopes     For Facebook:   client_id   client_secret   authorize_scopes   api_version     For Sign in with Apple:   client_id   team_id   key_id   private_key  You can submit a private_key when you add or update an IdP. Describe operations don't return the private key.    authorize_scopes     For OIDC providers:   client_id   client_secret   attributes_request_method   oidc_issuer   authorize_scopes   The following keys are only present if Amazon Cognito didn't discover them at the oidc_issuer URL.   authorize_url    token_url    attributes_url    jwks_uri      Amazon Cognito sets the value of the following keys automatically. They are read-only.   attributes_url_add_attributes        For SAML providers:   MetadataFile or MetadataURL   IDPSignout optional     
    */
  var ProviderDetails: js.UndefOr[ProviderDetailsType] = js.undefined
  
  /**
    * The IdP name.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.undefined
  
  /**
    * The IdP type.
    */
  var ProviderType: js.UndefOr[IdentityProviderTypeType] = js.undefined
  
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
}
object IdentityProviderType {
  
  inline def apply(): IdentityProviderType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProviderType]
  }
  
  extension [Self <: IdentityProviderType](x: Self) {
    
    inline def setAttributeMapping(value: AttributeMappingType): Self = StObject.set(x, "AttributeMapping", value.asInstanceOf[js.Any])
    
    inline def setAttributeMappingUndefined: Self = StObject.set(x, "AttributeMapping", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setIdpIdentifiers(value: IdpIdentifiersListType): Self = StObject.set(x, "IdpIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setIdpIdentifiersUndefined: Self = StObject.set(x, "IdpIdentifiers", js.undefined)
    
    inline def setIdpIdentifiersVarargs(value: IdpIdentifierType*): Self = StObject.set(x, "IdpIdentifiers", js.Array(value*))
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setProviderDetails(value: ProviderDetailsType): Self = StObject.set(x, "ProviderDetails", value.asInstanceOf[js.Any])
    
    inline def setProviderDetailsUndefined: Self = StObject.set(x, "ProviderDetails", js.undefined)
    
    inline def setProviderName(value: ProviderNameType): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    inline def setProviderNameUndefined: Self = StObject.set(x, "ProviderName", js.undefined)
    
    inline def setProviderType(value: IdentityProviderTypeType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
  }
}
