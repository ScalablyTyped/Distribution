package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroupMembersRequest extends js.Object {
  /**
    * The identifier for the group to which the members (users or groups) are associated.
    */
  var GroupId: WorkMailIdentifier = js.native
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.MaxResults] = js.native
  /**
    *  The token to use to retrieve the next page of results. The first call does not contain any tokens.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.NextToken] = js.native
  /**
    * The identifier for the organization under which the group exists.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId = js.native
}

object ListGroupMembersRequest {
  @scala.inline
  def apply(
    GroupId: WorkMailIdentifier,
    OrganizationId: OrganizationId,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListGroupMembersRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupMembersRequest]
  }
}

