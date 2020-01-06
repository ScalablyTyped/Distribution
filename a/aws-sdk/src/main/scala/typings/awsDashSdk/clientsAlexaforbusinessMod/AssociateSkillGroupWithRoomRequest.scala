package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateSkillGroupWithRoomRequest extends js.Object {
  /**
    * The ARN of the room with which to associate the skill group. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the skill group to associate with a room. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
}

object AssociateSkillGroupWithRoomRequest {
  @scala.inline
  def apply(RoomArn: Arn = null, SkillGroupArn: Arn = null): AssociateSkillGroupWithRoomRequest = {
    val __obj = js.Dynamic.literal()
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn.asInstanceOf[js.Any])
    if (SkillGroupArn != null) __obj.updateDynamic("SkillGroupArn")(SkillGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateSkillGroupWithRoomRequest]
  }
}

