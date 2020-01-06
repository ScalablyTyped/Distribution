package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInsightRulesOutput extends js.Object {
  /**
    * An array listing the rules that could not be deleted. You cannot delete built-in rules.
    */
  var Failures: js.UndefOr[BatchFailures] = js.native
}

object DeleteInsightRulesOutput {
  @scala.inline
  def apply(Failures: BatchFailures = null): DeleteInsightRulesOutput = {
    val __obj = js.Dynamic.literal()
    if (Failures != null) __obj.updateDynamic("Failures")(Failures.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInsightRulesOutput]
  }
}

