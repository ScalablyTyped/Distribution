package typings.agoraDashRtcDashSdk

import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.H264
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.OPUS
import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkStrings.VP8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Audio extends js.Object {
  var audio: js.Array[OPUS]
  var video: js.Array[VP8 | H264]
}

object Anon_Audio {
  @scala.inline
  def apply(audio: js.Array[OPUS], video: js.Array[VP8 | H264]): Anon_Audio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Audio]
  }
}

