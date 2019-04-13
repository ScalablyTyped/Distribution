package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAggregateDiscoveredResourceCountsRequest extends js.Object {
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: awsDashSdkLib.clientsConfigserviceMod.ConfigurationAggregatorName
  /**
    * Filters the results based on the ResourceCountFilters object.
    */
  var Filters: js.UndefOr[ResourceCountFilters] = js.undefined
  /**
    * The key to group the resource counts.
    */
  var GroupByKey: js.UndefOr[ResourceCountGroupKey] = js.undefined
  /**
    * The maximum number of GroupedResourceCount objects returned on each page. The default is 1000. You cannot specify a number greater than 1000. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[GroupByAPILimit] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object GetAggregateDiscoveredResourceCountsRequest {
  @scala.inline
  def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    Filters: ResourceCountFilters = null,
    GroupByKey: ResourceCountGroupKey = null,
    Limit: js.UndefOr[GroupByAPILimit] = js.undefined,
    NextToken: NextToken = null
  ): GetAggregateDiscoveredResourceCountsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (GroupByKey != null) __obj.updateDynamic("GroupByKey")(GroupByKey.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetAggregateDiscoveredResourceCountsRequest]
  }
}

