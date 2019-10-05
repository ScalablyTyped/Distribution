package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInventoryRequest extends js.Object {
  /**
    * Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an expression that uses the AWS:InstanceInformation.PlatformType type, you can see a count of how many Windows and Linux instances exist in your inventoried fleet.
    */
  var Aggregators: js.UndefOr[InventoryAggregatorList] = js.undefined
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[InventoryFilterList] = js.undefined
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
  /**
    * The list of inventory item types to return.
    */
  var ResultAttributes: js.UndefOr[ResultAttributeList] = js.undefined
}

object GetInventoryRequest {
  @scala.inline
  def apply(
    Aggregators: InventoryAggregatorList = null,
    Filters: InventoryFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    ResultAttributes: ResultAttributeList = null
  ): GetInventoryRequest = {
    val __obj = js.Dynamic.literal()
    if (Aggregators != null) __obj.updateDynamic("Aggregators")(Aggregators)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ResultAttributes != null) __obj.updateDynamic("ResultAttributes")(ResultAttributes)
    __obj.asInstanceOf[GetInventoryRequest]
  }
}

