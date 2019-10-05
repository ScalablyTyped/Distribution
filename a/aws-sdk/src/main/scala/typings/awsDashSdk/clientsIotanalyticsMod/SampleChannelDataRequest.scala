package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SampleChannelDataRequest extends js.Object {
  /**
    * The name of the channel whose message samples are retrieved.
    */
  var channelName: ChannelName
  /**
    * The end of the time window from which sample messages are retrieved.
    */
  var endTime: js.UndefOr[EndTime] = js.undefined
  /**
    * The number of sample messages to be retrieved. The limit is 10, the default is also 10.
    */
  var maxMessages: js.UndefOr[MaxMessages] = js.undefined
  /**
    * The start of the time window from which sample messages are retrieved.
    */
  var startTime: js.UndefOr[StartTime] = js.undefined
}

object SampleChannelDataRequest {
  @scala.inline
  def apply(
    channelName: ChannelName,
    endTime: EndTime = null,
    maxMessages: Int | Double = null,
    startTime: StartTime = null
  ): SampleChannelDataRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[SampleChannelDataRequest]
  }
}

