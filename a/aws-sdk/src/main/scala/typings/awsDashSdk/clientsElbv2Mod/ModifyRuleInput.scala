package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyRuleInput extends js.Object {
  /**
    * The actions. Each rule must include exactly one of the following types of actions: forward, fixed-response, or redirect, and it must be the last action to be performed. If the action type is forward, you specify one or more target groups. The protocol of the target group must be HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP, TLS, UDP, or TCP_UDP for a Network Load Balancer. [HTTPS listeners] If the action type is authenticate-oidc, you authenticate users through an identity provider that is OpenID Connect (OIDC) compliant. [HTTPS listeners] If the action type is authenticate-cognito, you authenticate users through the user pools supported by Amazon Cognito. [Application Load Balancer] If the action type is redirect, you redirect specified client requests from one URL to another. [Application Load Balancer] If the action type is fixed-response, you drop specified client requests and return a custom HTTP response.
    */
  var Actions: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Actions] = js.native
  /**
    * The conditions. Each rule can include zero or one of the following conditions: http-request-method, host-header, path-pattern, and source-ip, and zero or more of the following conditions: http-header and query-string.
    */
  var Conditions: js.UndefOr[RuleConditionList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: typings.awsDashSdk.clientsElbv2Mod.RuleArn = js.native
}

object ModifyRuleInput {
  @scala.inline
  def apply(RuleArn: RuleArn, Actions: Actions = null, Conditions: RuleConditionList = null): ModifyRuleInput = {
    val __obj = js.Dynamic.literal(RuleArn = RuleArn.asInstanceOf[js.Any])
    if (Actions != null) __obj.updateDynamic("Actions")(Actions.asInstanceOf[js.Any])
    if (Conditions != null) __obj.updateDynamic("Conditions")(Conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyRuleInput]
  }
}

