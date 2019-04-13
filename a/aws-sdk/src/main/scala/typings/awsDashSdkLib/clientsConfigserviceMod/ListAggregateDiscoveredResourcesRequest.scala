package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAggregateDiscoveredResourcesRequest extends js.Object {
  /**
    * The name of the configuration aggregator. 
    */
  var ConfigurationAggregatorName: awsDashSdkLib.clientsConfigserviceMod.ConfigurationAggregatorName
  /**
    * Filters the results based on the ResourceFilters object.
    */
  var Filters: js.UndefOr[ResourceFilters] = js.undefined
  /**
    * The maximum number of resource identifiers returned on each page. The default is 100. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[Limit] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The type of resources that you want AWS Config to list in the response.
    */
  var ResourceType: awsDashSdkLib.clientsConfigserviceMod.ResourceType
}

object ListAggregateDiscoveredResourcesRequest {
  @scala.inline
  def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    ResourceType: ResourceType,
    Filters: ResourceFilters = null,
    Limit: js.UndefOr[Limit] = js.undefined,
    NextToken: NextToken = null
  ): ListAggregateDiscoveredResourcesRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName, ResourceType = ResourceType.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAggregateDiscoveredResourcesRequest]
  }
}

