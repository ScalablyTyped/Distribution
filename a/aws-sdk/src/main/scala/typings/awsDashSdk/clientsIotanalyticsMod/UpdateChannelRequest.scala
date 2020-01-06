package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateChannelRequest extends js.Object {
  /**
    * The name of the channel to be updated.
    */
  var channelName: ChannelName = js.native
  /**
    * Where channel data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not specified, the default is "serviceManagedS3". This cannot be changed after creation of the channel.
    */
  var channelStorage: js.UndefOr[ChannelStorage] = js.native
  /**
    * How long, in days, message data is kept for the channel. The retention period cannot be updated if the channel's S3 storage is customer-managed.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
}

object UpdateChannelRequest {
  @scala.inline
  def apply(
    channelName: ChannelName,
    channelStorage: ChannelStorage = null,
    retentionPeriod: RetentionPeriod = null
  ): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any])
    if (channelStorage != null) __obj.updateDynamic("channelStorage")(channelStorage.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelRequest]
  }
}

