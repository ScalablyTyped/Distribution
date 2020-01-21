package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRoomRequest extends js.Object {
  /**
    * A unique, user-specified identifier for this request that ensures idempotency. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.native
  /**
    * The description for the room.
    */
  var Description: js.UndefOr[RoomDescription] = js.native
  /**
    * The profile ARN for the room.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
  /**
    * The calendar ARN for the room.
    */
  var ProviderCalendarId: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ProviderCalendarId] = js.native
  /**
    * The name for the room.
    */
  var RoomName: typings.awsSdk.alexaforbusinessMod.RoomName = js.native
  /**
    * The tags for the room.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateRoomRequest {
  @scala.inline
  def apply(
    RoomName: RoomName,
    ClientRequestToken: ClientRequestToken = null,
    Description: RoomDescription = null,
    ProfileArn: Arn = null,
    ProviderCalendarId: ProviderCalendarId = null,
    Tags: TagList = null
  ): CreateRoomRequest = {
    val __obj = js.Dynamic.literal(RoomName = RoomName.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ProfileArn != null) __obj.updateDynamic("ProfileArn")(ProfileArn.asInstanceOf[js.Any])
    if (ProviderCalendarId != null) __obj.updateDynamic("ProviderCalendarId")(ProviderCalendarId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoomRequest]
  }
}

