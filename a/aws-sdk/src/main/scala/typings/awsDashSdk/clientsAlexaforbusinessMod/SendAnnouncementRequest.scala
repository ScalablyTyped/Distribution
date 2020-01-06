package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAnnouncementRequest extends js.Object {
  /**
    * The unique, user-specified identifier for the request that ensures idempotency.
    */
  var ClientRequestToken: typings.awsDashSdk.clientsAlexaforbusinessMod.ClientRequestToken = js.native
  /**
    * The announcement content. This can contain only one of the three possible announcement types (text, SSML or audio).
    */
  var Content: typings.awsDashSdk.clientsAlexaforbusinessMod.Content = js.native
  /**
    * The filters to use to send an announcement to a specified list of rooms. The supported filter keys are RoomName, ProfileName, RoomArn, and ProfileArn. To send to all rooms, specify an empty RoomFilters list.
    */
  var RoomFilters: FilterList = js.native
  /**
    * The time to live for an announcement. Default is 300. If delivery doesn't occur within this time, the announcement is not delivered.
    */
  var TimeToLiveInSeconds: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.TimeToLiveInSeconds] = js.native
}

object SendAnnouncementRequest {
  @scala.inline
  def apply(
    ClientRequestToken: ClientRequestToken,
    Content: Content,
    RoomFilters: FilterList,
    TimeToLiveInSeconds: Int | Double = null
  ): SendAnnouncementRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], RoomFilters = RoomFilters.asInstanceOf[js.Any])
    if (TimeToLiveInSeconds != null) __obj.updateDynamic("TimeToLiveInSeconds")(TimeToLiveInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAnnouncementRequest]
  }
}

