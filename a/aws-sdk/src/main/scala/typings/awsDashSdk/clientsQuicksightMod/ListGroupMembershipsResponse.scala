package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroupMembershipsResponse extends js.Object {
  /**
    * The list of the members of the group.
    */
  var GroupMemberList: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.GroupMemberList] = js.native
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object ListGroupMembershipsResponse {
  @scala.inline
  def apply(
    GroupMemberList: GroupMemberList = null,
    NextToken: String = null,
    RequestId: String = null,
    Status: Int | scala.Double = null
  ): ListGroupMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupMemberList != null) __obj.updateDynamic("GroupMemberList")(GroupMemberList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupMembershipsResponse]
  }
}

