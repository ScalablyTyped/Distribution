package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTraceSummariesRequest extends js.Object {
  /**
    * The end of the time frame for which to retrieve traces.
    */
  var EndTime: Timestamp = js.native
  /**
    * Specify a filter expression to retrieve trace summaries for services or requests that meet certain requirements.
    */
  var FilterExpression: js.UndefOr[typings.awsDashSdk.clientsXrayMod.FilterExpression] = js.native
  /**
    * Specify the pagination token returned by a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Set to true to get summaries for only a subset of available traces.
    */
  var Sampling: js.UndefOr[NullableBoolean] = js.native
  /**
    * A paramater to indicate whether to enable sampling on trace summaries. Input parameters are Name and Value.
    */
  var SamplingStrategy: js.UndefOr[typings.awsDashSdk.clientsXrayMod.SamplingStrategy] = js.native
  /**
    * The start of the time frame for which to retrieve traces.
    */
  var StartTime: Timestamp = js.native
  /**
    * A parameter to indicate whether to query trace summaries by TraceId or Event time.
    */
  var TimeRangeType: js.UndefOr[typings.awsDashSdk.clientsXrayMod.TimeRangeType] = js.native
}

object GetTraceSummariesRequest {
  @scala.inline
  def apply(
    EndTime: Timestamp,
    StartTime: Timestamp,
    FilterExpression: FilterExpression = null,
    NextToken: String = null,
    Sampling: js.UndefOr[scala.Boolean] = js.undefined,
    SamplingStrategy: SamplingStrategy = null,
    TimeRangeType: TimeRangeType = null
  ): GetTraceSummariesRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    if (FilterExpression != null) __obj.updateDynamic("FilterExpression")(FilterExpression.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(Sampling)) __obj.updateDynamic("Sampling")(Sampling.asInstanceOf[js.Any])
    if (SamplingStrategy != null) __obj.updateDynamic("SamplingStrategy")(SamplingStrategy.asInstanceOf[js.Any])
    if (TimeRangeType != null) __obj.updateDynamic("TimeRangeType")(TimeRangeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTraceSummariesRequest]
  }
}

