package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputChannelMapping extends js.Object {
  /**
    * List of input channels
    */
  var InputChannels: js.UndefOr[__listOf__integerMinNegative60Max6] = js.native
}

object OutputChannelMapping {
  @scala.inline
  def apply(InputChannels: __listOf__integerMinNegative60Max6 = null): OutputChannelMapping = {
    val __obj = js.Dynamic.literal()
    if (InputChannels != null) __obj.updateDynamic("InputChannels")(InputChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputChannelMapping]
  }
}

