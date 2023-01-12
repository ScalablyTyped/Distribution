package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticateOidcActionConfig extends StObject {
  
  /**
    * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
    */
  var AuthenticationRequestExtraParams: js.UndefOr[AuthenticateOidcActionAuthenticationRequestExtraParams] = js.undefined
  
  /**
    * The authorization endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
    */
  var AuthorizationEndpoint: AuthenticateOidcActionAuthorizationEndpoint
  
  /**
    * The OAuth 2.0 client identifier.
    */
  var ClientId: AuthenticateOidcActionClientId
  
  /**
    * The OAuth 2.0 client secret. This parameter is required if you are creating a rule. If you are modifying a rule, you can omit this parameter if you set UseExistingClientSecret to true.
    */
  var ClientSecret: js.UndefOr[AuthenticateOidcActionClientSecret] = js.undefined
  
  /**
    * The OIDC issuer identifier of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
    */
  var Issuer: AuthenticateOidcActionIssuer
  
  /**
    * The behavior if the user is not authenticated. The following are possible values:   deny - Return an HTTP 401 Unauthorized error.   allow - Allow the request to be forwarded to the target.   authenticate - Redirect the request to the IdP authorization endpoint. This is the default value.  
    */
  var OnUnauthenticatedRequest: js.UndefOr[AuthenticateOidcActionConditionalBehaviorEnum] = js.undefined
  
  /**
    * The set of user claims to be requested from the IdP. The default is openid. To verify which scope values your IdP supports and how to separate multiple values, see the documentation for your IdP.
    */
  var Scope: js.UndefOr[AuthenticateOidcActionScope] = js.undefined
  
  /**
    * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
    */
  var SessionCookieName: js.UndefOr[AuthenticateOidcActionSessionCookieName] = js.undefined
  
  /**
    * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
    */
  var SessionTimeout: js.UndefOr[AuthenticateOidcActionSessionTimeout] = js.undefined
  
  /**
    * The token endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
    */
  var TokenEndpoint: AuthenticateOidcActionTokenEndpoint
  
  /**
    * Indicates whether to use the existing client secret when modifying a rule. If you are creating a rule, you can omit this parameter or set it to false.
    */
  var UseExistingClientSecret: js.UndefOr[AuthenticateOidcActionUseExistingClientSecret] = js.undefined
  
  /**
    * The user info endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
    */
  var UserInfoEndpoint: AuthenticateOidcActionUserInfoEndpoint
}
object AuthenticateOidcActionConfig {
  
  inline def apply(
    AuthorizationEndpoint: AuthenticateOidcActionAuthorizationEndpoint,
    ClientId: AuthenticateOidcActionClientId,
    Issuer: AuthenticateOidcActionIssuer,
    TokenEndpoint: AuthenticateOidcActionTokenEndpoint,
    UserInfoEndpoint: AuthenticateOidcActionUserInfoEndpoint
  ): AuthenticateOidcActionConfig = {
    val __obj = js.Dynamic.literal(AuthorizationEndpoint = AuthorizationEndpoint.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], Issuer = Issuer.asInstanceOf[js.Any], TokenEndpoint = TokenEndpoint.asInstanceOf[js.Any], UserInfoEndpoint = UserInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateOidcActionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticateOidcActionConfig] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationRequestExtraParams(value: AuthenticateOidcActionAuthenticationRequestExtraParams): Self = StObject.set(x, "AuthenticationRequestExtraParams", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationRequestExtraParamsUndefined: Self = StObject.set(x, "AuthenticationRequestExtraParams", js.undefined)
    
    inline def setAuthorizationEndpoint(value: AuthenticateOidcActionAuthorizationEndpoint): Self = StObject.set(x, "AuthorizationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: AuthenticateOidcActionClientId): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientSecret(value: AuthenticateOidcActionClientSecret): Self = StObject.set(x, "ClientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "ClientSecret", js.undefined)
    
    inline def setIssuer(value: AuthenticateOidcActionIssuer): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    inline def setOnUnauthenticatedRequest(value: AuthenticateOidcActionConditionalBehaviorEnum): Self = StObject.set(x, "OnUnauthenticatedRequest", value.asInstanceOf[js.Any])
    
    inline def setOnUnauthenticatedRequestUndefined: Self = StObject.set(x, "OnUnauthenticatedRequest", js.undefined)
    
    inline def setScope(value: AuthenticateOidcActionScope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
    
    inline def setSessionCookieName(value: AuthenticateOidcActionSessionCookieName): Self = StObject.set(x, "SessionCookieName", value.asInstanceOf[js.Any])
    
    inline def setSessionCookieNameUndefined: Self = StObject.set(x, "SessionCookieName", js.undefined)
    
    inline def setSessionTimeout(value: AuthenticateOidcActionSessionTimeout): Self = StObject.set(x, "SessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutUndefined: Self = StObject.set(x, "SessionTimeout", js.undefined)
    
    inline def setTokenEndpoint(value: AuthenticateOidcActionTokenEndpoint): Self = StObject.set(x, "TokenEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUseExistingClientSecret(value: AuthenticateOidcActionUseExistingClientSecret): Self = StObject.set(x, "UseExistingClientSecret", value.asInstanceOf[js.Any])
    
    inline def setUseExistingClientSecretUndefined: Self = StObject.set(x, "UseExistingClientSecret", js.undefined)
    
    inline def setUserInfoEndpoint(value: AuthenticateOidcActionUserInfoEndpoint): Self = StObject.set(x, "UserInfoEndpoint", value.asInstanceOf[js.Any])
  }
}
