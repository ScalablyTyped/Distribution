package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRoomMembershipRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The Amazon Chime member ID (user ID or bot ID).
    */
  var MemberId: NonEmptyString = js.native
  /**
    * The role of the member.
    */
  var Role: js.UndefOr[RoomMembershipRole] = js.native
  /**
    * The room ID.
    */
  var RoomId: NonEmptyString = js.native
}

object CreateRoomMembershipRequest {
  @scala.inline
  def apply(
    AccountId: NonEmptyString,
    MemberId: NonEmptyString,
    RoomId: NonEmptyString,
    Role: RoomMembershipRole = null
  ): CreateRoomMembershipRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], RoomId = RoomId.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoomMembershipRequest]
  }
}

