package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateOidcActionConfig extends js.Object {
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
  @scala.inline
  def apply(
    AuthorizationEndpoint: AuthenticateOidcActionAuthorizationEndpoint,
    ClientId: AuthenticateOidcActionClientId,
    Issuer: AuthenticateOidcActionIssuer,
    TokenEndpoint: AuthenticateOidcActionTokenEndpoint,
    UserInfoEndpoint: AuthenticateOidcActionUserInfoEndpoint,
    AuthenticationRequestExtraParams: AuthenticateOidcActionAuthenticationRequestExtraParams = null,
    ClientSecret: AuthenticateOidcActionClientSecret = null,
    OnUnauthenticatedRequest: AuthenticateOidcActionConditionalBehaviorEnum = null,
    Scope: AuthenticateOidcActionScope = null,
    SessionCookieName: AuthenticateOidcActionSessionCookieName = null,
    SessionTimeout: Int | Double = null,
    UseExistingClientSecret: js.UndefOr[Boolean] = js.undefined
  ): AuthenticateOidcActionConfig = {
    val __obj = js.Dynamic.literal(AuthorizationEndpoint = AuthorizationEndpoint, ClientId = ClientId, Issuer = Issuer, TokenEndpoint = TokenEndpoint, UserInfoEndpoint = UserInfoEndpoint)
    if (AuthenticationRequestExtraParams != null) __obj.updateDynamic("AuthenticationRequestExtraParams")(AuthenticationRequestExtraParams)
    if (ClientSecret != null) __obj.updateDynamic("ClientSecret")(ClientSecret)
    if (OnUnauthenticatedRequest != null) __obj.updateDynamic("OnUnauthenticatedRequest")(OnUnauthenticatedRequest.asInstanceOf[js.Any])
    if (Scope != null) __obj.updateDynamic("Scope")(Scope)
    if (SessionCookieName != null) __obj.updateDynamic("SessionCookieName")(SessionCookieName)
    if (SessionTimeout != null) __obj.updateDynamic("SessionTimeout")(SessionTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(UseExistingClientSecret)) __obj.updateDynamic("UseExistingClientSecret")(UseExistingClientSecret)
    __obj.asInstanceOf[AuthenticateOidcActionConfig]
  }
}

