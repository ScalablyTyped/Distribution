package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRoomMembershipRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The member ID (user ID or bot ID).
    */
  var MemberId: NonEmptyString = js.native
  /**
    * The room ID.
    */
  var RoomId: NonEmptyString = js.native
}

object DeleteRoomMembershipRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, MemberId: NonEmptyString, RoomId: NonEmptyString): DeleteRoomMembershipRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], RoomId = RoomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRoomMembershipRequest]
  }
}

