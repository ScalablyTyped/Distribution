package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelStatistics extends js.Object {
  /**
    * The estimated size of the channel.
    */
  var size: js.UndefOr[EstimatedResourceSize] = js.native
}

object ChannelStatistics {
  @scala.inline
  def apply(size: EstimatedResourceSize = null): ChannelStatistics = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelStatistics]
  }
}

