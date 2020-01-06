package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRoomSkillParameterRequest extends js.Object {
  /**
    * The ARN of the room associated with the room skill parameter. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The updated room skill parameter. Required.
    */
  var RoomSkillParameter: typings.awsDashSdk.clientsAlexaforbusinessMod.RoomSkillParameter = js.native
  /**
    * The ARN of the skill associated with the room skill parameter. Required.
    */
  var SkillId: typings.awsDashSdk.clientsAlexaforbusinessMod.SkillId = js.native
}

object PutRoomSkillParameterRequest {
  @scala.inline
  def apply(RoomSkillParameter: RoomSkillParameter, SkillId: SkillId, RoomArn: Arn = null): PutRoomSkillParameterRequest = {
    val __obj = js.Dynamic.literal(RoomSkillParameter = RoomSkillParameter.asInstanceOf[js.Any], SkillId = SkillId.asInstanceOf[js.Any])
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRoomSkillParameterRequest]
  }
}

