package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSamplingStatisticSummariesResult extends js.Object {
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the number of requests instrumented for each sampling rule.
    */
  var SamplingStatisticSummaries: js.UndefOr[SamplingStatisticSummaryList] = js.undefined
}

object GetSamplingStatisticSummariesResult {
  @scala.inline
  def apply(NextToken: String = null, SamplingStatisticSummaries: SamplingStatisticSummaryList = null): GetSamplingStatisticSummariesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SamplingStatisticSummaries != null) __obj.updateDynamic("SamplingStatisticSummaries")(SamplingStatisticSummaries)
    __obj.asInstanceOf[GetSamplingStatisticSummariesResult]
  }
}

