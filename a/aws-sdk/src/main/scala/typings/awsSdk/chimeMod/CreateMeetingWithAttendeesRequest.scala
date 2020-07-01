package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMeetingWithAttendeesRequest extends js.Object {
  /**
    * The request containing the attendees to create.
    */
  var Attendees: js.UndefOr[CreateMeetingWithAttendeesRequestItemList] = js.native
  /**
    * The unique identifier for the client request. Use a different token for different meetings.
    */
  var ClientRequestToken: typings.awsSdk.chimeMod.ClientRequestToken = js.native
  /**
    * The external meeting ID.
    */
  var ExternalMeetingId: js.UndefOr[ExternalMeetingIdType] = js.native
  /**
    * The Region in which to create the meeting. Default: us-east-1. Available values: ap-northeast-1, ap-southeast-1, ap-southeast-2, ca-central-1, eu-central-1, eu-north-1, eu-west-1, eu-west-2, eu-west-3, sa-east-1, us-east-1, us-east-2, us-west-1, us-west-2.
    */
  var MediaRegion: js.UndefOr[String] = js.native
  /**
    * Reserved.
    */
  var MeetingHostId: js.UndefOr[ExternalUserIdType] = js.native
  var NotificationsConfiguration: js.UndefOr[MeetingNotificationConfiguration] = js.native
  /**
    * The tag key-value pairs.
    */
  var Tags: js.UndefOr[MeetingTagList] = js.native
}

object CreateMeetingWithAttendeesRequest {
  @scala.inline
  def apply(
    ClientRequestToken: ClientRequestToken,
    Attendees: CreateMeetingWithAttendeesRequestItemList = null,
    ExternalMeetingId: ExternalMeetingIdType = null,
    MediaRegion: String = null,
    MeetingHostId: ExternalUserIdType = null,
    NotificationsConfiguration: MeetingNotificationConfiguration = null,
    Tags: MeetingTagList = null
  ): CreateMeetingWithAttendeesRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any])
    if (Attendees != null) __obj.updateDynamic("Attendees")(Attendees.asInstanceOf[js.Any])
    if (ExternalMeetingId != null) __obj.updateDynamic("ExternalMeetingId")(ExternalMeetingId.asInstanceOf[js.Any])
    if (MediaRegion != null) __obj.updateDynamic("MediaRegion")(MediaRegion.asInstanceOf[js.Any])
    if (MeetingHostId != null) __obj.updateDynamic("MeetingHostId")(MeetingHostId.asInstanceOf[js.Any])
    if (NotificationsConfiguration != null) __obj.updateDynamic("NotificationsConfiguration")(NotificationsConfiguration.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeetingWithAttendeesRequest]
  }
}

