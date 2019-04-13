package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveRoomResponse extends js.Object {
  /**
    * The ARN of the room from which the skill request was invoked.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the room from which the skill request was invoked.
    */
  var RoomName: js.UndefOr[RoomName] = js.undefined
  /**
    * Response to get the room profile request. Required.
    */
  var RoomSkillParameters: js.UndefOr[RoomSkillParameters] = js.undefined
}

object ResolveRoomResponse {
  @scala.inline
  def apply(RoomArn: Arn = null, RoomName: RoomName = null, RoomSkillParameters: RoomSkillParameters = null): ResolveRoomResponse = {
    val __obj = js.Dynamic.literal()
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn)
    if (RoomName != null) __obj.updateDynamic("RoomName")(RoomName)
    if (RoomSkillParameters != null) __obj.updateDynamic("RoomSkillParameters")(RoomSkillParameters)
    __obj.asInstanceOf[ResolveRoomResponse]
  }
}

