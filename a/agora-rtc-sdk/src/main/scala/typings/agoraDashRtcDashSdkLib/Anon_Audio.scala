package typings
package agoraDashRtcDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Audio extends js.Object {
  var audio: js.Array[agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.OPUS]
  var video: js.Array[
    agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.VP8 | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.H264
  ]
}

object Anon_Audio {
  @scala.inline
  def apply(
    audio: js.Array[agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.OPUS],
    video: js.Array[
      agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.VP8 | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.H264
    ]
  ): Anon_Audio = {
    val __obj = js.Dynamic.literal(audio = audio, video = video)
  
    __obj.asInstanceOf[Anon_Audio]
  }
}

