package typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHLSStreamingSessionURLOutput extends js.Object {
  /**
    * The URL (containing the session token) that a media player can use to retrieve the HLS master playlist.
    */
  var HLSStreamingSessionURL: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod.HLSStreamingSessionURL] = js.undefined
}

object GetHLSStreamingSessionURLOutput {
  @scala.inline
  def apply(HLSStreamingSessionURL: HLSStreamingSessionURL = null): GetHLSStreamingSessionURLOutput = {
    val __obj = js.Dynamic.literal()
    if (HLSStreamingSessionURL != null) __obj.updateDynamic("HLSStreamingSessionURL")(HLSStreamingSessionURL)
    __obj.asInstanceOf[GetHLSStreamingSessionURLOutput]
  }
}

