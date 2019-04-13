package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulePriorityPair extends js.Object {
  /**
    * The rule priority.
    */
  var Priority: js.UndefOr[RulePriority] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: js.UndefOr[RuleArn] = js.undefined
}

object RulePriorityPair {
  @scala.inline
  def apply(Priority: js.UndefOr[RulePriority] = js.undefined, RuleArn: RuleArn = null): RulePriorityPair = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority)
    if (RuleArn != null) __obj.updateDynamic("RuleArn")(RuleArn)
    __obj.asInstanceOf[RulePriorityPair]
  }
}

