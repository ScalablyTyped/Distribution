package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoCodecSettings extends js.Object {
  var FrameCaptureSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.FrameCaptureSettings] = js.undefined
  var H264Settings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.H264Settings] = js.undefined
}

object VideoCodecSettings {
  @scala.inline
  def apply(FrameCaptureSettings: FrameCaptureSettings = null, H264Settings: H264Settings = null): VideoCodecSettings = {
    val __obj = js.Dynamic.literal()
    if (FrameCaptureSettings != null) __obj.updateDynamic("FrameCaptureSettings")(FrameCaptureSettings)
    if (H264Settings != null) __obj.updateDynamic("H264Settings")(H264Settings)
    __obj.asInstanceOf[VideoCodecSettings]
  }
}

