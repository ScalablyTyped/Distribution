package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDiscoveredResourcesRequest extends js.Object {
  /**
    * Specifies whether AWS Config includes deleted resources in the results. By default, deleted resources are not included.
    */
  var includeDeletedResources: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of resource identifiers returned on each page. The default is 100. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var limit: js.UndefOr[Limit] = js.undefined
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The IDs of only those resources that you want AWS Config to list in the response. If you do not specify this parameter, AWS Config lists all resources of the specified type that it has discovered.
    */
  var resourceIds: js.UndefOr[ResourceIdList] = js.undefined
  /**
    * The custom name of only those resources that you want AWS Config to list in the response. If you do not specify this parameter, AWS Config lists all resources of the specified type that it has discovered.
    */
  var resourceName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The type of resources that you want AWS Config to list in the response.
    */
  var resourceType: ResourceType
}

object ListDiscoveredResourcesRequest {
  @scala.inline
  def apply(
    resourceType: ResourceType,
    includeDeletedResources: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[Limit] = js.undefined,
    nextToken: NextToken = null,
    resourceIds: ResourceIdList = null,
    resourceName: ResourceName = null
  ): ListDiscoveredResourcesRequest = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDeletedResources)) __obj.updateDynamic("includeDeletedResources")(includeDeletedResources)
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (resourceIds != null) __obj.updateDynamic("resourceIds")(resourceIds)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    __obj.asInstanceOf[ListDiscoveredResourcesRequest]
  }
}

