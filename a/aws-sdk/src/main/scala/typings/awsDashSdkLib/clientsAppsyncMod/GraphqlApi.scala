package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphqlApi extends js.Object {
  /**
    * A list of additional authentication providers for the GraphqlApi API.
    */
  var additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.undefined
  /**
    * The API ID.
    */
  var apiId: js.UndefOr[String] = js.undefined
  /**
    * The ARN.
    */
  var arn: js.UndefOr[String] = js.undefined
  /**
    * The authentication type.
    */
  var authenticationType: js.UndefOr[AuthenticationType] = js.undefined
  /**
    * The Amazon CloudWatch Logs configuration.
    */
  var logConfig: js.UndefOr[LogConfig] = js.undefined
  /**
    * The API name.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The OpenID Connect configuration.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined
  /**
    * The tags.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  /**
    * The URIs.
    */
  var uris: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * The Amazon Cognito user pool configuration.
    */
  var userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined
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
    userPoolConfig: UserPoolConfig = null
  ): GraphqlApi = {
    val __obj = js.Dynamic.literal()
    if (additionalAuthenticationProviders != null) __obj.updateDynamic("additionalAuthenticationProviders")(additionalAuthenticationProviders)
    if (apiId != null) __obj.updateDynamic("apiId")(apiId)
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (authenticationType != null) __obj.updateDynamic("authenticationType")(authenticationType.asInstanceOf[js.Any])
    if (logConfig != null) __obj.updateDynamic("logConfig")(logConfig)
    if (name != null) __obj.updateDynamic("name")(name)
    if (openIDConnectConfig != null) __obj.updateDynamic("openIDConnectConfig")(openIDConnectConfig)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (uris != null) __obj.updateDynamic("uris")(uris)
    if (userPoolConfig != null) __obj.updateDynamic("userPoolConfig")(userPoolConfig)
    __obj.asInstanceOf[GraphqlApi]
  }
}

