package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyRuleInput extends js.Object {
  /**
    * The actions. If the action type is forward, you specify a target group. The protocol of the target group must be HTTP or HTTPS for an Application Load Balancer. The protocol of the target group must be TCP or TLS for a Network Load Balancer. [HTTPS listeners] If the action type is authenticate-oidc, you authenticate users through an identity provider that is OpenID Connect (OIDC) compliant. [HTTPS listeners] If the action type is authenticate-cognito, you authenticate users through the user pools supported by Amazon Cognito. [Application Load Balancer] If the action type is redirect, you redirect specified client requests from one URL to another. [Application Load Balancer] If the action type is fixed-response, you drop specified client requests and return a custom HTTP response.
    */
  var Actions: js.UndefOr[Actions] = js.undefined
  /**
    * The conditions. Each condition specifies a field name and a single value. If the field name is host-header, you can specify a single host name (for example, my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following characters. You can include up to three wildcard characters.   A-Z, a-z, 0-9   - .   * (matches 0 or more characters)   ? (matches exactly 1 character)   If the field name is path-pattern, you can specify a single path pattern. A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following characters. You can include up to three wildcard characters.   A-Z, a-z, 0-9   _ - . $ / ~ " ' @ : +   &amp; (using &amp;amp;)   * (matches 0 or more characters)   ? (matches exactly 1 character)  
    */
  var Conditions: js.UndefOr[RuleConditionList] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: awsDashSdkLib.clientsElbv2Mod.RuleArn
}

object ModifyRuleInput {
  @scala.inline
  def apply(RuleArn: RuleArn, Actions: Actions = null, Conditions: RuleConditionList = null): ModifyRuleInput = {
    val __obj = js.Dynamic.literal(RuleArn = RuleArn)
    if (Actions != null) __obj.updateDynamic("Actions")(Actions)
    if (Conditions != null) __obj.updateDynamic("Conditions")(Conditions)
    __obj.asInstanceOf[ModifyRuleInput]
  }
}

