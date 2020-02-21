package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphqlApi extends js.Object {
  /**
    * A list of additional authentication providers for the GraphqlApi API.
    */
  var additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.native
  /**
    * The API ID.
    */
  var apiId: js.UndefOr[String] = js.native
  /**
    * The ARN.
    */
  var arn: js.UndefOr[String] = js.native
  /**
    * The authentication type.
    */
  var authenticationType: js.UndefOr[AuthenticationType] = js.native
  /**
    * The Amazon CloudWatch Logs configuration.
    */
  var logConfig: js.UndefOr[LogConfig] = js.native
  /**
    * The API name.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The OpenID Connect configuration.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.native
  /**
    * The tags.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The URIs.
    */
  var uris: js.UndefOr[MapOfStringToString] = js.native
  /**
    * The Amazon Cognito user pool configuration.
    */
  var userPoolConfig: js.UndefOr[UserPoolConfig] = js.native
  /**
    * A flag representing whether X-Ray tracing is enabled for this GraphqlApi.
    */
  var xrayEnabled: js.UndefOr[Boolean] = js.native
}

object GraphqlApi {
  @scala.inline
  def apply(
    additionalAuthenticationProviders: AdditionalAuthenticationProviders = null,
    apiId: String = null,
    arn: String = null,
    authenticationType: AuthenticationType = null,
    logConfig: LogConfig = null,
    name: ResourceName = null,
    openIDConnectConfig: OpenIDConnectConfig = null,
    tags: TagMap = null,
    uris: MapOfStringToString = null,
    userPoolConfig: UserPoolConfig = null,
    xrayEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): GraphqlApi = {
    val __obj = js.Dynamic.literal()
    if (additionalAuthenticationProviders != null) __obj.updateDynamic("additionalAuthenticationProviders")(additionalAuthenticationProviders.asInstanceOf[js.Any])
    if (apiId != null) __obj.updateDynamic("apiId")(apiId.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (authenticationType != null) __obj.updateDynamic("authenticationType")(authenticationType.asInstanceOf[js.Any])
    if (logConfig != null) __obj.updateDynamic("logConfig")(logConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (openIDConnectConfig != null) __obj.updateDynamic("openIDConnectConfig")(openIDConnectConfig.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (uris != null) __obj.updateDynamic("uris")(uris.asInstanceOf[js.Any])
    if (userPoolConfig != null) __obj.updateDynamic("userPoolConfig")(userPoolConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(xrayEnabled)) __obj.updateDynamic("xrayEnabled")(xrayEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphqlApi]
  }
}

