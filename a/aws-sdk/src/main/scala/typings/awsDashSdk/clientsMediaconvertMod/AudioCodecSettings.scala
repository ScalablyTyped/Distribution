package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioCodecSettings extends js.Object {
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AAC. The service accepts one of two mutually exclusive groups of AAC settings--VBR and CBR. To select one of these modes, set the value of Bitrate control mode (rateControlMode) to "VBR" or "CBR".  In VBR mode, you control the audio quality with the setting VBR quality (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate). Defaults and valid values depend on the rate control mode.
    */
  var AacSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.AacSettings] = js.native
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AC3.
    */
  var Ac3Settings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.Ac3Settings] = js.native
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AIFF.
    */
  var AiffSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.AiffSettings] = js.native
  /**
    * Type of Audio codec.
    */
  var Codec: js.UndefOr[AudioCodec] = js.native
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3_ATMOS.
    */
  var Eac3AtmosSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.Eac3AtmosSettings] = js.native
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3.
    */
  var Eac3Settings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.Eac3Settings] = js.native
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value MP2.
    */
  var Mp2Settings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.Mp2Settings] = js.native
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value WAV.
    */
  var WavSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.WavSettings] = js.native
}

object AudioCodecSettings {
  @scala.inline
  def apply(
    AacSettings: AacSettings = null,
    Ac3Settings: Ac3Settings = null,
    AiffSettings: AiffSettings = null,
    Codec: AudioCodec = null,
    Eac3AtmosSettings: Eac3AtmosSettings = null,
    Eac3Settings: Eac3Settings = null,
    Mp2Settings: Mp2Settings = null,
    WavSettings: WavSettings = null
  ): AudioCodecSettings = {
    val __obj = js.Dynamic.literal()
    if (AacSettings != null) __obj.updateDynamic("AacSettings")(AacSettings.asInstanceOf[js.Any])
    if (Ac3Settings != null) __obj.updateDynamic("Ac3Settings")(Ac3Settings.asInstanceOf[js.Any])
    if (AiffSettings != null) __obj.updateDynamic("AiffSettings")(AiffSettings.asInstanceOf[js.Any])
    if (Codec != null) __obj.updateDynamic("Codec")(Codec.asInstanceOf[js.Any])
    if (Eac3AtmosSettings != null) __obj.updateDynamic("Eac3AtmosSettings")(Eac3AtmosSettings.asInstanceOf[js.Any])
    if (Eac3Settings != null) __obj.updateDynamic("Eac3Settings")(Eac3Settings.asInstanceOf[js.Any])
    if (Mp2Settings != null) __obj.updateDynamic("Mp2Settings")(Mp2Settings.asInstanceOf[js.Any])
    if (WavSettings != null) __obj.updateDynamic("WavSettings")(WavSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioCodecSettings]
  }
}

