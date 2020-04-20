package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Meeting extends js.Object {
  /**
    * The external meeting ID.
    */
  var ExternalMeetingId: js.UndefOr[ExternalMeetingIdType] = js.native
  /**
    * The media placement for the meeting.
    */
  var MediaPlacement: js.UndefOr[typings.awsSdk.chimeMod.MediaPlacement] = js.native
  /**
    * The Region in which to create the meeting. Available values: ap-northeast-1, ap-southeast-1, ap-southeast-2, ca-central-1, eu-central-1, eu-north-1, eu-west-1, eu-west-2, eu-west-3, sa-east-1, us-east-1, us-east-2, us-west-1, us-west-2.
    */
  var MediaRegion: js.UndefOr[String] = js.native
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: js.UndefOr[GuidString] = js.native
}

object Meeting {
  @scala.inline
  def apply(
    ExternalMeetingId: ExternalMeetingIdType = null,
    MediaPlacement: MediaPlacement = null,
    MediaRegion: String = null,
    MeetingId: GuidString = null
  ): Meeting = {
    val __obj = js.Dynamic.literal()
    if (ExternalMeetingId != null) __obj.updateDynamic("ExternalMeetingId")(ExternalMeetingId.asInstanceOf[js.Any])
    if (MediaPlacement != null) __obj.updateDynamic("MediaPlacement")(MediaPlacement.asInstanceOf[js.Any])
    if (MediaRegion != null) __obj.updateDynamic("MediaRegion")(MediaRegion.asInstanceOf[js.Any])
    if (MeetingId != null) __obj.updateDynamic("MeetingId")(MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meeting]
  }
}

