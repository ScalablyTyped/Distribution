package typings
package agoraDashRtcDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AudioVideo extends js.Object {
  /**
    * Marks whether to receive the audio data.
    *  - `true`: (Default) Receives the audio data.
    *  - `false`: Not receives the audio data.
    */
  var audio: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Marks whether to receive the video data.
    *  - `true`: (Default) Receives the video data.
    *  - `false`: Not receives the video data.
    */
  var video: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AudioVideo {
  @scala.inline
  def apply(audio: js.UndefOr[scala.Boolean] = js.undefined, video: js.UndefOr[scala.Boolean] = js.undefined): Anon_AudioVideo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio)
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video)
    __obj.asInstanceOf[Anon_AudioVideo]
  }
}

