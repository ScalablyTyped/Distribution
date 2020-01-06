package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTopicRuleResponse extends js.Object {
  /**
    * The rule.
    */
  var rule: js.UndefOr[TopicRule] = js.native
  /**
    * The rule ARN.
    */
  var ruleArn: js.UndefOr[RuleArn] = js.native
}

object GetTopicRuleResponse {
  @scala.inline
  def apply(rule: TopicRule = null, ruleArn: RuleArn = null): GetTopicRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (ruleArn != null) __obj.updateDynamic("ruleArn")(ruleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTopicRuleResponse]
  }
}

