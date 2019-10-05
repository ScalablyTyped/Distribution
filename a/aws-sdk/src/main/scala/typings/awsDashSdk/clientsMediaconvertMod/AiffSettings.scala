package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AiffSettings extends js.Object {
  /**
    * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
    */
  var BitDepth: js.UndefOr[__integerMin16Max24] = js.undefined
  /**
    * Specify the number of channels in this output audio track. Valid values are 1 and even numbers up to 64. For example, 1, 2, 4, 6, and so on, up to 64.
    */
  var Channels: js.UndefOr[__integerMin1Max64] = js.undefined
  /**
    * Sample rate in hz.
    */
  var SampleRate: js.UndefOr[__integerMin8000Max192000] = js.undefined
}

object AiffSettings {
  @scala.inline
  def apply(BitDepth: Int | Double = null, Channels: Int | Double = null, SampleRate: Int | Double = null): AiffSettings = {
    val __obj = js.Dynamic.literal()
    if (BitDepth != null) __obj.updateDynamic("BitDepth")(BitDepth.asInstanceOf[js.Any])
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    if (SampleRate != null) __obj.updateDynamic("SampleRate")(SampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AiffSettings]
  }
}

