package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupMembershipResponse extends js.Object {
  /**
    * The group member.
    */
  var GroupMember: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.GroupMember] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object CreateGroupMembershipResponse {
  @scala.inline
  def apply(GroupMember: GroupMember = null, RequestId: String = null, Status: Int | scala.Double = null): CreateGroupMembershipResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupMember != null) __obj.updateDynamic("GroupMember")(GroupMember.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupMembershipResponse]
  }
}

