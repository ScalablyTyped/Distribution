package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceTopicRuleRequest extends js.Object {
  /**
    * The name of the rule.
    */
  var ruleName: RuleName
  /**
    * The rule payload.
    */
  var topicRulePayload: TopicRulePayload
}

object ReplaceTopicRuleRequest {
  @scala.inline
  def apply(ruleName: RuleName, topicRulePayload: TopicRulePayload): ReplaceTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName, topicRulePayload = topicRulePayload)
  
    __obj.asInstanceOf[ReplaceTopicRuleRequest]
  }
}

