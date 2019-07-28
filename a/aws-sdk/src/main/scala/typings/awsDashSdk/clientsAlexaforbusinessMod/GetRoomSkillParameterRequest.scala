package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRoomSkillParameterRequest extends js.Object {
  /**
    * The room skill parameter key for which to get details. Required.
    */
  var ParameterKey: RoomSkillParameterKey
  /**
    * The ARN of the room from which to get the room skill parameter details. 
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  /**
    * The ARN of the skill from which to get the room skill parameter details. Required.
    */
  var SkillId: typings.awsDashSdk.clientsAlexaforbusinessMod.SkillId
}

object GetRoomSkillParameterRequest {
  @scala.inline
  def apply(ParameterKey: RoomSkillParameterKey, SkillId: SkillId, RoomArn: Arn = null): GetRoomSkillParameterRequest = {
    val __obj = js.Dynamic.literal(ParameterKey = ParameterKey, SkillId = SkillId)
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn)
    __obj.asInstanceOf[GetRoomSkillParameterRequest]
  }
}

