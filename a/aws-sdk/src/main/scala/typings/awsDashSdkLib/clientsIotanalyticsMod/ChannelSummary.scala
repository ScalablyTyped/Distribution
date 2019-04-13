package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSummary extends js.Object {
  /**
    * The name of the channel.
    */
  var channelName: js.UndefOr[ChannelName] = js.undefined
  /**
    * When the channel was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The last time the channel was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The status of the channel.
    */
  var status: js.UndefOr[ChannelStatus] = js.undefined
}

object ChannelSummary {
  @scala.inline
  def apply(
    channelName: ChannelName = null,
    creationTime: Timestamp = null,
    lastUpdateTime: Timestamp = null,
    status: ChannelStatus = null
  ): ChannelSummary = {
    val __obj = js.Dynamic.literal()
    if (channelName != null) __obj.updateDynamic("channelName")(channelName)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSummary]
  }
}

