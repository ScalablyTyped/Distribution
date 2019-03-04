package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamSpec extends js.Object {
  var attributes: js.UndefOr[agoraDashRtcDashSdkLib.Anon_MaxFrameRate] = js.undefined
  var audio: scala.Boolean
  var audioProcessing: js.UndefOr[agoraDashRtcDashSdkLib.Anon_AGC] = js.undefined
  var cameraId: js.UndefOr[java.lang.String] = js.undefined
  var extensionid: js.UndefOr[java.lang.String] = js.undefined
  var mediaSource: js.UndefOr[
    agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.screen | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.application | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.window
  ] = js.undefined
  var microphoneId: js.UndefOr[java.lang.String] = js.undefined
  var mirror: js.UndefOr[scala.Boolean] = js.undefined
  var screen: scala.Boolean
  var streamID: scala.Double
  var video: scala.Boolean
}

object StreamSpec {
  @scala.inline
  def apply(
    audio: scala.Boolean,
    screen: scala.Boolean,
    streamID: scala.Double,
    video: scala.Boolean,
    attributes: agoraDashRtcDashSdkLib.Anon_MaxFrameRate = null,
    audioProcessing: agoraDashRtcDashSdkLib.Anon_AGC = null,
    cameraId: java.lang.String = null,
    extensionid: java.lang.String = null,
    mediaSource: agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.screen | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.application | agoraDashRtcDashSdkLib.agoraDashRtcDashSdkLibStrings.window = null,
    microphoneId: java.lang.String = null,
    mirror: js.UndefOr[scala.Boolean] = js.undefined
  ): StreamSpec = {
    val __obj = js.Dynamic.literal(audio = audio, screen = screen, streamID = streamID, video = video)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (audioProcessing != null) __obj.updateDynamic("audioProcessing")(audioProcessing)
    if (cameraId != null) __obj.updateDynamic("cameraId")(cameraId)
    if (extensionid != null) __obj.updateDynamic("extensionid")(extensionid)
    if (mediaSource != null) __obj.updateDynamic("mediaSource")(mediaSource.asInstanceOf[js.Any])
    if (microphoneId != null) __obj.updateDynamic("microphoneId")(microphoneId)
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror)
    __obj.asInstanceOf[StreamSpec]
  }
}

