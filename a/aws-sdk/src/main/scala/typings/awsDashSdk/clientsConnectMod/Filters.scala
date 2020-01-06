package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filters extends js.Object {
  /**
    * The channel to use to filter the metrics.
    */
  var Channels: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Channels] = js.native
  /**
    * The queues to use to filter the metrics. You can specify up to 100 queues per request.
    */
  var Queues: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Queues] = js.native
}

object Filters {
  @scala.inline
  def apply(Channels: Channels = null, Queues: Queues = null): Filters = {
    val __obj = js.Dynamic.literal()
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    if (Queues != null) __obj.updateDynamic("Queues")(Queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
}

