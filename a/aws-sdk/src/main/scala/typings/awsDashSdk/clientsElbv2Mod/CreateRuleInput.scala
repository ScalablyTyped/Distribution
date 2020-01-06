package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRuleInput extends js.Object {
  /**
    * The actions. Each rule must include exactly one of the following types of actions: forward, fixed-response, or redirect, and it must be the last action to be performed. If the action type is forward, you specify one or more target groups. The protocol of the target group must be HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP, TLS, UDP, or TCP_UDP for a Network Load Balancer. [HTTPS listeners] If the action type is authenticate-oidc, you authenticate users through an identity provider that is OpenID Connect (OIDC) compliant. [HTTPS listeners] If the action type is authenticate-cognito, you authenticate users through the user pools supported by Amazon Cognito. [Application Load Balancer] If the action type is redirect, you redirect specified client requests from one URL to another. [Application Load Balancer] If the action type is fixed-response, you drop specified client requests and return a custom HTTP response.
    */
  var Actions: typings.awsDashSdk.clientsElbv2Mod.Actions = js.native
  /**
    * The conditions. Each rule can include zero or one of the following conditions: http-request-method, host-header, path-pattern, and source-ip, and zero or more of the following conditions: http-header and query-string.
    */
  var Conditions: RuleConditionList = js.native
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: typings.awsDashSdk.clientsElbv2Mod.ListenerArn = js.native
  /**
    * The rule priority. A listener can't have multiple rules with the same priority.
    */
  var Priority: RulePriority = js.native
}

object CreateRuleInput {
  @scala.inline
  def apply(Actions: Actions, Conditions: RuleConditionList, ListenerArn: ListenerArn, Priority: RulePriority): CreateRuleInput = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Conditions = Conditions.asInstanceOf[js.Any], ListenerArn = ListenerArn.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateRuleInput]
  }
}

