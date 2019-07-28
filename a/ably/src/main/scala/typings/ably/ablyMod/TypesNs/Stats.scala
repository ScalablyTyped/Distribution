package typings.ably.ablyMod.TypesNs

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
    val __obj = js.Dynamic.literal(all = all, apiRequests = apiRequests, channels = channels, connections = connections, inbound = inbound, intervalId = intervalId, outbound = outbound, persisted = persisted, tokenRequests = tokenRequests)
  
    __obj.asInstanceOf[Stats]
  }
}

