package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters extends js.Object {
  /**
    * The Channel to use as a filter for the metrics returned. Only VOICE is supported.
    */
  var Channels: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Channels] = js.undefined
  /**
    * A list of up to 100 queue IDs or queue ARNs to use to filter the metrics retrieved. You can include both IDs and ARNs in a request.
    */
  var Queues: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Queues] = js.undefined
}

object Filters {
  @scala.inline
  def apply(Channels: Channels = null, Queues: Queues = null): Filters = {
    val __obj = js.Dynamic.literal()
    if (Channels != null) __obj.updateDynamic("Channels")(Channels)
    if (Queues != null) __obj.updateDynamic("Queues")(Queues)
    __obj.asInstanceOf[Filters]
  }
}

