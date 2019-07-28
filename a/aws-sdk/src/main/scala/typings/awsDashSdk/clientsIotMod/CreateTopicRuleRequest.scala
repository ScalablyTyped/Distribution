package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTopicRuleRequest extends js.Object {
  /**
    * The name of the rule.
    */
  var ruleName: RuleName
  /**
    * Metadata which can be used to manage the topic rule.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
    */
  var tags: js.UndefOr[String] = js.undefined
  /**
    * The rule payload.
    */
  var topicRulePayload: TopicRulePayload
}

object CreateTopicRuleRequest {
  @scala.inline
  def apply(ruleName: RuleName, topicRulePayload: TopicRulePayload, tags: String = null): CreateTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName, topicRulePayload = topicRulePayload)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateTopicRuleRequest]
  }
}

