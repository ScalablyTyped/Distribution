package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalAuthenticationProvider extends js.Object {
  /**
    * The authentication type: API key, AWS IAM, OIDC, or Amazon Cognito user pools.
    */
  var authenticationType: js.UndefOr[AuthenticationType] = js.undefined
  /**
    * The OpenID Connect configuration.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined
  /**
    * The Amazon Cognito user pool configuration.
    */
  var userPoolConfig: js.UndefOr[CognitoUserPoolConfig] = js.undefined
}

object AdditionalAuthenticationProvider {
  @scala.inline
  def apply(
    authenticationType: AuthenticationType = null,
    openIDConnectConfig: OpenIDConnectConfig = null,
    userPoolConfig: CognitoUserPoolConfig = null
  ): AdditionalAuthenticationProvider = {
    val __obj = js.Dynamic.literal()
    if (authenticationType != null) __obj.updateDynamic("authenticationType")(authenticationType.asInstanceOf[js.Any])
    if (openIDConnectConfig != null) __obj.updateDynamic("openIDConnectConfig")(openIDConnectConfig)
    if (userPoolConfig != null) __obj.updateDynamic("userPoolConfig")(userPoolConfig)
    __obj.asInstanceOf[AdditionalAuthenticationProvider]
  }
}

