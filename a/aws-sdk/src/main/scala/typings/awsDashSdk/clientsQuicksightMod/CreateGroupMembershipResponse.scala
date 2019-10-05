package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGroupMembershipResponse extends js.Object {
  /**
    * The group member.
    */
  var GroupMember: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.GroupMember] = js.undefined
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  /**
    * The http status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}

object CreateGroupMembershipResponse {
  @scala.inline
  def apply(GroupMember: GroupMember = null, RequestId: String = null, Status: Int | Double = null): CreateGroupMembershipResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupMember != null) __obj.updateDynamic("GroupMember")(GroupMember)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupMembershipResponse]
  }
}

