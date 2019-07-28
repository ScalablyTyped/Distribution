package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateSkillGroupFromRoomRequest extends js.Object {
  /**
    * The ARN of the room from which the skill group is to be disassociated. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  /**
    * The ARN of the skill group to disassociate from a room. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
}

object DisassociateSkillGroupFromRoomRequest {
  @scala.inline
  def apply(RoomArn: Arn = null, SkillGroupArn: Arn = null): DisassociateSkillGroupFromRoomRequest = {
    val __obj = js.Dynamic.literal()
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn)
    if (SkillGroupArn != null) __obj.updateDynamic("SkillGroupArn")(SkillGroupArn)
    __obj.asInstanceOf[DisassociateSkillGroupFromRoomRequest]
  }
}

