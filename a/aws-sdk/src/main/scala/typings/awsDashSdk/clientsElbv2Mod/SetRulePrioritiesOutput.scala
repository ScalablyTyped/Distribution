package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetRulePrioritiesOutput extends js.Object {
  /**
    * Information about the rules.
    */
  var Rules: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Rules] = js.native
}

object SetRulePrioritiesOutput {
  @scala.inline
  def apply(Rules: Rules = null): SetRulePrioritiesOutput = {
    val __obj = js.Dynamic.literal()
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRulePrioritiesOutput]
  }
}

