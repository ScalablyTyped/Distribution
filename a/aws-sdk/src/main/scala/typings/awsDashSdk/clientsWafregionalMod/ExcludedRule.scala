package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludedRule extends js.Object {
  /**
    * The unique identifier for the rule to exclude from the rule group.
    */
  var RuleId: ResourceId = js.native
}

object ExcludedRule {
  @scala.inline
  def apply(RuleId: ResourceId): ExcludedRule = {
    val __obj = js.Dynamic.literal(RuleId = RuleId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExcludedRule]
  }
}

