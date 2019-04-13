package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDiscoveredResourcesResponse extends js.Object {
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The details that identify a resource that is discovered by AWS Config, including the resource type, ID, and (if available) the custom resource name.
    */
  var resourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined
}

object ListDiscoveredResourcesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, resourceIdentifiers: ResourceIdentifierList = null): ListDiscoveredResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (resourceIdentifiers != null) __obj.updateDynamic("resourceIdentifiers")(resourceIdentifiers)
    __obj.asInstanceOf[ListDiscoveredResourcesResponse]
  }
}

