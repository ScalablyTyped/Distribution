package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTraceSummariesResult extends js.Object {
  /**
    * The start time of this page of results.
    */
  var ApproximateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * If the requested time frame contained more than one page of results, you can use this token to retrieve the next page. The first page contains the most most recent results, closest to the end of the time frame.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Trace IDs and metadata for traces that were found in the specified time frame.
    */
  var TraceSummaries: js.UndefOr[TraceSummaryList] = js.undefined
  /**
    * The total number of traces processed, including traces that did not match the specified filter expression.
    */
  var TracesProcessedCount: js.UndefOr[NullableLong] = js.undefined
}

object GetTraceSummariesResult {
  @scala.inline
  def apply(
    ApproximateTime: Timestamp = null,
    NextToken: String = null,
    TraceSummaries: TraceSummaryList = null,
    TracesProcessedCount: js.UndefOr[NullableLong] = js.undefined
  ): GetTraceSummariesResult = {
    val __obj = js.Dynamic.literal()
    if (ApproximateTime != null) __obj.updateDynamic("ApproximateTime")(ApproximateTime)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TraceSummaries != null) __obj.updateDynamic("TraceSummaries")(TraceSummaries)
    if (!js.isUndefined(TracesProcessedCount)) __obj.updateDynamic("TracesProcessedCount")(TracesProcessedCount)
    __obj.asInstanceOf[GetTraceSummariesResult]
  }
}

