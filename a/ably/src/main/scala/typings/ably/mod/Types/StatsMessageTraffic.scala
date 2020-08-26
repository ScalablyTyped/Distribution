package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsMessageTraffic extends js.Object {
  var all: StatsMessageTypes = js.native
  var realtime: StatsMessageTypes = js.native
  var rest: StatsMessageTypes = js.native
  var webhook: StatsMessageTypes = js.native
}

object StatsMessageTraffic {
  @scala.inline
  def apply(
    all: StatsMessageTypes,
    realtime: StatsMessageTypes,
    rest: StatsMessageTypes,
    webhook: StatsMessageTypes
  ): StatsMessageTraffic = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], realtime = realtime.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsMessageTraffic]
  }
  @scala.inline
  implicit class StatsMessageTrafficOps[Self <: StatsMessageTraffic] (val x: Self) extends AnyVal {
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
    def setRealtime(value: StatsMessageTypes): Self = this.set("realtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setRest(value: StatsMessageTypes): Self = this.set("rest", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebhook(value: StatsMessageTypes): Self = this.set("webhook", value.asInstanceOf[js.Any])
  }
  
}

