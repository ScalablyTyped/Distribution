package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTrafficMirrorFiltersResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. The value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about one or more Traffic Mirror filters.
    */
  var TrafficMirrorFilters: js.UndefOr[TrafficMirrorFilterSet] = js.undefined
}

object DescribeTrafficMirrorFiltersResult {
  @scala.inline
  def apply(NextToken: String = null, TrafficMirrorFilters: TrafficMirrorFilterSet = null): DescribeTrafficMirrorFiltersResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TrafficMirrorFilters != null) __obj.updateDynamic("TrafficMirrorFilters")(TrafficMirrorFilters)
    __obj.asInstanceOf[DescribeTrafficMirrorFiltersResult]
  }
}

