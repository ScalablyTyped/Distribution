package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRuleInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: typings.awsDashSdk.clientsElbv2Mod.RuleArn
}

object DeleteRuleInput {
  @scala.inline
  def apply(RuleArn: RuleArn): DeleteRuleInput = {
    val __obj = js.Dynamic.literal(RuleArn = RuleArn)
  
    __obj.asInstanceOf[DeleteRuleInput]
  }
}

