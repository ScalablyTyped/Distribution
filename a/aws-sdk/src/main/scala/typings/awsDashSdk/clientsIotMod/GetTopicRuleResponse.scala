package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTopicRuleResponse extends js.Object {
  /**
    * The rule.
    */
  var rule: js.UndefOr[TopicRule] = js.undefined
  /**
    * The rule ARN.
    */
  var ruleArn: js.UndefOr[RuleArn] = js.undefined
}

object GetTopicRuleResponse {
  @scala.inline
  def apply(rule: TopicRule = null, ruleArn: RuleArn = null): GetTopicRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule)
    if (ruleArn != null) __obj.updateDynamic("ruleArn")(ruleArn)
    __obj.asInstanceOf[GetTopicRuleResponse]
  }
}

