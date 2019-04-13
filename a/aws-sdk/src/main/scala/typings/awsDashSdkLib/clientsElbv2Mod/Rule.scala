package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  /**
    * The actions.
    */
  var Actions: js.UndefOr[Actions] = js.undefined
  /**
    * The conditions.
    */
  var Conditions: js.UndefOr[RuleConditionList] = js.undefined
  /**
    * Indicates whether this is the default rule.
    */
  var IsDefault: js.UndefOr[IsDefault] = js.undefined
  /**
    * The priority.
    */
  var Priority: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: js.UndefOr[RuleArn] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    Actions: Actions = null,
    Conditions: RuleConditionList = null,
    IsDefault: js.UndefOr[IsDefault] = js.undefined,
    Priority: String = null,
    RuleArn: RuleArn = null
  ): Rule = {
    val __obj = js.Dynamic.literal()
    if (Actions != null) __obj.updateDynamic("Actions")(Actions)
    if (Conditions != null) __obj.updateDynamic("Conditions")(Conditions)
    if (!js.isUndefined(IsDefault)) __obj.updateDynamic("IsDefault")(IsDefault)
    if (Priority != null) __obj.updateDynamic("Priority")(Priority)
    if (RuleArn != null) __obj.updateDynamic("RuleArn")(RuleArn)
    __obj.asInstanceOf[Rule]
  }
}

