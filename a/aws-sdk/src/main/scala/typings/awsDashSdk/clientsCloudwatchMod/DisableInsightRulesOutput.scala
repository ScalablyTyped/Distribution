package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableInsightRulesOutput extends js.Object {
  /**
    * An array listing the rules that could not be disabled. You cannot disable built-in rules.
    */
  var Failures: js.UndefOr[BatchFailures] = js.native
}

object DisableInsightRulesOutput {
  @scala.inline
  def apply(Failures: BatchFailures = null): DisableInsightRulesOutput = {
    val __obj = js.Dynamic.literal()
    if (Failures != null) __obj.updateDynamic("Failures")(Failures.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableInsightRulesOutput]
  }
}

