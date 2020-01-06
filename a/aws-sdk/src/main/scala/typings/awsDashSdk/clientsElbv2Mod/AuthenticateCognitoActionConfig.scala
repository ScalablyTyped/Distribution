package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateCognitoActionConfig extends js.Object {
  /**
    * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
    */
  var AuthenticationRequestExtraParams: js.UndefOr[AuthenticateCognitoActionAuthenticationRequestExtraParams] = js.native
  /**
    * The behavior if the user is not authenticated. The following are possible values:   deny - Return an HTTP 401 Unauthorized error.   allow - Allow the request to be forwarded to the target.   authenticate - Redirect the request to the IdP authorization endpoint. This is the default value.  
    */
  var OnUnauthenticatedRequest: js.UndefOr[AuthenticateCognitoActionConditionalBehaviorEnum] = js.native
  /**
    * The set of user claims to be requested from the IdP. The default is openid. To verify which scope values your IdP supports and how to separate multiple values, see the documentation for your IdP.
    */
  var Scope: js.UndefOr[AuthenticateCognitoActionScope] = js.native
  /**
    * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
    */
  var SessionCookieName: js.UndefOr[AuthenticateCognitoActionSessionCookieName] = js.native
  /**
    * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
    */
  var SessionTimeout: js.UndefOr[AuthenticateCognitoActionSessionTimeout] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
    */
  var UserPoolArn: AuthenticateCognitoActionUserPoolArn = js.native
  /**
    * The ID of the Amazon Cognito user pool client.
    */
  var UserPoolClientId: AuthenticateCognitoActionUserPoolClientId = js.native
  /**
    * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
    */
  var UserPoolDomain: AuthenticateCognitoActionUserPoolDomain = js.native
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
    SessionTimeout: Int | Double = null
  ): AuthenticateCognitoActionConfig = {
    val __obj = js.Dynamic.literal(UserPoolArn = UserPoolArn.asInstanceOf[js.Any], UserPoolClientId = UserPoolClientId.asInstanceOf[js.Any], UserPoolDomain = UserPoolDomain.asInstanceOf[js.Any])
    if (AuthenticationRequestExtraParams != null) __obj.updateDynamic("AuthenticationRequestExtraParams")(AuthenticationRequestExtraParams.asInstanceOf[js.Any])
    if (OnUnauthenticatedRequest != null) __obj.updateDynamic("OnUnauthenticatedRequest")(OnUnauthenticatedRequest.asInstanceOf[js.Any])
    if (Scope != null) __obj.updateDynamic("Scope")(Scope.asInstanceOf[js.Any])
    if (SessionCookieName != null) __obj.updateDynamic("SessionCookieName")(SessionCookieName.asInstanceOf[js.Any])
    if (SessionTimeout != null) __obj.updateDynamic("SessionTimeout")(SessionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateCognitoActionConfig]
  }
}

