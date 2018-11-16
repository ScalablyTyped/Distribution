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

