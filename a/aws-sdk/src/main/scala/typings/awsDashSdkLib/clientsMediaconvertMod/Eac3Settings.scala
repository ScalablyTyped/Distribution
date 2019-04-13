package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Eac3Settings extends js.Object {
  /**
    * If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
    */
  var AttenuationControl: js.UndefOr[Eac3AttenuationControl] = js.undefined
  /**
    * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
    */
  var Bitrate: js.UndefOr[__integerMin64000Max640000] = js.undefined
  /**
    * Specifies the "Bitstream Mode" (bsmod) for the emitted E-AC-3 stream. See ATSC A/52-2012 (Annex E) for background on these values.
    */
  var BitstreamMode: js.UndefOr[Eac3BitstreamMode] = js.undefined
  /**
    * Dolby Digital Plus coding mode. Determines number of channels.
    */
  var CodingMode: js.UndefOr[Eac3CodingMode] = js.undefined
  /**
    * Activates a DC highpass filter for all input channels.
    */
  var DcFilter: js.UndefOr[Eac3DcFilter] = js.undefined
  /**
    * Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed through.
    */
  var Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined
  /**
    * Enables Dynamic Range Compression that restricts the absolute peak level for a signal.
    */
  var DynamicRangeCompressionLine: js.UndefOr[Eac3DynamicRangeCompressionLine] = js.undefined
  /**
    * Enables Heavy Dynamic Range Compression, ensures that the instantaneous signal peaks do not exceed specified levels.
    */
  var DynamicRangeCompressionRf: js.UndefOr[Eac3DynamicRangeCompressionRf] = js.undefined
  /**
    * When encoding 3/2 audio, controls whether the LFE channel is enabled
    */
  var LfeControl: js.UndefOr[Eac3LfeControl] = js.undefined
  /**
    * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
    */
  var LfeFilter: js.UndefOr[Eac3LfeFilter] = js.undefined
  /**
    * Left only/Right only center mix level. Only used for 3/2 coding mode.
  Valid values: 3.0, 1.5, 0.0, -1.5 -3.0 -4.5 -6.0 -60
    */
  var LoRoCenterMixLevel: js.UndefOr[__doubleMinNegative60Max3] = js.undefined
  /**
    * Left only/Right only surround mix level. Only used for 3/2 coding mode.
  Valid values: -1.5 -3.0 -4.5 -6.0 -60
    */
  var LoRoSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1] = js.undefined
  /**
    * Left total/Right total center mix level. Only used for 3/2 coding mode.
  Valid values: 3.0, 1.5, 0.0, -1.5 -3.0 -4.5 -6.0 -60
    */
  var LtRtCenterMixLevel: js.UndefOr[__doubleMinNegative60Max3] = js.undefined
  /**
    * Left total/Right total surround mix level. Only used for 3/2 coding mode.
  Valid values: -1.5 -3.0 -4.5 -6.0 -60
    */
  var LtRtSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1] = js.undefined
  /**
    * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  var MetadataControl: js.UndefOr[Eac3MetadataControl] = js.undefined
  /**
    * When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it is present on the input. this detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and encoding.
    */
  var PassthroughControl: js.UndefOr[Eac3PassthroughControl] = js.undefined
  /**
    * Controls the amount of phase-shift applied to the surround channels. Only used for 3/2 coding mode.
    */
  var PhaseControl: js.UndefOr[Eac3PhaseControl] = js.undefined
  /**
    * Sample rate in hz. Sample rate is always 48000.
    */
  var SampleRate: js.UndefOr[__integerMin48000Max48000] = js.undefined
  /**
    * Stereo downmix preference. Only used for 3/2 coding mode.
    */
  var StereoDownmix: js.UndefOr[Eac3StereoDownmix] = js.undefined
  /**
    * When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and right surround channels.
    */
  var SurroundExMode: js.UndefOr[Eac3SurroundExMode] = js.undefined
  /**
    * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
    */
  var SurroundMode: js.UndefOr[Eac3SurroundMode] = js.undefined
}

