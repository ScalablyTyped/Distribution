package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dimensions extends js.Object {
  /**
    * The channel used for grouping and filters.
    */
  var Channel: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Channel] = js.native
  /**
    * Information about the queue for which metrics are returned.
    */
  var Queue: js.UndefOr[QueueReference] = js.native
}

object Dimensions {
  @scala.inline
  def apply(Channel: Channel = null, Queue: QueueReference = null): Dimensions = {
    val __obj = js.Dynamic.literal()
    if (Channel != null) __obj.updateDynamic("Channel")(Channel.asInstanceOf[js.Any])
    if (Queue != null) __obj.updateDynamic("Queue")(Queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimensions]
  }
}

