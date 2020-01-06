package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcePoliciesRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The principal.
    */
  var principal: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Names (ARN) of the resources.
    */
  var resourceArns: ResourceArnList = js.native
}

object GetResourcePoliciesRequest {
  @scala.inline
  def apply(
    resourceArns: ResourceArnList,
    maxResults: Int | Double = null,
    nextToken: String = null,
    principal: String = null
  ): GetResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal(resourceArns = resourceArns.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (principal != null) __obj.updateDynamic("principal")(principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePoliciesRequest]
  }
}

