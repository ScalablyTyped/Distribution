package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoomSkillParameterResponse extends js.Object {
  /**
    * The details of the room skill parameter requested. Required.
    */
  var RoomSkillParameter: js.UndefOr[typings.awsSdk.alexaforbusinessMod.RoomSkillParameter] = js.native
}

object GetRoomSkillParameterResponse {
  @scala.inline
  def apply(RoomSkillParameter: RoomSkillParameter = null): GetRoomSkillParameterResponse = {
    val __obj = js.Dynamic.literal()
    if (RoomSkillParameter != null) __obj.updateDynamic("RoomSkillParameter")(RoomSkillParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoomSkillParameterResponse]
  }
}

