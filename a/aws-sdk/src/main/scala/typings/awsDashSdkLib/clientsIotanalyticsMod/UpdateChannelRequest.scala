package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateChannelRequest extends js.Object {
  /**
    * The name of the channel to be updated.
    */
  var channelName: ChannelName
  /**
    * How long, in days, message data is kept for the channel.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
}

object UpdateChannelRequest {
  @scala.inline
  def apply(channelName: ChannelName, retentionPeriod: RetentionPeriod = null): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName)
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod)
    __obj.asInstanceOf[UpdateChannelRequest]
  }
}

