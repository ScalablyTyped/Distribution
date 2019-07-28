package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateChannelRequest extends js.Object {
  /**
    * The name of the channel.
    */
  var channelName: ChannelName
  /**
    * Where channel data is stored.
    */
  var channelStorage: js.UndefOr[ChannelStorage] = js.undefined
  /**
    * How long, in days, message data is kept for the channel.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  /**
    * Metadata which can be used to manage the channel.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateChannelRequest {
  @scala.inline
  def apply(
    channelName: ChannelName,
    channelStorage: ChannelStorage = null,
    retentionPeriod: RetentionPeriod = null,
    tags: TagList = null
  ): CreateChannelRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName)
    if (channelStorage != null) __obj.updateDynamic("channelStorage")(channelStorage)
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateChannelRequest]
  }
}

