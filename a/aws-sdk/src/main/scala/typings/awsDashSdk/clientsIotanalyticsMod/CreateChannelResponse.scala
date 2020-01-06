package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateChannelResponse extends js.Object {
  /**
    * The ARN of the channel.
    */
  var channelArn: js.UndefOr[ChannelArn] = js.native
  /**
    * The name of the channel.
    */
  var channelName: js.UndefOr[ChannelName] = js.native
  /**
    * How long, in days, message data is kept for the channel.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
}

object CreateChannelResponse {
  @scala.inline
  def apply(
    channelArn: ChannelArn = null,
    channelName: ChannelName = null,
    retentionPeriod: RetentionPeriod = null
  ): CreateChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (channelArn != null) __obj.updateDynamic("channelArn")(channelArn.asInstanceOf[js.Any])
    if (channelName != null) __obj.updateDynamic("channelName")(channelName.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelResponse]
  }
}

