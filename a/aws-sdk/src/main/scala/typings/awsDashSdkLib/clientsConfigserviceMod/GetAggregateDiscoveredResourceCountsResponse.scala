package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAggregateDiscoveredResourceCountsResponse extends js.Object {
  /**
    * The key passed into the request object. If GroupByKey is not provided, the result will be empty.
    */
  var GroupByKey: js.UndefOr[StringWithCharLimit256] = js.undefined
  /**
    * Returns a list of GroupedResourceCount objects.
    */
  var GroupedResourceCounts: js.UndefOr[GroupedResourceCountList] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The total number of resources that are present in an aggregator with the filters that you provide.
    */
  var TotalDiscoveredResources: Long
}

object GetAggregateDiscoveredResourceCountsResponse {
  @scala.inline
  def apply(
    TotalDiscoveredResources: Long,
    GroupByKey: StringWithCharLimit256 = null,
    GroupedResourceCounts: GroupedResourceCountList = null,
    NextToken: NextToken = null
  ): GetAggregateDiscoveredResourceCountsResponse = {
    val __obj = js.Dynamic.literal(TotalDiscoveredResources = TotalDiscoveredResources)
    if (GroupByKey != null) __obj.updateDynamic("GroupByKey")(GroupByKey)
    if (GroupedResourceCounts != null) __obj.updateDynamic("GroupedResourceCounts")(GroupedResourceCounts)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetAggregateDiscoveredResourceCountsResponse]
  }
}

