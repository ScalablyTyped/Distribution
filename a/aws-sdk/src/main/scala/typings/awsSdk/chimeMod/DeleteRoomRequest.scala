package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRoomRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The chat room ID.
    */
  var RoomId: NonEmptyString = js.native
}

object DeleteRoomRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, RoomId: NonEmptyString): DeleteRoomRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], RoomId = RoomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRoomRequest]
  }
}

