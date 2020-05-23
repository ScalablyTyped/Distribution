package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodSnapshot extends js.Object {
  /**
    * Specifies whether the method requires a valid ApiKey.
    */
  var apiKeyRequired: js.UndefOr[Boolean] = js.native
  /**
    * The method's authorization type. Valid values are NONE for open access, AWS_IAM for using AWS IAM permissions, CUSTOM for using a custom authorizer, or COGNITO_USER_POOLS for using a Cognito user pool.
    */
  var authorizationType: js.UndefOr[String] = js.native
}

object MethodSnapshot {
  @scala.inline
  def apply(apiKeyRequired: js.UndefOr[Boolean] = js.undefined, authorizationType: String = null): MethodSnapshot = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(apiKeyRequired)) __obj.updateDynamic("apiKeyRequired")(apiKeyRequired.get.asInstanceOf[js.Any])
    if (authorizationType != null) __obj.updateDynamic("authorizationType")(authorizationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodSnapshot]
  }
}

