package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Room extends js.Object {
  /**
    * The description of a room.
    */
  var Description: js.UndefOr[RoomDescription] = js.undefined
  /**
    * The profile ARN of a room.
    */
  var ProfileArn: js.UndefOr[Arn] = js.undefined
  /**
    * The provider calendar ARN of a room.
    */
  var ProviderCalendarId: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.ProviderCalendarId] = js.undefined
  /**
    * The ARN of a room.
    */
  var RoomArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of a room.
    */
  var RoomName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.RoomName] = js.undefined
}

object Room {
  @scala.inline
  def apply(
    Description: RoomDescription = null,
    ProfileArn: Arn = null,
    ProviderCalendarId: ProviderCalendarId = null,
    RoomArn: Arn = null,
    RoomName: RoomName = null
  ): Room = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ProfileArn != null) __obj.updateDynamic("ProfileArn")(ProfileArn)
    if (ProviderCalendarId != null) __obj.updateDynamic("ProviderCalendarId")(ProviderCalendarId)
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn)
    if (RoomName != null) __obj.updateDynamic("RoomName")(RoomName)
    __obj.asInstanceOf[Room]
  }
}

