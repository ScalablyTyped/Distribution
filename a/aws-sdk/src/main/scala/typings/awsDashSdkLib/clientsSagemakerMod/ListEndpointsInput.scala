package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEndpointsInput extends js.Object {
  /**
    * A filter that returns only endpoints with a creation time greater than or equal to the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
  /**
    * A filter that returns only endpoints that were created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
  /**
    *  A filter that returns only endpoints that were modified after the specified timestamp. 
    */
  var LastModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined
  /**
    *  A filter that returns only endpoints that were modified before the specified timestamp. 
    */
  var LastModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined
  /**
    * The maximum number of endpoints to return in the response.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A string in endpoint names. This filter returns only endpoints whose name contains the specified string.
    */
  var NameContains: js.UndefOr[EndpointNameContains] = js.undefined
  /**
    * If the result of a ListEndpoints request was truncated, the response includes a NextToken. To retrieve the next set of endpoints, use the token in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * Sorts the list of results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[EndpointSortKey] = js.undefined
  /**
    * The sort order for results. The default is Descending.
    */
  var SortOrder: js.UndefOr[OrderKey] = js.undefined
  /**
    *  A filter that returns only endpoints with the specified status.
    */
  var StatusEquals: js.UndefOr[EndpointStatus] = js.undefined
}

object ListEndpointsInput {
  @scala.inline
  def apply(
    CreationTimeAfter: Timestamp = null,
    CreationTimeBefore: Timestamp = null,
    LastModifiedTimeAfter: Timestamp = null,
    LastModifiedTimeBefore: Timestamp = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NameContains: EndpointNameContains = null,
    NextToken: PaginationToken = null,
    SortBy: EndpointSortKey = null,
    SortOrder: OrderKey = null,
    StatusEquals: EndpointStatus = null
  ): ListEndpointsInput = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter)
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore)
    if (LastModifiedTimeAfter != null) __obj.updateDynamic("LastModifiedTimeAfter")(LastModifiedTimeAfter)
    if (LastModifiedTimeBefore != null) __obj.updateDynamic("LastModifiedTimeBefore")(LastModifiedTimeBefore)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (StatusEquals != null) __obj.updateDynamic("StatusEquals")(StatusEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointsInput]
  }
}

