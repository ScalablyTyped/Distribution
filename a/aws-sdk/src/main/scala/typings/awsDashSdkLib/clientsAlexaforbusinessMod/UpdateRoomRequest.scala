package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRoomRequest extends js.Object {
  /**
    * The updated description for the room.
    */
  var Description: js.UndefOr[RoomDescription] = js.undefined
  /**
    * The updated profile ARN for the room.
    */
  var ProfileArn: js.UndefOr[Arn] = js.undefined
  /**
    * The updated provider calendar ARN for the room.
    */
  var ProviderCalendarId: js.UndefOr[ProviderCalendarId] = js.undefined
  /**
    * The ARN of the room to update. 
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  /**
    * The updated name for the room.
    */
  var RoomName: js.UndefOr[RoomName] = js.undefined
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
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ProfileArn != null) __obj.updateDynamic("ProfileArn")(ProfileArn)
    if (ProviderCalendarId != null) __obj.updateDynamic("ProviderCalendarId")(ProviderCalendarId)
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn)
    if (RoomName != null) __obj.updateDynamic("RoomName")(RoomName)
    __obj.asInstanceOf[UpdateRoomRequest]
  }
}

