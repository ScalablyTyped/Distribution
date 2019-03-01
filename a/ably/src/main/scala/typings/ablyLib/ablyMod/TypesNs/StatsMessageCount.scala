package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsMessageCount extends js.Object {
  var count: scala.Double
  var data: scala.Double
}

object StatsMessageCount {
  @scala.inline
  def apply(count: scala.Double, data: scala.Double): StatsMessageCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[StatsMessageCount]
  }
}

