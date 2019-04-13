package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WavSettings extends js.Object {
  /**
    * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
    */
  var BitDepth: js.UndefOr[__integerMin16Max24] = js.undefined
  /**
    * Set Channels to specify the number of channels in this output audio track. With WAV, valid values 1, 2, 4, and 8. In the console, these values are Mono, Stereo, 4-Channel, and 8-Channel, respectively.
    */
  var Channels: js.UndefOr[__integerMin1Max8] = js.undefined
  /**
    * The service defaults to using RIFF for WAV outputs. If your output audio is likely to exceed 4 GB in file size, or if you otherwise need the extended support of the RF64 format, set your output WAV file format to RF64.
    */
  var Format: js.UndefOr[WavFormat] = js.undefined
  /**
    * Sample rate in Hz.
    */
  var SampleRate: js.UndefOr[__integerMin8000Max192000] = js.undefined
}

object WavSettings {
  @scala.inline
  def apply(
    BitDepth: js.UndefOr[__integerMin16Max24] = js.undefined,
    Channels: js.UndefOr[__integerMin1Max8] = js.undefined,
    Format: WavFormat = null,
    SampleRate: js.UndefOr[__integerMin8000Max192000] = js.undefined
  ): WavSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BitDepth)) __obj.updateDynamic("BitDepth")(BitDepth)
    if (!js.isUndefined(Channels)) __obj.updateDynamic("Channels")(Channels)
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (!js.isUndefined(SampleRate)) __obj.updateDynamic("SampleRate")(SampleRate)
    __obj.asInstanceOf[WavSettings]
  }
}

