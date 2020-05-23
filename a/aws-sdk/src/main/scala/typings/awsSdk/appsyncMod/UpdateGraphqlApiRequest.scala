package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGraphqlApiRequest extends js.Object {
  /**
    * A list of additional authentication providers for the GraphqlApi API.
    */
  var additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.native
  /**
    * The API ID.
    */
  var apiId: String = js.native
  /**
    * The new authentication type for the GraphqlApi object.
    */
  var authenticationType: js.UndefOr[AuthenticationType] = js.native
  /**
    * The Amazon CloudWatch Logs configuration for the GraphqlApi object.
    */
  var logConfig: js.UndefOr[LogConfig] = js.native
  /**
    * The new name for the GraphqlApi object.
    */
  var name: String = js.native
  /**
    * The OpenID Connect configuration for the GraphqlApi object.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.native
  /**
    * The new Amazon Cognito user pool configuration for the GraphqlApi object.
    */
  var userPoolConfig: js.UndefOr[UserPoolConfig] = js.native
  /**
    * A flag indicating whether to enable X-Ray tracing for the GraphqlApi.
    */
  var xrayEnabled: js.UndefOr[Boolean] = js.native
}

object UpdateGraphqlApiRequest {
  @scala.inline
  def apply(
    apiId: String,
    name: String,
    additionalAuthenticationProviders: AdditionalAuthenticationProviders = null,
    authenticationType: AuthenticationType = null,
    logConfig: LogConfig = null,
    openIDConnectConfig: OpenIDConnectConfig = null,
    userPoolConfig: UserPoolConfig = null,
    xrayEnabled: js.UndefOr[Boolean] = js.undefined
  ): UpdateGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (additionalAuthenticationProviders != null) __obj.updateDynamic("additionalAuthenticationProviders")(additionalAuthenticationProviders.asInstanceOf[js.Any])
    if (authenticationType != null) __obj.updateDynamic("authenticationType")(authenticationType.asInstanceOf[js.Any])
    if (logConfig != null) __obj.updateDynamic("logConfig")(logConfig.asInstanceOf[js.Any])
    if (openIDConnectConfig != null) __obj.updateDynamic("openIDConnectConfig")(openIDConnectConfig.asInstanceOf[js.Any])
    if (userPoolConfig != null) __obj.updateDynamic("userPoolConfig")(userPoolConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(xrayEnabled)) __obj.updateDynamic("xrayEnabled")(xrayEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGraphqlApiRequest]
  }
}

