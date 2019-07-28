package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestMetricFilterResponse extends js.Object {
  /**
    * The matched events.
    */
  var matches: js.UndefOr[MetricFilterMatches] = js.undefined
}

object TestMetricFilterResponse {
  @scala.inline
  def apply(matches: MetricFilterMatches = null): TestMetricFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (matches != null) __obj.updateDynamic("matches")(matches)
    __obj.asInstanceOf[TestMetricFilterResponse]
  }
}

