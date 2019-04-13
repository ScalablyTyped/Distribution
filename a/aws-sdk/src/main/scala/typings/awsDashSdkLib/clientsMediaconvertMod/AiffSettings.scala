package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AiffSettings extends js.Object {
  /**
    * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
    */
  var BitDepth: js.UndefOr[__integerMin16Max24] = js.undefined
  /**
    * Set Channels to specify the number of channels in this output audio track. Choosing Mono in the console will give you 1 output channel; choosing Stereo will give you 2. In the API, valid values are 1 and 2.
    */
  var Channels: js.UndefOr[__integerMin1Max2] = js.undefined
  /**
    * Sample rate in hz.
    */
  var SampleRate: js.UndefOr[__integerMin8000Max192000] = js.undefined
}

object AiffSettings {
  @scala.inline
  def apply(
    BitDepth: js.UndefOr[__integerMin16Max24] = js.undefined,
    Channels: js.UndefOr[__integerMin1Max2] = js.undefined,
    SampleRate: js.UndefOr[__integerMin8000Max192000] = js.undefined
  ): AiffSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BitDepth)) __obj.updateDynamic("BitDepth")(BitDepth)
    if (!js.isUndefined(Channels)) __obj.updateDynamic("Channels")(Channels)
    if (!js.isUndefined(SampleRate)) __obj.updateDynamic("SampleRate")(SampleRate)
    __obj.asInstanceOf[AiffSettings]
  }
}

