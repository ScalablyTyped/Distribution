package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MembershipItem extends js.Object {
  /**
    * The member ID.
    */
  var MemberId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The member role.
    */
  var Role: js.UndefOr[RoomMembershipRole] = js.native
}

object MembershipItem {
  @scala.inline
  def apply(MemberId: NonEmptyString = null, Role: RoomMembershipRole = null): MembershipItem = {
    val __obj = js.Dynamic.literal()
    if (MemberId != null) __obj.updateDynamic("MemberId")(MemberId.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembershipItem]
  }
}

