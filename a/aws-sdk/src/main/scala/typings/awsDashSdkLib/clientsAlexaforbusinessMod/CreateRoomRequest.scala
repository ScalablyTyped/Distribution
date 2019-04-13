package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRoomRequest extends js.Object {
  /**
    * A unique, user-specified identifier for this request that ensures idempotency. 
    */
  var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The description for the room.
    */
  var Description: js.UndefOr[RoomDescription] = js.undefined
  /**
    * The profile ARN for the room.
    */
  var ProfileArn: js.UndefOr[Arn] = js.undefined
  /**
    * The calendar ARN for the room.
    */
  var ProviderCalendarId: js.UndefOr[ProviderCalendarId] = js.undefined
  /**
    * The name for the room.
    */
  var RoomName: awsDashSdkLib.clientsAlexaforbusinessMod.RoomName
  /**
    * The tags for the room.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
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
    val __obj = js.Dynamic.literal(RoomName = RoomName)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ProfileArn != null) __obj.updateDynamic("ProfileArn")(ProfileArn)
    if (ProviderCalendarId != null) __obj.updateDynamic("ProviderCalendarId")(ProviderCalendarId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateRoomRequest]
  }
}

