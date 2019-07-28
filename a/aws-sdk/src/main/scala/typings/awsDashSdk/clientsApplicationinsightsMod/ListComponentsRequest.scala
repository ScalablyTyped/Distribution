package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListComponentsRequest extends js.Object {
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[MaxEntities] = js.undefined
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName
}

object ListComponentsRequest {
  @scala.inline
  def apply(
    ResourceGroupName: ResourceGroupName,
    MaxResults: js.UndefOr[MaxEntities] = js.undefined,
    NextToken: PaginationToken = null
  ): ListComponentsRequest = {
    val __obj = js.Dynamic.literal(ResourceGroupName = ResourceGroupName)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListComponentsRequest]
  }
}

