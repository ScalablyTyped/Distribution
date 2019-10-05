package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsResourceCount extends js.Object {
  var mean: Double
  var min: Double
  var opened: Double
  var peak: Double
  var refused: Double
}

object StatsResourceCount {
  @scala.inline
  def apply(mean: Double, min: Double, opened: Double, peak: Double, refused: Double): StatsResourceCount = {
    val __obj = js.Dynamic.literal(mean = mean, min = min, opened = opened, peak = peak, refused = refused)
  
    __obj.asInstanceOf[StatsResourceCount]
  }
}

