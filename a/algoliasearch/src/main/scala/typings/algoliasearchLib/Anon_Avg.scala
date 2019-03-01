package typings
package algoliasearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Avg extends js.Object {
  var avg: scala.Double
  var max: scala.Double
  var min: scala.Double
  var sum: scala.Double
}

object Anon_Avg {
  @scala.inline
  def apply(avg: scala.Double, max: scala.Double, min: scala.Double, sum: scala.Double): Anon_Avg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avg")(avg)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("sum")(sum)
    __obj.asInstanceOf[Anon_Avg]
  }
}

