package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGraphqlApiRequest extends js.Object {
  /**
    * A list of additional authentication providers for the GraphqlApi API.
    */
  var additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.undefined
  /**
    * The authentication type: API key, AWS IAM, OIDC, or Amazon Cognito user pools.
    */
  var authenticationType: AuthenticationType
  /**
    * The Amazon CloudWatch Logs configuration.
    */
  var logConfig: js.UndefOr[LogConfig] = js.undefined
  /**
    * A user-supplied name for the GraphqlApi.
    */
  var name: String
  /**
    * The OpenID Connect configuration.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined
  /**
    * A TagMap object.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  /**
    * The Amazon Cognito user pool configuration.
    */
  var userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined
}

object CreateGraphqlApiRequest {
  @scala.inline
  def apply(
    authenticationType: AuthenticationType,
    name: String,
    additionalAuthenticationProviders: AdditionalAuthenticationProviders = null,
    logConfig: LogConfig = null,
    openIDConnectConfig: OpenIDConnectConfig = null,
    tags: TagMap = null,
    userPoolConfig: UserPoolConfig = null
  ): CreateGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any], name = name)
    if (additionalAuthenticationProviders != null) __obj.updateDynamic("additionalAuthenticationProviders")(additionalAuthenticationProviders)
    if (logConfig != null) __obj.updateDynamic("logConfig")(logConfig)
    if (openIDConnectConfig != null) __obj.updateDynamic("openIDConnectConfig")(openIDConnectConfig)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (userPoolConfig != null) __obj.updateDynamic("userPoolConfig")(userPoolConfig)
    __obj.asInstanceOf[CreateGraphqlApiRequest]
  }
}

