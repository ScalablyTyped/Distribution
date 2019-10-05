package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodSnapshot extends js.Object {
  /**
    * Specifies whether the method requires a valid ApiKey.
    */
  var apiKeyRequired: js.UndefOr[Boolean] = js.undefined
  /**
    * The method's authorization type. Valid values are NONE for open access, AWS_IAM for using AWS IAM permissions, CUSTOM for using a custom authorizer, or COGNITO_USER_POOLS for using a Cognito user pool.
    */
  var authorizationType: js.UndefOr[String] = js.undefined
}

object MethodSnapshot {
  @scala.inline
  def apply(apiKeyRequired: js.UndefOr[scala.Boolean] = js.undefined, authorizationType: String = null): MethodSnapshot = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(apiKeyRequired)) __obj.updateDynamic("apiKeyRequired")(apiKeyRequired)
    if (authorizationType != null) __obj.updateDynamic("authorizationType")(authorizationType)
    __obj.asInstanceOf[MethodSnapshot]
  }
}

