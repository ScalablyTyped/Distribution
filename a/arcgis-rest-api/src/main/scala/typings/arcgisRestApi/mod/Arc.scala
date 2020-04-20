package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arc extends JsonCurve {
  var a: js.Tuple7[Position, Position2D, Double, Double, Double, Double, Double]
}

object Arc {
  @scala.inline
  def apply(a: js.Tuple7[Position, Position2D, Double, Double, Double, Double, Double]): Arc = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
}

