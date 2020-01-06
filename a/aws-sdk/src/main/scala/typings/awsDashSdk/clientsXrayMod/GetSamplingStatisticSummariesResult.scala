package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSamplingStatisticSummariesResult extends js.Object {
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the number of requests instrumented for each sampling rule.
    */
  var SamplingStatisticSummaries: js.UndefOr[SamplingStatisticSummaryList] = js.native
}

object GetSamplingStatisticSummariesResult {
  @scala.inline
  def apply(NextToken: String = null, SamplingStatisticSummaries: SamplingStatisticSummaryList = null): GetSamplingStatisticSummariesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SamplingStatisticSummaries != null) __obj.updateDynamic("SamplingStatisticSummaries")(SamplingStatisticSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingStatisticSummariesResult]
  }
}

