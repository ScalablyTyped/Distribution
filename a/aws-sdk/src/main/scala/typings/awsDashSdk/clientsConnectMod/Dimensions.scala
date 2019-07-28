package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimensions extends js.Object {
  /**
    * The channel used for grouping and filters. Only VOICE is supported.
    */
  var Channel: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Channel] = js.undefined
  /**
    * A QueueReference object used as one part of dimension for the metrics results.
    */
  var Queue: js.UndefOr[QueueReference] = js.undefined
}

object Dimensions {
  @scala.inline
  def apply(Channel: Channel = null, Queue: QueueReference = null): Dimensions = {
    val __obj = js.Dynamic.literal()
    if (Channel != null) __obj.updateDynamic("Channel")(Channel.asInstanceOf[js.Any])
    if (Queue != null) __obj.updateDynamic("Queue")(Queue)
    __obj.asInstanceOf[Dimensions]
  }
}

