package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAggregateDiscoveredResourcesResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Returns a list of ResourceIdentifiers objects.
    */
  var ResourceIdentifiers: js.UndefOr[DiscoveredResourceIdentifierList] = js.undefined
}

object ListAggregateDiscoveredResourcesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ResourceIdentifiers: DiscoveredResourceIdentifierList = null): ListAggregateDiscoveredResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ResourceIdentifiers != null) __obj.updateDynamic("ResourceIdentifiers")(ResourceIdentifiers)
    __obj.asInstanceOf[ListAggregateDiscoveredResourcesResponse]
  }
}

