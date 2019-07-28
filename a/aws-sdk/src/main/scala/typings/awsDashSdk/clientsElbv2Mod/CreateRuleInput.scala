package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRuleInput extends js.Object {
  /**
    * The actions. Each rule must include exactly one of the following types of actions: forward, fixed-response, or redirect. If the action type is forward, you specify a target group. The protocol of the target group must be HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP, TLS, UDP, or TCP_UDP for a Network Load Balancer. [HTTPS listeners] If the action type is authenticate-oidc, you authenticate users through an identity provider that is OpenID Connect (OIDC) compliant. [HTTPS listeners] If the action type is authenticate-cognito, you authenticate users through the user pools supported by Amazon Cognito. [Application Load Balancer] If the action type is redirect, you redirect specified client requests from one URL to another. [Application Load Balancer] If the action type is fixed-response, you drop specified client requests and return a custom HTTP response.
    */
  var Actions: typings.awsDashSdk.clientsElbv2Mod.Actions
  /**
    * The conditions. Each rule can include zero or one of the following conditions: http-request-method, host-header, path-pattern, and source-ip, and zero or more of the following conditions: http-header and query-string.
    */
  var Conditions: RuleConditionList
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: typings.awsDashSdk.clientsElbv2Mod.ListenerArn
  /**
    * The rule priority. A listener can't have multiple rules with the same priority.
    */
  var Priority: RulePriority
}

object CreateRuleInput {
  @scala.inline
  def apply(Actions: Actions, Conditions: RuleConditionList, ListenerArn: ListenerArn, Priority: RulePriority): CreateRuleInput = {
    val __obj = js.Dynamic.literal(Actions = Actions, Conditions = Conditions, ListenerArn = ListenerArn, Priority = Priority)
  
    __obj.asInstanceOf[CreateRuleInput]
  }
}

