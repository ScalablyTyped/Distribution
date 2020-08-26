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
  @scala.inline
  implicit class GetRoomRequestOps[Self <: GetRoomRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoomId(value: NonEmptyString): Self = this.set("RoomId", value.asInstanceOf[js.Any])
  }
  
}

