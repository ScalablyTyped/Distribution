package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ac3Settings extends js.Object {
  /**
    * Specify the average bitrate in bits per second. Valid bitrates depend on the coding mode.
    */
  var Bitrate: js.UndefOr[__integerMin64000Max640000] = js.undefined
  /**
    * Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  var BitstreamMode: js.UndefOr[Ac3BitstreamMode] = js.undefined
  /**
    * Dolby Digital coding mode. Determines number of channels.
    */
  var CodingMode: js.UndefOr[Ac3CodingMode] = js.undefined
  /**
    * Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed through.
    */
  var Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined
  /**
    * If set to FILM_STANDARD, adds dynamic range compression signaling to the output bitstream as defined in the Dolby Digital specification.
    */
  var DynamicRangeCompressionProfile: js.UndefOr[Ac3DynamicRangeCompressionProfile] = js.undefined
  /**
    * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
    */
  var LfeFilter: js.UndefOr[Ac3LfeFilter] = js.undefined
  /**
    * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  var MetadataControl: js.UndefOr[Ac3MetadataControl] = js.undefined
  /**
    * This value is always 48000. It represents the sample rate in Hz.
    */
  var SampleRate: js.UndefOr[__integerMin48000Max48000] = js.undefined
}

object Ac3Settings {
  @scala.inline
  def apply(
    Bitrate: js.UndefOr[__integerMin64000Max640000] = js.undefined,
    BitstreamMode: Ac3BitstreamMode = null,
    CodingMode: Ac3CodingMode = null,
    Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined,
    DynamicRangeCompressionProfile: Ac3DynamicRangeCompressionProfile = null,
    LfeFilter: Ac3LfeFilter = null,
    MetadataControl: Ac3MetadataControl = null,
    SampleRate: js.UndefOr[__integerMin48000Max48000] = js.undefined
  ): Ac3Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Bitrate)) __obj.updateDynamic("Bitrate")(Bitrate)
    if (BitstreamMode != null) __obj.updateDynamic("BitstreamMode")(BitstreamMode.asInstanceOf[js.Any])
    if (CodingMode != null) __obj.updateDynamic("CodingMode")(CodingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(Dialnorm)) __obj.updateDynamic("Dialnorm")(Dialnorm)
    if (DynamicRangeCompressionProfile != null) __obj.updateDynamic("DynamicRangeCompressionProfile")(DynamicRangeCompressionProfile.asInstanceOf[js.Any])
    if (LfeFilter != null) __obj.updateDynamic("LfeFilter")(LfeFilter.asInstanceOf[js.Any])
    if (MetadataControl != null) __obj.updateDynamic("MetadataControl")(MetadataControl.asInstanceOf[js.Any])
    if (!js.isUndefined(SampleRate)) __obj.updateDynamic("SampleRate")(SampleRate)
    __obj.asInstanceOf[Ac3Settings]
  }
}

