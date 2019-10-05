package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceShareInvitationsRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Names (ARN) of the resource shares.
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
  /**
    * The Amazon Resource Names (ARN) of the invitations.
    */
  var resourceShareInvitationArns: js.UndefOr[ResourceShareInvitationArnList] = js.undefined
}

object GetResourceShareInvitationsRequest {
  @scala.inline
  def apply(
    maxResults: Int | Double = null,
    nextToken: String = null,
    resourceShareArns: ResourceShareArnList = null,
    resourceShareInvitationArns: ResourceShareInvitationArnList = null
  ): GetResourceShareInvitationsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (resourceShareArns != null) __obj.updateDynamic("resourceShareArns")(resourceShareArns)
    if (resourceShareInvitationArns != null) __obj.updateDynamic("resourceShareInvitationArns")(resourceShareInvitationArns)
    __obj.asInstanceOf[GetResourceShareInvitationsRequest]
  }
}

