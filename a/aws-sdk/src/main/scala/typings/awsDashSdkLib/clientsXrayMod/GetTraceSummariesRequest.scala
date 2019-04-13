package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTraceSummariesRequest extends js.Object {
  /**
    * The end of the time frame for which to retrieve traces.
    */
  var EndTime: Timestamp
  /**
    * Specify a filter expression to retrieve trace summaries for services or requests that meet certain requirements.
    */
  var FilterExpression: js.UndefOr[FilterExpression] = js.undefined
  /**
    * Specify the pagination token returned by a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Set to true to get summaries for only a subset of available traces.
    */
  var Sampling: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * The start of the time frame for which to retrieve traces.
    */
  var StartTime: Timestamp
}

object GetTraceSummariesRequest {
  @scala.inline
  def apply(
    EndTime: Timestamp,
    StartTime: Timestamp,
    FilterExpression: FilterExpression = null,
    NextToken: String = null,
    Sampling: js.UndefOr[NullableBoolean] = js.undefined
  ): GetTraceSummariesRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime, StartTime = StartTime)
    if (FilterExpression != null) __obj.updateDynamic("FilterExpression")(FilterExpression)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (!js.isUndefined(Sampling)) __obj.updateDynamic("Sampling")(Sampling)
    __obj.asInstanceOf[GetTraceSummariesRequest]
  }
}

