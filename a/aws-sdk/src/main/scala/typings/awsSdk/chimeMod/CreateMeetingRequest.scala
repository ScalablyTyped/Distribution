package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMeetingRequest extends js.Object {
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
  /**
    * The configuration for resource targets to receive notifications when meeting and attendee events occur.
    */
  var NotificationsConfiguration: js.UndefOr[MeetingNotificationConfiguration] = js.native
  /**
    * The tag key-value pairs.
    */
  var Tags: js.UndefOr[MeetingTagList] = js.native
}

object CreateMeetingRequest {
  @scala.inline
  def apply(ClientRequestToken: ClientRequestToken): CreateMeetingRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeetingRequest]
  }
  @scala.inline
  implicit class CreateMeetingRequestOps[Self <: CreateMeetingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalMeetingId(value: ExternalMeetingIdType): Self = this.set("ExternalMeetingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalMeetingId: Self = this.set("ExternalMeetingId", js.undefined)
    @scala.inline
    def setMediaRegion(value: String): Self = this.set("MediaRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaRegion: Self = this.set("MediaRegion", js.undefined)
    @scala.inline
    def setMeetingHostId(value: ExternalUserIdType): Self = this.set("MeetingHostId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeetingHostId: Self = this.set("MeetingHostId", js.undefined)
    @scala.inline
    def setNotificationsConfiguration(value: MeetingNotificationConfiguration): Self = this.set("NotificationsConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationsConfiguration: Self = this.set("NotificationsConfiguration", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: MeetingTagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

