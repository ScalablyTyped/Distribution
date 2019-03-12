package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agora-rtc-sdk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AUDIO_SAMPLE_RATE_32000: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`32000` = js.native
  val AUDIO_SAMPLE_RATE_44100: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`44100` = js.native
  val AUDIO_SAMPLE_RATE_48000: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`48000` = js.native
  val REMOTE_VIDEO_STREAM_HIGH: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`0` = js.native
  val REMOTE_VIDEO_STREAM_LOW: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`1` = js.native
  val REMOTE_VIDEO_STREAM_MEDIUM: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`2` = js.native
  val VERSION: java.lang.String = js.native
  val VIDEO_CODEC_PROFILE_BASELINE: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`66` = js.native
  val VIDEO_CODEC_PROFILE_HIGH: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`100` = js.native
  val VIDEO_CODEC_PROFILE_MAIN: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibNumbers.`77` = js.native
  def checkSystemRequirements(): scala.Boolean = js.native
  def createClient(config: ClientConfig): Client = js.native
  def createStream(spec: StreamSpec): Stream = js.native
  def getDevices(callback: js.Function1[/* devices */ js.Array[_], scala.Unit]): scala.Unit = js.native
}

