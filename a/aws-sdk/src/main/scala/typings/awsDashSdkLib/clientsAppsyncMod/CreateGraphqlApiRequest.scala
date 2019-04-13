package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGraphqlApiRequest extends js.Object {
  /**
    * The authentication type: API key, AWS IAM, or Amazon Cognito user pools.
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
    * The Amazon Cognito user pool configuration.
    */
  var userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined
}

object CreateGraphqlApiRequest {
  @scala.inline
  def apply(
    authenticationType: AuthenticationType,
    name: String,
    logConfig: LogConfig = null,
    openIDConnectConfig: OpenIDConnectConfig = null,
    userPoolConfig: UserPoolConfig = null
  ): CreateGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any], name = name)
    if (logConfig != null) __obj.updateDynamic("logConfig")(logConfig)
    if (openIDConnectConfig != null) __obj.updateDynamic("openIDConnectConfig")(openIDConnectConfig)
    if (userPoolConfig != null) __obj.updateDynamic("userPoolConfig")(userPoolConfig)
    __obj.asInstanceOf[CreateGraphqlApiRequest]
  }
}

