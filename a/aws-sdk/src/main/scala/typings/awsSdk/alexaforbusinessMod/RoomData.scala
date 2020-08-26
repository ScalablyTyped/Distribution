package typings.awsSdk.alexaforbusinessMod

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
  var ProfileName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ProfileName] = js.native
  /**
    * The provider calendar ARN of a room.
    */
  var ProviderCalendarId: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ProviderCalendarId] = js.native
  /**
    * The ARN of a room.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The name of a room.
    */
  var RoomName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.RoomName] = js.native
}

object RoomData {
  @scala.inline
  def apply(): RoomData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomData]
  }
  @scala.inline
  implicit class RoomDataOps[Self <: RoomData] (val x: Self) extends AnyVal {
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
    def setDescription(value: RoomDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setProfileArn(value: Arn): Self = this.set("ProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileArn: Self = this.set("ProfileArn", js.undefined)
    @scala.inline
    def setProfileName(value: ProfileName): Self = this.set("ProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileName: Self = this.set("ProfileName", js.undefined)
    @scala.inline
    def setProviderCalendarId(value: ProviderCalendarId): Self = this.set("ProviderCalendarId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderCalendarId: Self = this.set("ProviderCalendarId", js.undefined)
    @scala.inline
    def setRoomArn(value: Arn): Self = this.set("RoomArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoomArn: Self = this.set("RoomArn", js.undefined)
    @scala.inline
    def setRoomName(value: RoomName): Self = this.set("RoomName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoomName: Self = this.set("RoomName", js.undefined)
  }
  
}

