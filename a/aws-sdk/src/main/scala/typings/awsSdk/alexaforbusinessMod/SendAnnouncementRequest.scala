package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAnnouncementRequest extends js.Object {
  /**
    * The unique, user-specified identifier for the request that ensures idempotency.
    */
  var ClientRequestToken: typings.awsSdk.alexaforbusinessMod.ClientRequestToken = js.native
  /**
    * The announcement content. This can contain only one of the three possible announcement types (text, SSML or audio).
    */
  var Content: typings.awsSdk.alexaforbusinessMod.Content = js.native
  /**
    * The filters to use to send an announcement to a specified list of rooms. The supported filter keys are RoomName, ProfileName, RoomArn, and ProfileArn. To send to all rooms, specify an empty RoomFilters list.
    */
  var RoomFilters: FilterList = js.native
  /**
    * The time to live for an announcement. Default is 300. If delivery doesn't occur within this time, the announcement is not delivered.
    */
  var TimeToLiveInSeconds: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TimeToLiveInSeconds] = js.native
}

object SendAnnouncementRequest {
  @scala.inline
  def apply(ClientRequestToken: ClientRequestToken, Content: Content, RoomFilters: FilterList): SendAnnouncementRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], RoomFilters = RoomFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAnnouncementRequest]
  }
  @scala.inline
  implicit class SendAnnouncementRequestOps[Self <: SendAnnouncementRequest] (val x: Self) extends AnyVal {
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
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: Content): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoomFiltersVarargs(value: Filter*): Self = this.set("RoomFilters", js.Array(value :_*))
    @scala.inline
    def setRoomFilters(value: FilterList): Self = this.set("RoomFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeToLiveInSeconds(value: TimeToLiveInSeconds): Self = this.set("TimeToLiveInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeToLiveInSeconds: Self = this.set("TimeToLiveInSeconds", js.undefined)
  }
  
}

