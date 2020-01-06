package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRuleResult extends js.Object {
  /**
    * The created rule.
    */
  var rule: js.UndefOr[Rule] = js.native
}

object CreateRuleResult {
  @scala.inline
  def apply(rule: Rule = null): CreateRuleResult = {
    val __obj = js.Dynamic.literal()
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleResult]
  }
}

