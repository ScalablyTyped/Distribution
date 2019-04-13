package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelStatistics extends js.Object {
  /**
    * The estimated size of the channel.
    */
  var size: js.UndefOr[EstimatedResourceSize] = js.undefined
}

object ChannelStatistics {
  @scala.inline
  def apply(size: EstimatedResourceSize = null): ChannelStatistics = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ChannelStatistics]
  }
}

