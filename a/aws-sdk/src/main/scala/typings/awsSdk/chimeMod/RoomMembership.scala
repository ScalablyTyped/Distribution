package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomMembership extends js.Object {
  /**
    * The identifier of the user that invited the room member.
    */
  var InvitedBy: js.UndefOr[NonEmptyString] = js.native
  var Member: js.UndefOr[typings.awsSdk.chimeMod.Member] = js.native
  /**
    * The membership role.
    */
  var Role: js.UndefOr[RoomMembershipRole] = js.native
  /**
    * The room ID.
    */
  var RoomId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The room membership update timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
}

object RoomMembership {
  @scala.inline
  def apply(
    InvitedBy: NonEmptyString = null,
    Member: Member = null,
    Role: RoomMembershipRole = null,
    RoomId: NonEmptyString = null,
    UpdatedTimestamp: Iso8601Timestamp = null
  ): RoomMembership = {
    val __obj = js.Dynamic.literal()
    if (InvitedBy != null) __obj.updateDynamic("InvitedBy")(InvitedBy.asInstanceOf[js.Any])
    if (Member != null) __obj.updateDynamic("Member")(Member.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (RoomId != null) __obj.updateDynamic("RoomId")(RoomId.asInstanceOf[js.Any])
    if (UpdatedTimestamp != null) __obj.updateDynamic("UpdatedTimestamp")(UpdatedTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomMembership]
  }
}

