package typings
package awsDashSdkLib.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceSharesRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The name of the resource share.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * The type of owner.
    */
  var resourceOwner: ResourceOwner
  /**
    * The Amazon Resource Names (ARN) of the resource shares.
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
  /**
    * The status of the resource share.
    */
  var resourceShareStatus: js.UndefOr[ResourceShareStatus] = js.undefined
  /**
    * One or more tag filters.
    */
  var tagFilters: js.UndefOr[TagFilters] = js.undefined
}

object GetResourceSharesRequest {
  @scala.inline
  def apply(
    resourceOwner: ResourceOwner,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    name: String = null,
    nextToken: String = null,
    resourceShareArns: ResourceShareArnList = null,
    resourceShareStatus: ResourceShareStatus = null,
    tagFilters: TagFilters = null
  ): GetResourceSharesRequest = {
    val __obj = js.Dynamic.literal(resourceOwner = resourceOwner.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (resourceShareArns != null) __obj.updateDynamic("resourceShareArns")(resourceShareArns)
    if (resourceShareStatus != null) __obj.updateDynamic("resourceShareStatus")(resourceShareStatus.asInstanceOf[js.Any])
    if (tagFilters != null) __obj.updateDynamic("tagFilters")(tagFilters)
    __obj.asInstanceOf[GetResourceSharesRequest]
  }
}

