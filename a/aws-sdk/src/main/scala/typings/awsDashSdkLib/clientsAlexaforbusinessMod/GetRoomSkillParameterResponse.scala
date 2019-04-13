package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRoomSkillParameterResponse extends js.Object {
  /**
    * The details of the room skill parameter requested. Required.
    */
  var RoomSkillParameter: js.UndefOr[RoomSkillParameter] = js.undefined
}

object GetRoomSkillParameterResponse {
  @scala.inline
  def apply(RoomSkillParameter: RoomSkillParameter = null): GetRoomSkillParameterResponse = {
    val __obj = js.Dynamic.literal()
    if (RoomSkillParameter != null) __obj.updateDynamic("RoomSkillParameter")(RoomSkillParameter)
    __obj.asInstanceOf[GetRoomSkillParameterResponse]
  }
}

