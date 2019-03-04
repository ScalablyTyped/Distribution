package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsResourceCount extends js.Object {
  var mean: scala.Double
  var min: scala.Double
  var opened: scala.Double
  var peak: scala.Double
  var refused: scala.Double
}

object StatsResourceCount {
  @scala.inline
  def apply(
    mean: scala.Double,
    min: scala.Double,
    opened: scala.Double,
    peak: scala.Double,
    refused: scala.Double
  ): StatsResourceCount = {
    val __obj = js.Dynamic.literal(mean = mean, min = min, opened = opened, peak = peak, refused = refused)
  
    __obj.asInstanceOf[StatsResourceCount]
  }
}

