package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRuleOutput extends js.Object {
  /**
    * Information about the rule.
    */
  var Rules: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Rules] = js.native
}

object CreateRuleOutput {
  @scala.inline
  def apply(Rules: Rules = null): CreateRuleOutput = {
    val __obj = js.Dynamic.literal()
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleOutput]
  }
}

