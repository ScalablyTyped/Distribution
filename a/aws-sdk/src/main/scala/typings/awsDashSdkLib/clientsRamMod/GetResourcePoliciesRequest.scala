package typings
package awsDashSdkLib.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourcePoliciesRequest extends js.Object {
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
  var resourceArns: ResourceArnList
}

object GetResourcePoliciesRequest {
  @scala.inline
  def apply(
    resourceArns: ResourceArnList,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: String = null,
    principal: String = null
  ): GetResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal(resourceArns = resourceArns)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (principal != null) __obj.updateDynamic("principal")(principal)
    __obj.asInstanceOf[GetResourcePoliciesRequest]
  }
}

