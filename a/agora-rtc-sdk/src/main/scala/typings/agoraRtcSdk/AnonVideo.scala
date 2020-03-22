package typings.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVideo extends js.Object {
  /**
    * Marks whether to receive the audio data.
    *  - `true`: (Default) Receives the audio data.
    *  - `false`: Not receives the audio data.
    */
  var audio: js.UndefOr[Boolean] = js.undefined
  /**
    * Marks whether to receive the video data.
    *  - `true`: (Default) Receives the video data.
    *  - `false`: Not receives the video data.
    */
  var video: js.UndefOr[Boolean] = js.undefined
}

object AnonVideo {
  @scala.inline
  def apply(audio: js.UndefOr[Boolean] = js.undefined, video: js.UndefOr[Boolean] = js.undefined): AnonVideo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVideo]
  }
}

