package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableInsightRulesOutput extends js.Object {
  /**
    * An array listing the rules that could not be enabled. You cannot disable or enable built-in rules.
    */
  var Failures: js.UndefOr[BatchFailures] = js.native
}

object EnableInsightRulesOutput {
  @scala.inline
  def apply(Failures: BatchFailures = null): EnableInsightRulesOutput = {
    val __obj = js.Dynamic.literal()
    if (Failures != null) __obj.updateDynamic("Failures")(Failures.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableInsightRulesOutput]
  }
}

