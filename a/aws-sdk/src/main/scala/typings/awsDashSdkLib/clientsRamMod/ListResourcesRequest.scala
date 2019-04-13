package typings
package awsDashSdkLib.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourcesRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * The principal.
    */
  var principal: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Names (ARN) of the resources.
    */
  var resourceArns: js.UndefOr[ResourceArnList] = js.undefined
  /**
    * The type of owner.
    */
  var resourceOwner: ResourceOwner
  /**
    * The Amazon Resource Names (ARN) of the resource shares.
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
  /**
    * The resource type.
    */
  var resourceType: js.UndefOr[String] = js.undefined
}

object ListResourcesRequest {
  @scala.inline
  def apply(
    resourceOwner: ResourceOwner,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: String = null,
    principal: String = null,
    resourceArns: ResourceArnList = null,
    resourceShareArns: ResourceShareArnList = null,
    resourceType: String = null
  ): ListResourcesRequest = {
    val __obj = js.Dynamic.literal(resourceOwner = resourceOwner.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (principal != null) __obj.updateDynamic("principal")(principal)
    if (resourceArns != null) __obj.updateDynamic("resourceArns")(resourceArns)
    if (resourceShareArns != null) __obj.updateDynamic("resourceShareArns")(resourceShareArns)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    __obj.asInstanceOf[ListResourcesRequest]
  }
}

