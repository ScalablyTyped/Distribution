package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEndpointConfigsInput extends js.Object {
  /**
    * A filter that returns only endpoint configurations with a creation time greater than or equal to the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
  /**
    * A filter that returns only endpoint configurations created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
  /**
    * The maximum number of training jobs to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxResults] = js.undefined
  /**
    * A string in the endpoint configuration name. This filter returns only endpoint configurations whose name contains the specified string. 
    */
  var NameContains: js.UndefOr[EndpointConfigNameContains] = js.undefined
  /**
    * If the result of the previous ListEndpointConfig request was truncated, the response includes a NextToken. To retrieve the next set of endpoint configurations, use the token in the next request. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The field to sort results by. The default is CreationTime.
    */
  var SortBy: js.UndefOr[EndpointConfigSortKey] = js.undefined
  /**
    * The sort order for results. The default is Descending.
    */
  var SortOrder: js.UndefOr[OrderKey] = js.undefined
}

object ListEndpointConfigsInput {
  @scala.inline
  def apply(
    CreationTimeAfter: Timestamp = null,
    CreationTimeBefore: Timestamp = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NameContains: EndpointConfigNameContains = null,
    NextToken: PaginationToken = null,
    SortBy: EndpointConfigSortKey = null,
    SortOrder: OrderKey = null
  ): ListEndpointConfigsInput = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter)
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointConfigsInput]
  }
}

