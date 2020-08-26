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
    * The profile ARN for the room. This is required.
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
  def apply(RoomName: RoomName): CreateRoomRequest = {
    val __obj = js.Dynamic.literal(RoomName = RoomName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoomRequest]
  }
  @scala.inline
  implicit class CreateRoomRequestOps[Self <: CreateRoomRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoomName(value: RoomName): Self = this.set("RoomName", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    @scala.inline
    def setDescription(value: RoomDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setProfileArn(value: Arn): Self = this.set("ProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileArn: Self = this.set("ProfileArn", js.undefined)
    @scala.inline
    def setProviderCalendarId(value: ProviderCalendarId): Self = this.set("ProviderCalendarId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderCalendarId: Self = this.set("ProviderCalendarId", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

