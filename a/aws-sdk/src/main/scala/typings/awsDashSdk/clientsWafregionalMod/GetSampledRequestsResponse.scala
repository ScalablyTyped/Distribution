package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSampledRequestsResponse extends js.Object {
  /**
    * The total number of requests from which GetSampledRequests got a sample of MaxItems requests. If PopulationSize is less than MaxItems, the sample includes every request that your AWS resource received during the specified time range.
    */
  var PopulationSize: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.PopulationSize] = js.undefined
  /**
    * A complex type that contains detailed information about each of the requests in the sample.
    */
  var SampledRequests: js.UndefOr[SampledHTTPRequests] = js.undefined
  /**
    * Usually, TimeWindow is the time range that you specified in the GetSampledRequests request. However, if your AWS resource received more than 5,000 requests during the time range that you specified in the request, GetSampledRequests returns the time range for the first 5,000 requests.
    */
  var TimeWindow: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.TimeWindow] = js.undefined
}

object GetSampledRequestsResponse {
  @scala.inline
  def apply(
    PopulationSize: js.UndefOr[PopulationSize] = js.undefined,
    SampledRequests: SampledHTTPRequests = null,
    TimeWindow: TimeWindow = null
  ): GetSampledRequestsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(PopulationSize)) __obj.updateDynamic("PopulationSize")(PopulationSize)
    if (SampledRequests != null) __obj.updateDynamic("SampledRequests")(SampledRequests)
    if (TimeWindow != null) __obj.updateDynamic("TimeWindow")(TimeWindow)
    __obj.asInstanceOf[GetSampledRequestsResponse]
  }
}

