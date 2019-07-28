package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceShareInvitationsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the invitations.
    */
  var resourceShareInvitations: js.UndefOr[ResourceShareInvitationList] = js.undefined
}

object GetResourceShareInvitationsResponse {
  @scala.inline
  def apply(nextToken: String = null, resourceShareInvitations: ResourceShareInvitationList = null): GetResourceShareInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (resourceShareInvitations != null) __obj.updateDynamic("resourceShareInvitations")(resourceShareInvitations)
    __obj.asInstanceOf[GetResourceShareInvitationsResponse]
  }
}

