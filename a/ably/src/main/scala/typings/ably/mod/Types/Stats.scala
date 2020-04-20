package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var all: StatsMessageTypes
  var apiRequests: StatsRequestCount
  var channels: StatsResourceCount
  var connections: StatsConnectionTypes
  var inbound: StatsMessageTraffic
  var intervalId: String
  var outbound: StatsMessageTraffic
  var persisted: StatsMessageTypes
  var tokenRequests: StatsRequestCount
}

object Stats {
  @scala.inline
  def apply(
    all: StatsMessageTypes,
    apiRequests: StatsRequestCount,
    channels: StatsResourceCount,
    connections: StatsConnectionTypes,
    inbound: StatsMessageTraffic,
    intervalId: String,
    outbound: StatsMessageTraffic,
    persisted: StatsMessageTypes,
    tokenRequests: StatsRequestCount
  ): Stats = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], apiRequests = apiRequests.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], connections = connections.asInstanceOf[js.Any], inbound = inbound.asInstanceOf[js.Any], intervalId = intervalId.asInstanceOf[js.Any], outbound = outbound.asInstanceOf[js.Any], persisted = persisted.asInstanceOf[js.Any], tokenRequests = tokenRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

