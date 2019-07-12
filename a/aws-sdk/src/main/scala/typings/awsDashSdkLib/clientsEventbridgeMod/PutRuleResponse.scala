package typings
package awsDashSdkLib.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRuleResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: js.UndefOr[RuleArn] = js.undefined
}

object PutRuleResponse {
  @scala.inline
  def apply(RuleArn: RuleArn = null): PutRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (RuleArn != null) __obj.updateDynamic("RuleArn")(RuleArn)
    __obj.asInstanceOf[PutRuleResponse]
  }
}

