package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGraphqlApiRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
  /**
    * The new authentication type for the GraphqlApi object.
    */
  var authenticationType: js.UndefOr[AuthenticationType] = js.undefined
  /**
    * The Amazon CloudWatch Logs configuration for the GraphqlApi object.
    */
  var logConfig: js.UndefOr[LogConfig] = js.undefined
  /**
    * The new name for the GraphqlApi object.
    */
  var name: String
  /**
    * The OpenID Connect configuration for the GraphqlApi object.
    */
  var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined
  /**
    * The new Amazon Cognito user pool configuration for the GraphqlApi object.
    */
  var userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined
}

object UpdateGraphqlApiRequest {
  @scala.inline
  def apply(
    apiId: String,
    name: String,
    authenticationType: AuthenticationType = null,
    logConfig: LogConfig = null,
    openIDConnectConfig: OpenIDConnectConfig = null,
    userPoolConfig: UserPoolConfig = null
  ): UpdateGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, name = name)
    if (authenticationType != null) __obj.updateDynamic("authenticationType")(authenticationType.asInstanceOf[js.Any])
    if (logConfig != null) __obj.updateDynamic("logConfig")(logConfig)
    if (openIDConnectConfig != null) __obj.updateDynamic("openIDConnectConfig")(openIDConnectConfig)
    if (userPoolConfig != null) __obj.updateDynamic("userPoolConfig")(userPoolConfig)
    __obj.asInstanceOf[UpdateGraphqlApiRequest]
  }
}

