package typings.antvScale.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ticks extends js.Object {
  var max: Double
  var min: Double
  var ticks: js.Array[_]
}

object Ticks {
  @scala.inline
  def apply(max: Double, min: Double, ticks: js.Array[_]): Ticks = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ticks]
  }
}

