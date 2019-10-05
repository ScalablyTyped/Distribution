package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoOptions extends js.Object {
  /**
    * Specifies the option to enable Cognito for Kibana authentication.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the Cognito identity pool ID for Kibana authentication.
    */
  var IdentityPoolId: js.UndefOr[typings.awsDashSdk.clientsEsMod.IdentityPoolId] = js.undefined
  /**
    * Specifies the role ARN that provides Elasticsearch permissions for accessing Cognito resources.
    */
  var RoleArn: js.UndefOr[typings.awsDashSdk.clientsEsMod.RoleArn] = js.undefined
  /**
    * Specifies the Cognito user pool ID for Kibana authentication.
    */
  var UserPoolId: js.UndefOr[typings.awsDashSdk.clientsEsMod.UserPoolId] = js.undefined
}

object CognitoOptions {
  @scala.inline
  def apply(
    Enabled: js.UndefOr[scala.Boolean] = js.undefined,
    IdentityPoolId: IdentityPoolId = null,
    RoleArn: RoleArn = null,
    UserPoolId: UserPoolId = null
  ): CognitoOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId)
    __obj.asInstanceOf[CognitoOptions]
  }
}

