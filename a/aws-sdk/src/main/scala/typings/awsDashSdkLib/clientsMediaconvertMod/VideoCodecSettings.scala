package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoCodecSettings extends js.Object {
  /**
    * Specifies the video codec. This must be equal to one of the enum values defined by the object  VideoCodec.
    */
  var Codec: js.UndefOr[VideoCodec] = js.undefined
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value FRAME_CAPTURE.
    */
  var FrameCaptureSettings: js.UndefOr[FrameCaptureSettings] = js.undefined
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264.
    */
  var H264Settings: js.UndefOr[H264Settings] = js.undefined
  /**
    * Settings for H265 codec
    */
  var H265Settings: js.UndefOr[H265Settings] = js.undefined
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value MPEG2.
    */
  var Mpeg2Settings: js.UndefOr[Mpeg2Settings] = js.undefined
  /**
    * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value PRORES.
    */
  var ProresSettings: js.UndefOr[ProresSettings] = js.undefined
}

object VideoCodecSettings {
  @scala.inline
  def apply(
    Codec: VideoCodec = null,
    FrameCaptureSettings: FrameCaptureSettings = null,
    H264Settings: H264Settings = null,
    H265Settings: H265Settings = null,
    Mpeg2Settings: Mpeg2Settings = null,
    ProresSettings: ProresSettings = null
  ): VideoCodecSettings = {
    val __obj = js.Dynamic.literal()
    if (Codec != null) __obj.updateDynamic("Codec")(Codec.asInstanceOf[js.Any])
    if (FrameCaptureSettings != null) __obj.updateDynamic("FrameCaptureSettings")(FrameCaptureSettings)
    if (H264Settings != null) __obj.updateDynamic("H264Settings")(H264Settings)
    if (H265Settings != null) __obj.updateDynamic("H265Settings")(H265Settings)
    if (Mpeg2Settings != null) __obj.updateDynamic("Mpeg2Settings")(Mpeg2Settings)
    if (ProresSettings != null) __obj.updateDynamic("ProresSettings")(ProresSettings)
    __obj.asInstanceOf[VideoCodecSettings]
  }
}

