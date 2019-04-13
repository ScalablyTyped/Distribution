package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  /**
    * The ARN of the channel.
    */
  var arn: js.UndefOr[ChannelArn] = js.undefined
  /**
    * When the channel was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * When the channel was last updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the channel.
    */
  var name: js.UndefOr[ChannelName] = js.undefined
  /**
    * How long, in days, message data is kept for the channel.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  /**
    * The status of the channel.
    */
  var status: js.UndefOr[ChannelStatus] = js.undefined
}

object Channel {
  @scala.inline
  def apply(
    arn: ChannelArn = null,
    creationTime: Timestamp = null,
    lastUpdateTime: Timestamp = null,
    name: ChannelName = null,
    retentionPeriod: RetentionPeriod = null,
    status: ChannelStatus = null
  ): Channel = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
}

