package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsConnectionTypes extends js.Object {
  var all: StatsResourceCount
  var plain: StatsResourceCount
  var tls: StatsResourceCount
}

object StatsConnectionTypes {
  @scala.inline
  def apply(all: StatsResourceCount, plain: StatsResourceCount, tls: StatsResourceCount): StatsConnectionTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("plain")(plain)
    __obj.updateDynamic("tls")(tls)
    __obj.asInstanceOf[StatsConnectionTypes]
  }
}

