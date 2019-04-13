package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AacSettings extends js.Object {
  /**
    * Average bitrate in bits/second. Valid values depend on rate control mode and profile.
    */
  var Bitrate: js.UndefOr[__double] = js.undefined
  /**
    * Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. The adReceiverMix setting receives a stereo description plus control track and emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
    */
  var CodingMode: js.UndefOr[AacCodingMode] = js.undefined
  /**
    * Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD (narration) as a stereo pair.  The Audio Type field (audioType) will be set to 3, which signals to downstream systems that this stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does not perform the mixing. The values in audioTypeControl and audioType (in AudioDescription) are ignored when set to broadcasterMixedAd.
  Leave set to "normal" when input does not contain pre-mixed audio + AD.
    */
  var InputType: js.UndefOr[AacInputType] = js.undefined
  /**
    * AAC Profile.
    */
  var Profile: js.UndefOr[AacProfile] = js.undefined
  /**
    * Rate Control Mode.
    */
  var RateControlMode: js.UndefOr[AacRateControlMode] = js.undefined
  /**
    * Sets LATM / LOAS AAC output for raw containers.
    */
  var RawFormat: js.UndefOr[AacRawFormat] = js.undefined
  /**
    * Sample rate in Hz. Valid values depend on rate control mode and profile.
    */
  var SampleRate: js.UndefOr[__double] = js.undefined
  /**
    * Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
    */
  var Spec: js.UndefOr[AacSpec] = js.undefined
  /**
    * VBR Quality Level - Only used if rateControlMode is VBR.
    */
  var VbrQuality: js.UndefOr[AacVbrQuality] = js.undefined
}

object AacSettings {
  @scala.inline
  def apply(
    Bitrate: js.UndefOr[__double] = js.undefined,
    CodingMode: AacCodingMode = null,
    InputType: AacInputType = null,
    Profile: AacProfile = null,
    RateControlMode: AacRateControlMode = null,
    RawFormat: AacRawFormat = null,
    SampleRate: js.UndefOr[__double] = js.undefined,
    Spec: AacSpec = null,
    VbrQuality: AacVbrQuality = null
  ): AacSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Bitrate)) __obj.updateDynamic("Bitrate")(Bitrate)
    if (CodingMode != null) __obj.updateDynamic("CodingMode")(CodingMode.asInstanceOf[js.Any])
    if (InputType != null) __obj.updateDynamic("InputType")(InputType.asInstanceOf[js.Any])
    if (Profile != null) __obj.updateDynamic("Profile")(Profile.asInstanceOf[js.Any])
    if (RateControlMode != null) __obj.updateDynamic("RateControlMode")(RateControlMode.asInstanceOf[js.Any])
    if (RawFormat != null) __obj.updateDynamic("RawFormat")(RawFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(SampleRate)) __obj.updateDynamic("SampleRate")(SampleRate)
    if (Spec != null) __obj.updateDynamic("Spec")(Spec.asInstanceOf[js.Any])
    if (VbrQuality != null) __obj.updateDynamic("VbrQuality")(VbrQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[AacSettings]
  }
}

