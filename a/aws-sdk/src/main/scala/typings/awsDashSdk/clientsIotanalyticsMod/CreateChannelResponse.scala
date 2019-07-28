package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateChannelResponse extends js.Object {
  /**
    * The ARN of the channel.
    */
  var channelArn: js.UndefOr[ChannelArn] = js.undefined
  /**
    * The name of the channel.
    */
  var channelName: js.UndefOr[ChannelName] = js.undefined
  /**
    * How long, in days, message data is kept for the channel.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
}

object CreateChannelResponse {
  @scala.inline
  def apply(
    channelArn: ChannelArn = null,
    channelName: ChannelName = null,
    retentionPeriod: RetentionPeriod = null
  ): CreateChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (channelArn != null) __obj.updateDynamic("channelArn")(channelArn)
    if (channelName != null) __obj.updateDynamic("channelName")(channelName)
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod)
    __obj.asInstanceOf[CreateChannelResponse]
  }
}

