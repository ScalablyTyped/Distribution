package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateSkillGroupWithRoomRequest extends js.Object {
  /**
    * The ARN of the room with which to associate the skill group. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  /**
    * The ARN of the skill group to associate with a room. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
}

object AssociateSkillGroupWithRoomRequest {
  @scala.inline
  def apply(RoomArn: Arn = null, SkillGroupArn: Arn = null): AssociateSkillGroupWithRoomRequest = {
    val __obj = js.Dynamic.literal()
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn)
    if (SkillGroupArn != null) __obj.updateDynamic("SkillGroupArn")(SkillGroupArn)
    __obj.asInstanceOf[AssociateSkillGroupWithRoomRequest]
  }
}