object Eac3Settings {
  @scala.inline
  def apply(
    AttenuationControl: Eac3AttenuationControl = null,
    Bitrate: js.UndefOr[__integerMin64000Max640000] = js.undefined,
    BitstreamMode: Eac3BitstreamMode = null,
    CodingMode: Eac3CodingMode = null,
    DcFilter: Eac3DcFilter = null,
    Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined,
    DynamicRangeCompressionLine: Eac3DynamicRangeCompressionLine = null,
    DynamicRangeCompressionRf: Eac3DynamicRangeCompressionRf = null,
    LfeControl: Eac3LfeControl = null,
    LfeFilter: Eac3LfeFilter = null,
    LoRoCenterMixLevel: js.UndefOr[__doubleMinNegative60Max3] = js.undefined,
    LoRoSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1] = js.undefined,
    LtRtCenterMixLevel: js.UndefOr[__doubleMinNegative60Max3] = js.undefined,
    LtRtSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1] = js.undefined,
    MetadataControl: Eac3MetadataControl = null,
    PassthroughControl: Eac3PassthroughControl = null,
    PhaseControl: Eac3PhaseControl = null,
    SampleRate: js.UndefOr[__integerMin48000Max48000] = js.undefined,
    StereoDownmix: Eac3StereoDownmix = null,
    SurroundExMode: Eac3SurroundExMode = null,
    SurroundMode: Eac3SurroundMode = null
  ): Eac3Settings = {
    val __obj = js.Dynamic.literal()
    if (AttenuationControl != null) __obj.updateDynamic("AttenuationControl")(AttenuationControl.asInstanceOf[js.Any])
    if (!js.isUndefined(Bitrate)) __obj.updateDynamic("Bitrate")(Bitrate)
    if (BitstreamMode != null) __obj.updateDynamic("BitstreamMode")(BitstreamMode.asInstanceOf[js.Any])
    if (CodingMode != null) __obj.updateDynamic("CodingMode")(CodingMode.asInstanceOf[js.Any])
    if (DcFilter != null) __obj.updateDynamic("DcFilter")(DcFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(Dialnorm)) __obj.updateDynamic("Dialnorm")(Dialnorm)
    if (DynamicRangeCompressionLine != null) __obj.updateDynamic("DynamicRangeCompressionLine")(DynamicRangeCompressionLine.asInstanceOf[js.Any])
    if (DynamicRangeCompressionRf != null) __obj.updateDynamic("DynamicRangeCompressionRf")(DynamicRangeCompressionRf.asInstanceOf[js.Any])
    if (LfeControl != null) __obj.updateDynamic("LfeControl")(LfeControl.asInstanceOf[js.Any])
    if (LfeFilter != null) __obj.updateDynamic("LfeFilter")(LfeFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(LoRoCenterMixLevel)) __obj.updateDynamic("LoRoCenterMixLevel")(LoRoCenterMixLevel)
    if (!js.isUndefined(LoRoSurroundMixLevel)) __obj.updateDynamic("LoRoSurroundMixLevel")(LoRoSurroundMixLevel)
    if (!js.isUndefined(LtRtCenterMixLevel)) __obj.updateDynamic("LtRtCenterMixLevel")(LtRtCenterMixLevel)
    if (!js.isUndefined(LtRtSurroundMixLevel)) __obj.updateDynamic("LtRtSurroundMixLevel")(LtRtSurroundMixLevel)
    if (MetadataControl != null) __obj.updateDynamic("MetadataControl")(MetadataControl.asInstanceOf[js.Any])
    if (PassthroughControl != null) __obj.updateDynamic("PassthroughControl")(PassthroughControl.asInstanceOf[js.Any])
    if (PhaseControl != null) __obj.updateDynamic("PhaseControl")(PhaseControl.asInstanceOf[js.Any])
    if (!js.isUndefined(SampleRate)) __obj.updateDynamic("SampleRate")(SampleRate)
    if (StereoDownmix != null) __obj.updateDynamic("StereoDownmix")(StereoDownmix.asInstanceOf[js.Any])
    if (SurroundExMode != null) __obj.updateDynamic("SurroundExMode")(SurroundExMode.asInstanceOf[js.Any])
    if (SurroundMode != null) __obj.updateDynamic("SurroundMode")(SurroundMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eac3Settings]
  }
}

