package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeParametersRequest extends js.Object {
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[ParametersFilterList] = js.undefined
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
  /**
    * Filters to limit the request results.
    */
  var ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.undefined
}

object DescribeParametersRequest {
  @scala.inline
  def apply(
    Filters: ParametersFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    ParameterFilters: ParameterStringFilterList = null
  ): DescribeParametersRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ParameterFilters != null) __obj.updateDynamic("ParameterFilters")(ParameterFilters)
    __obj.asInstanceOf[DescribeParametersRequest]
  }
}

