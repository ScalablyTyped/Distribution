package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeChannelRequest extends js.Object {
  /**
    * The name of the channel whose information is retrieved.
    */
  var channelName: ChannelName
  /**
    * If true, additional statistical information about the channel is included in the response.
    */
  var includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.undefined
}

object DescribeChannelRequest {
  @scala.inline
  def apply(channelName: ChannelName, includeStatistics: js.UndefOr[Boolean] = js.undefined): DescribeChannelRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName)
    if (!js.isUndefined(includeStatistics)) __obj.updateDynamic("includeStatistics")(includeStatistics)
    __obj.asInstanceOf[DescribeChannelRequest]
  }
}

