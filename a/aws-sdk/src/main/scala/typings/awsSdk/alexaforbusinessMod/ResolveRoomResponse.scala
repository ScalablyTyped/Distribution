package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveRoomResponse extends js.Object {
  /**
    * The ARN of the room from which the skill request was invoked.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the room from which the skill request was invoked.
    */
  var RoomName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.RoomName] = js.native
  /**
    * Response to get the room profile request. Required.
    */
  var RoomSkillParameters: js.UndefOr[typings.awsSdk.alexaforbusinessMod.RoomSkillParameters] = js.native
}

object ResolveRoomResponse {
  @scala.inline
  def apply(): ResolveRoomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveRoomResponse]
  }
  @scala.inline
  implicit class ResolveRoomResponseOps[Self <: ResolveRoomResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoomArn(value: Arn): Self = this.set("RoomArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoomArn: Self = this.set("RoomArn", js.undefined)
    @scala.inline
    def setRoomName(value: RoomName): Self = this.set("RoomName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoomName: Self = this.set("RoomName", js.undefined)
    @scala.inline
    def setRoomSkillParametersVarargs(value: RoomSkillParameter*): Self = this.set("RoomSkillParameters", js.Array(value :_*))
    @scala.inline
    def setRoomSkillParameters(value: RoomSkillParameters): Self = this.set("RoomSkillParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoomSkillParameters: Self = this.set("RoomSkillParameters", js.undefined)
  }
  
}

