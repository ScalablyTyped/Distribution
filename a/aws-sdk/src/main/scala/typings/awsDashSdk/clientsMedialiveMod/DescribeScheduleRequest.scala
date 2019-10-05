package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScheduleRequest extends js.Object {
  /**
    * Id of the channel whose schedule is being updated.
    */
  var ChannelId: __string
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.MaxResults] = js.undefined
  var NextToken: js.UndefOr[__string] = js.undefined
}

object DescribeScheduleRequest {
  @scala.inline
  def apply(ChannelId: __string, MaxResults: Int | Double = null, NextToken: __string = null): DescribeScheduleRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeScheduleRequest]
  }
}

