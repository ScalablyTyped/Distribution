package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoomRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The room name.
    */
  var Name: js.UndefOr[SensitiveString] = js.native
  /**
    * The room ID.
    */
  var RoomId: NonEmptyString = js.native
}

object UpdateRoomRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, RoomId: NonEmptyString, Name: SensitiveString = null): UpdateRoomRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], RoomId = RoomId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoomRequest]
  }
}

