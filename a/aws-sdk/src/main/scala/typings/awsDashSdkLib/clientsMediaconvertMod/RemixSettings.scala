package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemixSettings extends js.Object {
  /**
    * Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each channel. Units are in dB. Acceptable values are within the range from -60 (mute) through 6. A setting of 0 passes the input channel unchanged to the output channel (no attenuation or amplification).
    */
  var ChannelMapping: js.UndefOr[ChannelMapping] = js.undefined
  /**
    * Specify the number of audio channels from your input that you want to use in your output. With remixing, you might combine or split the data in these channels, so the number of channels in your final output might be different.
    */
  var ChannelsIn: js.UndefOr[__integerMin1Max16] = js.undefined
  /**
    * Specify the number of channels in this output after remixing. Valid values: 1, 2, 4, 6, 8
    */
  var ChannelsOut: js.UndefOr[__integerMin1Max8] = js.undefined
}

object RemixSettings {
  @scala.inline
  def apply(
    ChannelMapping: ChannelMapping = null,
    ChannelsIn: js.UndefOr[__integerMin1Max16] = js.undefined,
    ChannelsOut: js.UndefOr[__integerMin1Max8] = js.undefined
  ): RemixSettings = {
    val __obj = js.Dynamic.literal()
    if (ChannelMapping != null) __obj.updateDynamic("ChannelMapping")(ChannelMapping)
    if (!js.isUndefined(ChannelsIn)) __obj.updateDynamic("ChannelsIn")(ChannelsIn)
    if (!js.isUndefined(ChannelsOut)) __obj.updateDynamic("ChannelsOut")(ChannelsOut)
    __obj.asInstanceOf[RemixSettings]
  }
}

