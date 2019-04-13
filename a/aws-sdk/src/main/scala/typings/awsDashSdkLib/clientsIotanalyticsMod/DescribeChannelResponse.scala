package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeChannelResponse extends js.Object {
  /**
    * An object that contains information about the channel.
    */
  var channel: js.UndefOr[Channel] = js.undefined
  /**
    * Statistics about the channel. Included if the 'includeStatistics' parameter is set to true in the request.
    */
  var statistics: js.UndefOr[ChannelStatistics] = js.undefined
}

object DescribeChannelResponse {
  @scala.inline
  def apply(channel: Channel = null, statistics: ChannelStatistics = null): DescribeChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    __obj.asInstanceOf[DescribeChannelResponse]
  }
}

