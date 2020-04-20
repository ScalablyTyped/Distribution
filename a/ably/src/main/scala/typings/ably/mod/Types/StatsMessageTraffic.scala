package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsMessageTraffic extends js.Object {
  var all: StatsMessageTypes
  var realtime: StatsMessageTypes
  var rest: StatsMessageTypes
  var webhook: StatsMessageTypes
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
}

