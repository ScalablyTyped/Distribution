package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Meeting extends js.Object {
  /**
    * The media placement for the meeting.
    */
  var MediaPlacement: js.UndefOr[typings.awsDashSdk.clientsChimeMod.MediaPlacement] = js.native
  /**
    * The Region in which to create the meeting. Available values: us-east-1, us-west-2.
    */
  var MediaRegion: js.UndefOr[String] = js.native
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: js.UndefOr[GuidString] = js.native
}

object Meeting {
  @scala.inline
  def apply(MediaPlacement: MediaPlacement = null, MediaRegion: String = null, MeetingId: GuidString = null): Meeting = {
    val __obj = js.Dynamic.literal()
    if (MediaPlacement != null) __obj.updateDynamic("MediaPlacement")(MediaPlacement.asInstanceOf[js.Any])
    if (MediaRegion != null) __obj.updateDynamic("MediaRegion")(MediaRegion.asInstanceOf[js.Any])
    if (MeetingId != null) __obj.updateDynamic("MeetingId")(MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meeting]
  }
}

