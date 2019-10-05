package typings.awsDashSdk.clientsSsmMod

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
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxResults] = js.undefined
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object GetOpsSummaryRequest {
  @scala.inline
  def apply(
    Aggregators: OpsAggregatorList,
    Filters: OpsFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): GetOpsSummaryRequest = {
    val __obj = js.Dynamic.literal(Aggregators = Aggregators)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetOpsSummaryRequest]
  }
}

