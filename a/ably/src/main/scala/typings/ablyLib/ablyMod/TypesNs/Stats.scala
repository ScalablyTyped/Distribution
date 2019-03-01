package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var all: StatsMessageTypes
  var apiRequests: StatsRequestCount
  var channels: StatsResourceCount
  var connections: StatsConnectionTypes
  var inbound: StatsMessageTraffic
  var intervalId: java.lang.String
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
    intervalId: java.lang.String,
    outbound: StatsMessageTraffic,
    persisted: StatsMessageTypes,
    tokenRequests: StatsRequestCount
  ): Stats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("apiRequests")(apiRequests)
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("connections")(connections)
    __obj.updateDynamic("inbound")(inbound)
    __obj.updateDynamic("intervalId")(intervalId)
    __obj.updateDynamic("outbound")(outbound)
    __obj.updateDynamic("persisted")(persisted)
    __obj.updateDynamic("tokenRequests")(tokenRequests)
    __obj.asInstanceOf[Stats]
  }
}

