package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BezierCurve extends JsonCurve {
  var b: js.Tuple3[Position, Position2D, Position2D]
}

object BezierCurve {
  @scala.inline
  def apply(b: js.Tuple3[Position, Position2D, Position2D]): BezierCurve = {
    val __obj = js.Dynamic.literal(b = b)
  
    __obj.asInstanceOf[BezierCurve]
  }
}

