package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var all: StatsMessageTypes = js.native
  var apiRequests: StatsRequestCount = js.native
  var channels: StatsResourceCount = js.native
  var connections: StatsConnectionTypes = js.native
  var inbound: StatsMessageTraffic = js.native
  var intervalId: String = js.native
  var outbound: StatsMessageTraffic = js.native
  var persisted: StatsMessageTypes = js.native
  var tokenRequests: StatsRequestCount = js.native
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
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAll(value: StatsMessageTypes): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiRequests(value: StatsRequestCount): Self = this.set("apiRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannels(value: StatsResourceCount): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnections(value: StatsConnectionTypes): Self = this.set("connections", value.asInstanceOf[js.Any])
    @scala.inline
    def setInbound(value: StatsMessageTraffic): Self = this.set("inbound", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntervalId(value: String): Self = this.set("intervalId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutbound(value: StatsMessageTraffic): Self = this.set("outbound", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersisted(value: StatsMessageTypes): Self = this.set("persisted", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenRequests(value: StatsRequestCount): Self = this.set("tokenRequests", value.asInstanceOf[js.Any])
  }
  
}

