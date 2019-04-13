package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Eac3Settings extends js.Object {
  /**
    * When set to attenuate3Db, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
    */
  var AttenuationControl: js.UndefOr[Eac3AttenuationControl] = js.undefined
  /**
    * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
    */
  var Bitrate: js.UndefOr[__double] = js.undefined
  /**
    * Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See ATSC A/52-2012 (Annex E) for background on these values.
    */
  var BitstreamMode: js.UndefOr[Eac3BitstreamMode] = js.undefined
  /**
    * Dolby Digital Plus coding mode. Determines number of channels.
    */
  var CodingMode: js.UndefOr[Eac3CodingMode] = js.undefined
  /**
    * When set to enabled, activates a DC highpass filter for all input channels.
    */
  var DcFilter: js.UndefOr[Eac3DcFilter] = js.undefined
  /**
    * Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed through.
    */
  var Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined
  /**
    * Sets the Dolby dynamic range compression profile.
    */
  var DrcLine: js.UndefOr[Eac3DrcLine] = js.undefined
  /**
    * Sets the profile for heavy Dolby dynamic range compression, ensures that the instantaneous signal peaks do not exceed specified levels.
    */
  var DrcRf: js.UndefOr[Eac3DrcRf] = js.undefined
  /**
    * When encoding 3/2 audio, setting to lfe enables the LFE channel
    */
  var LfeControl: js.UndefOr[Eac3LfeControl] = js.undefined
  /**
    * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with codingMode32 coding mode.
    */
  var LfeFilter: js.UndefOr[Eac3LfeFilter] = js.undefined
  /**
    * Left only/Right only center mix level. Only used for 3/2 coding mode.
    */
  var LoRoCenterMixLevel: js.UndefOr[__double] = js.undefined
  /**
    * Left only/Right only surround mix level. Only used for 3/2 coding mode.
    */
  var LoRoSurroundMixLevel: js.UndefOr[__double] = js.undefined
  /**
    * Left total/Right total center mix level. Only used for 3/2 coding mode.
    */
  var LtRtCenterMixLevel: js.UndefOr[__double] = js.undefined
  /**
    * Left total/Right total surround mix level. Only used for 3/2 coding mode.
    */
  var LtRtSurroundMixLevel: js.UndefOr[__double] = js.undefined
  /**
    * When set to followInput, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  var MetadataControl: js.UndefOr[Eac3MetadataControl] = js.undefined
  /**
    * When set to whenPossible, input DD+ audio will be passed through if it is present on the input. This detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and encoding.
    */
  var PassthroughControl: js.UndefOr[Eac3PassthroughControl] = js.undefined
  /**
    * When set to shift90Degrees, applies a 90-degree phase shift to the surround channels. Only used for 3/2 coding mode.
    */
  var PhaseControl: js.UndefOr[Eac3PhaseControl] = js.undefined
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
    Bitrate: js.UndefOr[__double] = js.undefined,
    BitstreamMode: Eac3BitstreamMode = null,
    CodingMode: Eac3CodingMode = null,
    DcFilter: Eac3DcFilter = null,
    Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined,
    DrcLine: Eac3DrcLine = null,
    DrcRf: Eac3DrcRf = null,
    LfeControl: Eac3LfeControl = null,
    LfeFilter: Eac3LfeFilter = null,
    LoRoCenterMixLevel: js.UndefOr[__double] = js.undefined,
    LoRoSurroundMixLevel: js.UndefOr[__double] = js.undefined,
    LtRtCenterMixLevel: js.UndefOr[__double] = js.undefined,
    LtRtSurroundMixLevel: js.UndefOr[__double] = js.undefined,
    MetadataControl: Eac3MetadataControl = null,
    PassthroughControl: Eac3PassthroughControl = null,
    PhaseControl: Eac3PhaseControl = null,
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
    if (DrcLine != null) __obj.updateDynamic("DrcLine")(DrcLine.asInstanceOf[js.Any])
    if (DrcRf != null) __obj.updateDynamic("DrcRf")(DrcRf.asInstanceOf[js.Any])
    if (LfeControl != null) __obj.updateDynamic("LfeControl")(LfeControl.asInstanceOf[js.Any])
    if (LfeFilter != null) __obj.updateDynamic("LfeFilter")(LfeFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(LoRoCenterMixLevel)) __obj.updateDynamic("LoRoCenterMixLevel")(LoRoCenterMixLevel)
    if (!js.isUndefined(LoRoSurroundMixLevel)) __obj.updateDynamic("LoRoSurroundMixLevel")(LoRoSurroundMixLevel)
    if (!js.isUndefined(LtRtCenterMixLevel)) __obj.updateDynamic("LtRtCenterMixLevel")(LtRtCenterMixLevel)
    if (!js.isUndefined(LtRtSurroundMixLevel)) __obj.updateDynamic("LtRtSurroundMixLevel")(LtRtSurroundMixLevel)
    if (MetadataControl != null) __obj.updateDynamic("MetadataControl")(MetadataControl.asInstanceOf[js.Any])
    if (PassthroughControl != null) __obj.updateDynamic("PassthroughControl")(PassthroughControl.asInstanceOf[js.Any])
    if (PhaseControl != null) __obj.updateDynamic("PhaseControl")(PhaseControl.asInstanceOf[js.Any])
    if (StereoDownmix != null) __obj.updateDynamic("StereoDownmix")(StereoDownmix.asInstanceOf[js.Any])
    if (SurroundExMode != null) __obj.updateDynamic("SurroundExMode")(SurroundExMode.asInstanceOf[js.Any])
    if (SurroundMode != null) __obj.updateDynamic("SurroundMode")(SurroundMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eac3Settings]
  }
}

