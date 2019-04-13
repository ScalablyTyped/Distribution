package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetRulePrioritiesOutput extends js.Object {
  /**
    * Information about the rules.
    */
  var Rules: js.UndefOr[Rules] = js.undefined
}

object SetRulePrioritiesOutput {
  @scala.inline
  def apply(Rules: Rules = null): SetRulePrioritiesOutput = {
    val __obj = js.Dynamic.literal()
    if (Rules != null) __obj.updateDynamic("Rules")(Rules)
    __obj.asInstanceOf[SetRulePrioritiesOutput]
  }
}

