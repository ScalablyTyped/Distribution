package typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDASHStreamingSessionURLOutput extends js.Object {
  /**
    * The URL (containing the session token) that a media player can use to retrieve the MPEG-DASH manifest.
    */
  var DASHStreamingSessionURL: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod.DASHStreamingSessionURL] = js.native
}

object GetDASHStreamingSessionURLOutput {
  @scala.inline
  def apply(DASHStreamingSessionURL: DASHStreamingSessionURL = null): GetDASHStreamingSessionURLOutput = {
    val __obj = js.Dynamic.literal()
    if (DASHStreamingSessionURL != null) __obj.updateDynamic("DASHStreamingSessionURL")(DASHStreamingSessionURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDASHStreamingSessionURLOutput]
  }
}

