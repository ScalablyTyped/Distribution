package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedDestinationSettings extends js.Object {
  /**
    * Ignore this setting unless your input captions are SCC format and your output container is MXF. With this combination of input captions format and output container, you can optionally use this setting to replace the input channel number with the track number that you specify. Specify a different number for each output captions track. If you don't specify an output track number, the system uses the input channel number for the output channel number. This setting applies to each output individually. You can optionally combine two captions channels in your output. The two output channel numbers can be one of the following pairs: 1,3; 2,4; 1,4; or 2,3.
    */
  var Destination608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined
}

object EmbeddedDestinationSettings {
  @scala.inline
  def apply(Destination608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined): EmbeddedDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Destination608ChannelNumber)) __obj.updateDynamic("Destination608ChannelNumber")(Destination608ChannelNumber)
    __obj.asInstanceOf[EmbeddedDestinationSettings]
  }
}

