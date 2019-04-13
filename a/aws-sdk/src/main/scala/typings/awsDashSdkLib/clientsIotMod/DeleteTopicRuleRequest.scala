package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTopicRuleRequest extends js.Object {
  /**
    * The name of the rule.
    */
  var ruleName: RuleName
}

object DeleteTopicRuleRequest {
  @scala.inline
  def apply(ruleName: RuleName): DeleteTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName)
  
    __obj.asInstanceOf[DeleteTopicRuleRequest]
  }
}

