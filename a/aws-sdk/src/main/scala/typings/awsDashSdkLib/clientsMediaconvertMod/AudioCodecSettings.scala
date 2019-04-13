package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioCodecSettings extends js.Object {
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AAC. The service accepts one of two mutually exclusive groups of AAC settings--VBR and CBR. To select one of these modes, set the value of Bitrate control mode (rateControlMode) to "VBR" or "CBR".  In VBR mode, you control the audio quality with the setting VBR quality (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate). Defaults and valid values depend on the rate control mode.
    */
  var AacSettings: js.UndefOr[AacSettings] = js.undefined
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AC3.
    */
  var Ac3Settings: js.UndefOr[Ac3Settings] = js.undefined
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AIFF.
    */
  var AiffSettings: js.UndefOr[AiffSettings] = js.undefined
  /**
    * Type of Audio codec.
    */
  var Codec: js.UndefOr[AudioCodec] = js.undefined
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3.
    */
  var Eac3Settings: js.UndefOr[Eac3Settings] = js.undefined
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value MP2.
    */
  var Mp2Settings: js.UndefOr[Mp2Settings] = js.undefined
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value WAV.
    */
  var WavSettings: js.UndefOr[WavSettings] = js.undefined
}

object AudioCodecSettings {
  @scala.inline
  def apply(
    AacSettings: AacSettings = null,
    Ac3Settings: Ac3Settings = null,
    AiffSettings: AiffSettings = null,
    Codec: AudioCodec = null,
    Eac3Settings: Eac3Settings = null,
    Mp2Settings: Mp2Settings = null,
    WavSettings: WavSettings = null
  ): AudioCodecSettings = {
    val __obj = js.Dynamic.literal()
    if (AacSettings != null) __obj.updateDynamic("AacSettings")(AacSettings)
    if (Ac3Settings != null) __obj.updateDynamic("Ac3Settings")(Ac3Settings)
    if (AiffSettings != null) __obj.updateDynamic("AiffSettings")(AiffSettings)
    if (Codec != null) __obj.updateDynamic("Codec")(Codec.asInstanceOf[js.Any])
    if (Eac3Settings != null) __obj.updateDynamic("Eac3Settings")(Eac3Settings)
    if (Mp2Settings != null) __obj.updateDynamic("Mp2Settings")(Mp2Settings)
    if (WavSettings != null) __obj.updateDynamic("WavSettings")(WavSettings)
    __obj.asInstanceOf[AudioCodecSettings]
  }
}

