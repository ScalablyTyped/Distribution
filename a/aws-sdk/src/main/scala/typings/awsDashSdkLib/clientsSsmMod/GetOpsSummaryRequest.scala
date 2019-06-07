package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOpsSummaryRequest extends js.Object {
  /**
    * Optional aggregators that return counts of OpsItems based on one or more expressions.
    */
  var Aggregators: OpsAggregatorList
  /**
    * Optional filters used to scope down the returned OpsItems. 
    */
  var Filters: js.UndefOr[OpsFilterList] = js.undefined
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object GetOpsSummaryRequest {
  @scala.inline
  def apply(
    Aggregators: OpsAggregatorList,
    Filters: OpsFilterList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): GetOpsSummaryRequest = {
    val __obj = js.Dynamic.literal(Aggregators = Aggregators)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetOpsSummaryRequest]
  }
}

