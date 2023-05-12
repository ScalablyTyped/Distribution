package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVerifiedAccessTrustProviderOidcOptions extends StObject {
  
  /**
    * The OIDC authorization endpoint.
    */
  var AuthorizationEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The client identifier.
    */
  var ClientId: js.UndefOr[String] = js.undefined
  
  /**
    * The client secret.
    */
  var ClientSecret: js.UndefOr[ClientSecretType] = js.undefined
  
  /**
    * The OIDC issuer.
    */
  var Issuer: js.UndefOr[String] = js.undefined
  
  /**
    * OpenID Connect (OIDC) scopes are used by an application during authentication to authorize access to a user's details. Each scope returns a specific set of user attributes.
    */
  var Scope: js.UndefOr[String] = js.undefined
  
  /**
    * The OIDC token endpoint.
    */
  var TokenEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The OIDC user info endpoint.
    */
  var UserInfoEndpoint: js.UndefOr[String] = js.undefined
}
object ModifyVerifiedAccessTrustProviderOidcOptions {
  
  inline def apply(): ModifyVerifiedAccessTrustProviderOidcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVerifiedAccessTrustProviderOidcOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyVerifiedAccessTrustProviderOidcOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthorizationEndpoint(value: String): Self = StObject.set(x, "AuthorizationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationEndpointUndefined: Self = StObject.set(x, "AuthorizationEndpoint", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    inline def setClientSecret(value: ClientSecretType): Self = StObject.set(x, "ClientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "ClientSecret", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "Issuer", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
    
    inline def setTokenEndpoint(value: String): Self = StObject.set(x, "TokenEndpoint", value.asInstanceOf[js.Any])
    
    inline def setTokenEndpointUndefined: Self = StObject.set(x, "TokenEndpoint", js.undefined)
    
    inline def setUserInfoEndpoint(value: String): Self = StObject.set(x, "UserInfoEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUserInfoEndpointUndefined: Self = StObject.set(x, "UserInfoEndpoint", js.undefined)
  }
}
