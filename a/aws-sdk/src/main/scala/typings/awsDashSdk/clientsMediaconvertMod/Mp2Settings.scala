package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mp2Settings extends js.Object {
  /**
    * Specify the average bitrate in bits per second.
    */
  var Bitrate: js.UndefOr[__integerMin32000Max384000] = js.undefined
  /**
    * Set Channels to specify the number of channels in this output audio track. Choosing Mono in the console will give you 1 output channel; choosing Stereo will give you 2. In the API, valid values are 1 and 2.
    */
  var Channels: js.UndefOr[__integerMin1Max2] = js.undefined
  /**
    * Sample rate in hz.
    */
  var SampleRate: js.UndefOr[__integerMin32000Max48000] = js.undefined
}

object Mp2Settings {
  @scala.inline
  def apply(
    Bitrate: js.UndefOr[__integerMin32000Max384000] = js.undefined,
    Channels: js.UndefOr[__integerMin1Max2] = js.undefined,
    SampleRate: js.UndefOr[__integerMin32000Max48000] = js.undefined
  ): Mp2Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Bitrate)) __obj.updateDynamic("Bitrate")(Bitrate)
    if (!js.isUndefined(Channels)) __obj.updateDynamic("Channels")(Channels)
    if (!js.isUndefined(SampleRate)) __obj.updateDynamic("SampleRate")(SampleRate)
    __obj.asInstanceOf[Mp2Settings]
  }
}

