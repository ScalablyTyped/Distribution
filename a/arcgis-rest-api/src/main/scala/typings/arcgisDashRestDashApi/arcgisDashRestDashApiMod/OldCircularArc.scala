package typings.arcgisDashRestDashApi.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OldCircularArc extends JsonCurve {
  var a: js.Tuple4[Position, Position2D, Double, Double]
}

object OldCircularArc {
  @scala.inline
  def apply(a: js.Tuple4[Position, Position2D, Double, Double]): OldCircularArc = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OldCircularArc]
  }
}

