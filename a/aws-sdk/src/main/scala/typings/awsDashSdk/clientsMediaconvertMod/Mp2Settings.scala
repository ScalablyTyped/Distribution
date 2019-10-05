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
  def apply(Bitrate: Int | Double = null, Channels: Int | Double = null, SampleRate: Int | Double = null): Mp2Settings = {
    val __obj = js.Dynamic.literal()
    if (Bitrate != null) __obj.updateDynamic("Bitrate")(Bitrate.asInstanceOf[js.Any])
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    if (SampleRate != null) __obj.updateDynamic("SampleRate")(SampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mp2Settings]
  }
}

