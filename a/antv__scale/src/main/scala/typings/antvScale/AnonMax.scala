package typings.antvScale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  var max: Double
  var min: Double
  var ticks: js.Array[Double]
}

object AnonMax {
  @scala.inline
  def apply(max: Double, min: Double, ticks: js.Array[Double]): AnonMax = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMax]
  }
}

