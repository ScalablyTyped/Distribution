package typings
package ablyLib.ablyMod.TypesNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("realtime")(realtime)
    __obj.updateDynamic("rest")(rest)
    __obj.updateDynamic("webhook")(webhook)
    __obj.asInstanceOf[StatsMessageTraffic]
  }
}

