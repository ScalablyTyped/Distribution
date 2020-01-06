package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomData extends js.Object {
  /**
    * The description of a room.
    */
  var Description: js.UndefOr[RoomDescription] = js.native
  /**
    * The profile ARN of a room.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
  /**
    * The profile name of a room.
    */
  var ProfileName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.ProfileName] = js.native
  /**
    * The provider calendar ARN of a room.
    */
  var ProviderCalendarId: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.ProviderCalendarId] = js.native
  /**
    * The ARN of a room.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The name of a room.
    */
  var RoomName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.RoomName] = js.native
}

object RoomData {
  @scala.inline
  def apply(
    Description: RoomDescription = null,
    ProfileArn: Arn = null,
    ProfileName: ProfileName = null,
    ProviderCalendarId: ProviderCalendarId = null,
    RoomArn: Arn = null,
    RoomName: RoomName = null
  ): RoomData = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ProfileArn != null) __obj.updateDynamic("ProfileArn")(ProfileArn.asInstanceOf[js.Any])
    if (ProfileName != null) __obj.updateDynamic("ProfileName")(ProfileName.asInstanceOf[js.Any])
    if (ProviderCalendarId != null) __obj.updateDynamic("ProviderCalendarId")(ProviderCalendarId.asInstanceOf[js.Any])
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn.asInstanceOf[js.Any])
    if (RoomName != null) __obj.updateDynamic("RoomName")(RoomName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomData]
  }
}

