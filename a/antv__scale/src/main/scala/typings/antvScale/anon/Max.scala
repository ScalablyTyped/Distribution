package typings.antvScale.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Max extends js.Object {
  var max: Double
  var min: Double
  var ticks: js.Array[Double]
}

object Max {
  @scala.inline
  def apply(max: Double, min: Double, ticks: js.Array[Double]): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
}

