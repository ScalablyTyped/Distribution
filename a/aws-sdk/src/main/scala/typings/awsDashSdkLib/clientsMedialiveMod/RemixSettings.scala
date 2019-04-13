package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemixSettings extends js.Object {
  /**
    * Mapping of input channels to output channels, with appropriate gain adjustments.
    */
  var ChannelMappings: __listOfAudioChannelMapping
  /**
    * Number of input channels to be used.
    */
  var ChannelsIn: js.UndefOr[__integerMin1Max16] = js.undefined
  /**
    * Number of output channels to be produced.
  Valid values: 1, 2, 4, 6, 8
    */
  var ChannelsOut: js.UndefOr[__integerMin1Max8] = js.undefined
}

object RemixSettings {
  @scala.inline
  def apply(
    ChannelMappings: __listOfAudioChannelMapping,
    ChannelsIn: js.UndefOr[__integerMin1Max16] = js.undefined,
    ChannelsOut: js.UndefOr[__integerMin1Max8] = js.undefined
  ): RemixSettings = {
    val __obj = js.Dynamic.literal(ChannelMappings = ChannelMappings)
    if (!js.isUndefined(ChannelsIn)) __obj.updateDynamic("ChannelsIn")(ChannelsIn)
    if (!js.isUndefined(ChannelsOut)) __obj.updateDynamic("ChannelsOut")(ChannelsOut)
    __obj.asInstanceOf[RemixSettings]
  }
}

