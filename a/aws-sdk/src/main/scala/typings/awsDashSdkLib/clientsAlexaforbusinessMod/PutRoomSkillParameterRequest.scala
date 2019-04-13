package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRoomSkillParameterRequest extends js.Object {
  /**
    * The ARN of the room associated with the room skill parameter. Required.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  /**
    * The updated room skill parameter. Required.
    */
  var RoomSkillParameter: awsDashSdkLib.clientsAlexaforbusinessMod.RoomSkillParameter
  /**
    * The ARN of the skill associated with the room skill parameter. Required.
    */
  var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.SkillId
}

object PutRoomSkillParameterRequest {
  @scala.inline
  def apply(RoomSkillParameter: RoomSkillParameter, SkillId: SkillId, RoomArn: Arn = null): PutRoomSkillParameterRequest = {
    val __obj = js.Dynamic.literal(RoomSkillParameter = RoomSkillParameter, SkillId = SkillId)
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn)
    __obj.asInstanceOf[PutRoomSkillParameterRequest]
  }
}

