package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoomRequest extends js.Object {
  /**
    * The updated description for the room.
    */
  var Description: js.UndefOr[RoomDescription] = js.native
  /**
    * The updated profile ARN for the room.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
  /**
    * The updated provider calendar ARN for the room.
    */
  var ProviderCalendarId: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.ProviderCalendarId] = js.native
  /**
    * The ARN of the room to update. 
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The updated name for the room.
    */
  var RoomName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.RoomName] = js.native
}

object UpdateRoomRequest {
  @scala.inline
  def apply(
    Description: RoomDescription = null,
    ProfileArn: Arn = null,
    ProviderCalendarId: ProviderCalendarId = null,
    RoomArn: Arn = null,
    RoomName: RoomName = null
  ): UpdateRoomRequest = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ProfileArn != null) __obj.updateDynamic("ProfileArn")(ProfileArn.asInstanceOf[js.Any])
    if (ProviderCalendarId != null) __obj.updateDynamic("ProviderCalendarId")(ProviderCalendarId.asInstanceOf[js.Any])
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn.asInstanceOf[js.Any])
    if (RoomName != null) __obj.updateDynamic("RoomName")(RoomName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoomRequest]
  }
}

