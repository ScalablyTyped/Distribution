package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleListItem extends js.Object {
  /**
    * The date and time the rule was created.
    */
  var createdAt: js.UndefOr[CreatedAtDate] = js.undefined
  /**
    * The rule ARN.
    */
  var ruleArn: js.UndefOr[RuleArn] = js.undefined
  /**
    * Specifies whether the rule is disabled.
    */
  var ruleDisabled: js.UndefOr[IsDisabled] = js.undefined
  /**
    * The name of the rule.
    */
  var ruleName: js.UndefOr[RuleName] = js.undefined
  /**
    * The pattern for the topic names that apply.
    */
  var topicPattern: js.UndefOr[TopicPattern] = js.undefined
}

object TopicRuleListItem {
  @scala.inline
  def apply(
    createdAt: CreatedAtDate = null,
    ruleArn: RuleArn = null,
    ruleDisabled: js.UndefOr[IsDisabled] = js.undefined,
    ruleName: RuleName = null,
    topicPattern: TopicPattern = null
  ): TopicRuleListItem = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (ruleArn != null) __obj.updateDynamic("ruleArn")(ruleArn)
    if (!js.isUndefined(ruleDisabled)) __obj.updateDynamic("ruleDisabled")(ruleDisabled)
    if (ruleName != null) __obj.updateDynamic("ruleName")(ruleName)
    if (topicPattern != null) __obj.updateDynamic("topicPattern")(topicPattern)
    __obj.asInstanceOf[TopicRuleListItem]
  }
}

