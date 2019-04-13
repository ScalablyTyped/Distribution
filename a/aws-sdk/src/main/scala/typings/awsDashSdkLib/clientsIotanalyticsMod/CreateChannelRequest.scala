package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateChannelRequest extends js.Object {
  /**
    * The name of the channel.
    */
  var channelName: ChannelName
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
  def apply(channelName: ChannelName, retentionPeriod: RetentionPeriod = null, tags: TagList = null): CreateChannelRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName)
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateChannelRequest]
  }
}

