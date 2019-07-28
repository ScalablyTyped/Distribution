package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupMembersRequest extends js.Object {
  /**
    * The identifier for the group to which the members (users or groups) are associated.
    */
  var GroupId: WorkMailIdentifier
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.MaxResults] = js.undefined
  /**
    *  The token to use to retrieve the next page of results. The first call does not contain any tokens.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.NextToken] = js.undefined
  /**
    * The identifier for the organization under which the group exists.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
}

object ListGroupMembersRequest {
  @scala.inline
  def apply(
    GroupId: WorkMailIdentifier,
    OrganizationId: OrganizationId,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListGroupMembersRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId, OrganizationId = OrganizationId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListGroupMembersRequest]
  }
}

