package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelMapping extends js.Object {
  /**
    * List of output channels
    */
  var OutputChannels: js.UndefOr[__listOfOutputChannelMapping] = js.native
}

object ChannelMapping {
  @scala.inline
  def apply(OutputChannels: __listOfOutputChannelMapping = null): ChannelMapping = {
    val __obj = js.Dynamic.literal()
    if (OutputChannels != null) __obj.updateDynamic("OutputChannels")(OutputChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMapping]
  }
}

