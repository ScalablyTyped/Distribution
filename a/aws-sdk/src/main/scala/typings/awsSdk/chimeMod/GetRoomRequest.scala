package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoomRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The room ID.
    */
  var RoomId: NonEmptyString = js.native
}

object GetRoomRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, RoomId: NonEmptyString): GetRoomRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], RoomId = RoomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoomRequest]
  }
}

