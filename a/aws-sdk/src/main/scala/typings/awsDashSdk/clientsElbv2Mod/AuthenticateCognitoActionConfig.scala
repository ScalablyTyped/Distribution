package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateCognitoActionConfig extends js.Object {
  /**
    * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
    */
  var AuthenticationRequestExtraParams: js.UndefOr[AuthenticateCognitoActionAuthenticationRequestExtraParams] = js.undefined
  /**
    * The behavior if the user is not authenticated. The following are possible values:   deny - Return an HTTP 401 Unauthorized error.   allow - Allow the request to be forwarded to the target.   authenticate - Redirect the request to the IdP authorization endpoint. This is the default value.  
    */
  var OnUnauthenticatedRequest: js.UndefOr[AuthenticateCognitoActionConditionalBehaviorEnum] = js.undefined
  /**
    * The set of user claims to be requested from the IdP. The default is openid. To verify which scope values your IdP supports and how to separate multiple values, see the documentation for your IdP.
    */
  var Scope: js.UndefOr[AuthenticateCognitoActionScope] = js.undefined
  /**
    * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
    */
  var SessionCookieName: js.UndefOr[AuthenticateCognitoActionSessionCookieName] = js.undefined
  /**
    * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
    */
  var SessionTimeout: js.UndefOr[AuthenticateCognitoActionSessionTimeout] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
    */
  var UserPoolArn: AuthenticateCognitoActionUserPoolArn
  /**
    * The ID of the Amazon Cognito user pool client.
    */
  var UserPoolClientId: AuthenticateCognitoActionUserPoolClientId
  /**
    * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
    */
  var UserPoolDomain: AuthenticateCognitoActionUserPoolDomain
}

object AuthenticateCognitoActionConfig {
  @scala.inline
  def apply(
    UserPoolArn: AuthenticateCognitoActionUserPoolArn,
    UserPoolClientId: AuthenticateCognitoActionUserPoolClientId,
    UserPoolDomain: AuthenticateCognitoActionUserPoolDomain,
    AuthenticationRequestExtraParams: AuthenticateCognitoActionAuthenticationRequestExtraParams = null,
    OnUnauthenticatedRequest: AuthenticateCognitoActionConditionalBehaviorEnum = null,
    Scope: AuthenticateCognitoActionScope = null,
    SessionCookieName: AuthenticateCognitoActionSessionCookieName = null,
    SessionTimeout: js.UndefOr[AuthenticateCognitoActionSessionTimeout] = js.undefined
  ): AuthenticateCognitoActionConfig = {
    val __obj = js.Dynamic.literal(UserPoolArn = UserPoolArn, UserPoolClientId = UserPoolClientId, UserPoolDomain = UserPoolDomain)
    if (AuthenticationRequestExtraParams != null) __obj.updateDynamic("AuthenticationRequestExtraParams")(AuthenticationRequestExtraParams)
    if (OnUnauthenticatedRequest != null) __obj.updateDynamic("OnUnauthenticatedRequest")(OnUnauthenticatedRequest.asInstanceOf[js.Any])
    if (Scope != null) __obj.updateDynamic("Scope")(Scope)
    if (SessionCookieName != null) __obj.updateDynamic("SessionCookieName")(SessionCookieName)
    if (!js.isUndefined(SessionTimeout)) __obj.updateDynamic("SessionTimeout")(SessionTimeout)
    __obj.asInstanceOf[AuthenticateCognitoActionConfig]
  }
}

