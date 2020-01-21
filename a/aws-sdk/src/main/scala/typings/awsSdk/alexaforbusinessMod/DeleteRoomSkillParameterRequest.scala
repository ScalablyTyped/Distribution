package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRoomSkillParameterRequest extends js.Object {
  /**
    * The room skill parameter key for which to remove details.
    */
  var ParameterKey: RoomSkillParameterKey = js.native
  /**
    * The ARN of the room from which to remove the room skill parameter details.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The ID of the skill from which to remove the room skill parameter details.
    */
  var SkillId: typings.awsSdk.alexaforbusinessMod.SkillId = js.native
}

object DeleteRoomSkillParameterRequest {
  @scala.inline
  def apply(ParameterKey: RoomSkillParameterKey, SkillId: SkillId, RoomArn: Arn = null): DeleteRoomSkillParameterRequest = {
    val __obj = js.Dynamic.literal(ParameterKey = ParameterKey.asInstanceOf[js.Any], SkillId = SkillId.asInstanceOf[js.Any])
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRoomSkillParameterRequest]
  }
}

