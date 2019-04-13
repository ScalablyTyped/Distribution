package typings
package awsDashSdkLib.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGroupMembershipResponse extends js.Object {
  /**
    * The group member.
    */
  var GroupMember: js.UndefOr[GroupMember] = js.undefined
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
  def apply(
    GroupMember: GroupMember = null,
    RequestId: String = null,
    Status: js.UndefOr[StatusCode] = js.undefined
  ): CreateGroupMembershipResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupMember != null) __obj.updateDynamic("GroupMember")(GroupMember)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[CreateGroupMembershipResponse]
  }
}

