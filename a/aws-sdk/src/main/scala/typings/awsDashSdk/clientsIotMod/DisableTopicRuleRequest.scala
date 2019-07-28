package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableTopicRuleRequest extends js.Object {
  /**
    * The name of the rule to disable.
    */
  var ruleName: RuleName
}

object DisableTopicRuleRequest {
  @scala.inline
  def apply(ruleName: RuleName): DisableTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName)
  
    __obj.asInstanceOf[DisableTopicRuleRequest]
  }
}

