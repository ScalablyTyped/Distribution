package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendAnnouncementRequest extends js.Object {
  /**
    * The unique, user-specified identifier for the request that ensures idempotency.
    */
  var ClientRequestToken: awsDashSdkLib.clientsAlexaforbusinessMod.ClientRequestToken
  /**
    * The announcement content. This can contain only one of the three possible announcement types (text, SSML or audio).
    */
  var Content: awsDashSdkLib.clientsAlexaforbusinessMod.Content
  /**
    * The filters to use to send an announcement to a specified list of rooms. The supported filter keys are RoomName, ProfileName, RoomArn, and ProfileArn. To send to all rooms, specify an empty RoomFilters list.
    */
  var RoomFilters: FilterList
  /**
    * The time to live for an announcement. If delivery doesn't occur within this time, the announcement will not be delivered.
    */
  var TimeToLiveInSeconds: js.UndefOr[TimeToLiveInSeconds] = js.undefined
}

object SendAnnouncementRequest {
  @scala.inline
  def apply(
    ClientRequestToken: ClientRequestToken,
    Content: Content,
    RoomFilters: FilterList,
    TimeToLiveInSeconds: js.UndefOr[TimeToLiveInSeconds] = js.undefined
  ): SendAnnouncementRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken, Content = Content, RoomFilters = RoomFilters)
    if (!js.isUndefined(TimeToLiveInSeconds)) __obj.updateDynamic("TimeToLiveInSeconds")(TimeToLiveInSeconds)
    __obj.asInstanceOf[SendAnnouncementRequest]
  }
}

