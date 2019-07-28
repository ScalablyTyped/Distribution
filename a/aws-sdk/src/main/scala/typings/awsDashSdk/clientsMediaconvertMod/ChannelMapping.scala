package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelMapping extends js.Object {
  /**
    * List of output channels
    */
  var OutputChannels: js.UndefOr[__listOfOutputChannelMapping] = js.undefined
}

object ChannelMapping {
  @scala.inline
  def apply(OutputChannels: __listOfOutputChannelMapping = null): ChannelMapping = {
    val __obj = js.Dynamic.literal()
    if (OutputChannels != null) __obj.updateDynamic("OutputChannels")(OutputChannels)
    __obj.asInstanceOf[ChannelMapping]
  }
}

