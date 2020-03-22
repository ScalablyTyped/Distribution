package typings.antvScale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMin extends js.Object {
  var max: Double
  var min: Double
  var ticks: js.Array[_]
}

object AnonMin {
  @scala.inline
  def apply(max: Double, min: Double, ticks: js.Array[_]): AnonMin = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMin]
  }
}

