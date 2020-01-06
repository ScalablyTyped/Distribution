package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMeetingRequest extends js.Object {
  /**
    * The unique identifier for the client request. Use a different token for different meetings.
    */
  var ClientRequestToken: typings.awsDashSdk.clientsChimeMod.ClientRequestToken = js.native
  /**
    * The Region in which to create the meeting. Available values: us-east-1, us-west-2.
    */
  var MediaRegion: js.UndefOr[String] = js.native
  /**
    * Reserved.
    */
  var MeetingHostId: js.UndefOr[ExternalUserIdType] = js.native
  /**
    * The configuration for resource targets to receive notifications when meeting and attendee events occur.
    */
  var NotificationsConfiguration: js.UndefOr[MeetingNotificationConfiguration] = js.native
}

object CreateMeetingRequest {
  @scala.inline
  def apply(
    ClientRequestToken: ClientRequestToken,
    MediaRegion: String = null,
    MeetingHostId: ExternalUserIdType = null,
    NotificationsConfiguration: MeetingNotificationConfiguration = null
  ): CreateMeetingRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any])
    if (MediaRegion != null) __obj.updateDynamic("MediaRegion")(MediaRegion.asInstanceOf[js.Any])
    if (MeetingHostId != null) __obj.updateDynamic("MeetingHostId")(MeetingHostId.asInstanceOf[js.Any])
    if (NotificationsConfiguration != null) __obj.updateDynamic("NotificationsConfiguration")(NotificationsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeetingRequest]
  }
}

