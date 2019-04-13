package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableTopicRuleRequest extends js.Object {
  /**
    * The name of the topic rule to enable.
    */
  var ruleName: RuleName
}

object EnableTopicRuleRequest {
  @scala.inline
  def apply(ruleName: RuleName): EnableTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName)
  
    __obj.asInstanceOf[EnableTopicRuleRequest]
  }
}

