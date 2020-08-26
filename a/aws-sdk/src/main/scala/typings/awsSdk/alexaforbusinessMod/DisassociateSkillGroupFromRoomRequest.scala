package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateSkillGroupFromRoomRequest extends js.Object {
  /**
    * The ARN of the room from which the skill group is to be disassociated. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the skill group to disassociate from a room. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
}

object DisassociateSkillGroupFromRoomRequest {
  @scala.inline
  def apply(): DisassociateSkillGroupFromRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateSkillGroupFromRoomRequest]
  }
  @scala.inline
  implicit class DisassociateSkillGroupFromRoomRequestOps[Self <: DisassociateSkillGroupFromRoomRequest] (val x: Self) extends AnyVal {
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
    def setSkillGroupArn(value: Arn): Self = this.set("SkillGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkillGroupArn: Self = this.set("SkillGroupArn", js.undefined)
  }
  
}

