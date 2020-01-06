package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTopicRuleRequest extends js.Object {
  /**
    * The name of the rule.
    */
  var ruleName: RuleName = js.native
}

object GetTopicRuleRequest {
  @scala.inline
  def apply(ruleName: RuleName): GetTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTopicRuleRequest]
  }
}

