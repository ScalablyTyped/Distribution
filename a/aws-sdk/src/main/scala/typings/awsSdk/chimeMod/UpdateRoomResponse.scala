package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoomResponse extends js.Object {
  /**
    * The room details.
    */
  var Room: js.UndefOr[typings.awsSdk.chimeMod.Room] = js.native
}

object UpdateRoomResponse {
  @scala.inline
  def apply(): UpdateRoomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoomResponse]
  }
  @scala.inline
  implicit class UpdateRoomResponseOps[Self <: UpdateRoomResponse] (val x: Self) extends AnyVal {
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
    def setRoom(value: Room): Self = this.set("Room", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoom: Self = this.set("Room", js.undefined)
  }
  
}

