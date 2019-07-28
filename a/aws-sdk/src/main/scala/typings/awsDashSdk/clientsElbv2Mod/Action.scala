package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  /**
    * [HTTPS listeners] Information for using Amazon Cognito to authenticate users. Specify only when Type is authenticate-cognito.
    */
  var AuthenticateCognitoConfig: js.UndefOr[AuthenticateCognitoActionConfig] = js.undefined
  /**
    * [HTTPS listeners] Information about an identity provider that is compliant with OpenID Connect (OIDC). Specify only when Type is authenticate-oidc.
    */
  var AuthenticateOidcConfig: js.UndefOr[AuthenticateOidcActionConfig] = js.undefined
  /**
    * [Application Load Balancer] Information for creating an action that returns a custom HTTP response. Specify only when Type is fixed-response.
    */
  var FixedResponseConfig: js.UndefOr[FixedResponseActionConfig] = js.undefined
  /**
    * The order for the action. This value is required for rules with multiple actions. The action with the lowest value for order is performed first. The final action to be performed must be a forward or a fixed-response action.
    */
  var Order: js.UndefOr[ActionOrder] = js.undefined
  /**
    * [Application Load Balancer] Information for creating a redirect action. Specify only when Type is redirect.
    */
  var RedirectConfig: js.UndefOr[RedirectActionConfig] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the target group. Specify only when Type is forward.
    */
  var TargetGroupArn: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.TargetGroupArn] = js.undefined
  /**
    * The type of action. Each rule must include exactly one of the following types of actions: forward, fixed-response, or redirect.
    */
  var Type: ActionTypeEnum
}

object Action {
  @scala.inline
  def apply(
    Type: ActionTypeEnum,
    AuthenticateCognitoConfig: AuthenticateCognitoActionConfig = null,
    AuthenticateOidcConfig: AuthenticateOidcActionConfig = null,
    FixedResponseConfig: FixedResponseActionConfig = null,
    Order: js.UndefOr[ActionOrder] = js.undefined,
    RedirectConfig: RedirectActionConfig = null,
    TargetGroupArn: TargetGroupArn = null
  ): Action = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (AuthenticateCognitoConfig != null) __obj.updateDynamic("AuthenticateCognitoConfig")(AuthenticateCognitoConfig)
    if (AuthenticateOidcConfig != null) __obj.updateDynamic("AuthenticateOidcConfig")(AuthenticateOidcConfig)
    if (FixedResponseConfig != null) __obj.updateDynamic("FixedResponseConfig")(FixedResponseConfig)
    if (!js.isUndefined(Order)) __obj.updateDynamic("Order")(Order)
    if (RedirectConfig != null) __obj.updateDynamic("RedirectConfig")(RedirectConfig)
    if (TargetGroupArn != null) __obj.updateDynamic("TargetGroupArn")(TargetGroupArn)
    __obj.asInstanceOf[Action]
  }
}

