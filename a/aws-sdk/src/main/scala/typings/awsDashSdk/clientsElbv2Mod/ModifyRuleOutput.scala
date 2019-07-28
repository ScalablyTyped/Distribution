package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyRuleOutput extends js.Object {
  /**
    * Information about the modified rule.
    */
  var Rules: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Rules] = js.undefined
}

object ModifyRuleOutput {
  @scala.inline
  def apply(Rules: Rules = null): ModifyRuleOutput = {
    val __obj = js.Dynamic.literal()
    if (Rules != null) __obj.updateDynamic("Rules")(Rules)
    __obj.asInstanceOf[ModifyRuleOutput]
  }
}

