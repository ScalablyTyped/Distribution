package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConfigurationsRequest extends js.Object {
  /**
    * A valid configuration identified by Application Discovery Service. 
    */
  var configurationType: ConfigurationItemType
  /**
    * You can filter the request using various logical operators and a key-value format. For example:   {"key": "serverType", "value": "webServer"}  For a complete list of filter options and guidance about using them with this action, see Querying Discovered Configuration Items. 
    */
  var filters: js.UndefOr[Filters] = js.undefined
  /**
    * The total number of items to return. The maximum value is 100.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  /**
    * Token to retrieve the next set of results. For example, if a previous call to ListConfigurations returned 100 items, but you set ListConfigurationsRequest$maxResults to 10, you received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Certain filter criteria return output that can be sorted in ascending or descending order. For a list of output characteristics for each filter, see Using the ListConfigurations Action.
    */
  var orderBy: js.UndefOr[OrderByList] = js.undefined
}

object ListConfigurationsRequest {
  @scala.inline
  def apply(
    configurationType: ConfigurationItemType,
    filters: Filters = null,
    maxResults: js.UndefOr[Integer] = js.undefined,
    nextToken: NextToken = null,
    orderBy: OrderByList = null
  ): ListConfigurationsRequest = {
    val __obj = js.Dynamic.literal(configurationType = configurationType.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy)
    __obj.asInstanceOf[ListConfigurationsRequest]
  }
}

