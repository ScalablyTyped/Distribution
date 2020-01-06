package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveRoomResponse extends js.Object {
  /**
    * The ARN of the room from which the skill request was invoked.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the room from which the skill request was invoked.
    */
  var RoomName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.RoomName] = js.native
  /**
    * Response to get the room profile request. Required.
    */
  var RoomSkillParameters: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.RoomSkillParameters] = js.native
}

object ResolveRoomResponse {
  @scala.inline
  def apply(RoomArn: Arn = null, RoomName: RoomName = null, RoomSkillParameters: RoomSkillParameters = null): ResolveRoomResponse = {
    val __obj = js.Dynamic.literal()
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn.asInstanceOf[js.Any])
    if (RoomName != null) __obj.updateDynamic("RoomName")(RoomName.asInstanceOf[js.Any])
    if (RoomSkillParameters != null) __obj.updateDynamic("RoomSkillParameters")(RoomSkillParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveRoomResponse]
  }
}

