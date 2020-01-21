package typings.agoraRtcSdk

import typings.agoraRtcSdk.agoraRtcSdkStrings.H264
import typings.agoraRtcSdk.agoraRtcSdkStrings.OPUS
import typings.agoraRtcSdk.agoraRtcSdkStrings.VP8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAudio extends js.Object {
  var audio: js.Array[OPUS]
  var video: js.Array[VP8 | H264]
}

object AnonAudio {
  @scala.inline
  def apply(audio: js.Array[OPUS], video: js.Array[VP8 | H264]): AnonAudio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAudio]
  }
}

