package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsRequestCount extends js.Object {
  var failed: scala.Double
  var refused: scala.Double
  var succeeded: scala.Double
}

object StatsRequestCount {
  @scala.inline
  def apply(failed: scala.Double, refused: scala.Double, succeeded: scala.Double): StatsRequestCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("refused")(refused)
    __obj.updateDynamic("succeeded")(succeeded)
    __obj.asInstanceOf[StatsRequestCount]
  }
}

