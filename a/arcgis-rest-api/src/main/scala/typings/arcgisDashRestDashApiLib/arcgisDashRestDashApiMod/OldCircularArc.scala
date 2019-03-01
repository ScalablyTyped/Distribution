package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OldCircularArc extends JsonCurve {
  var a: js.Tuple4[Position, Position2D, scala.Double, scala.Double]
}

object OldCircularArc {
  @scala.inline
  def apply(a: js.Tuple4[Position, Position2D, scala.Double, scala.Double]): OldCircularArc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("a")(a)
    __obj.asInstanceOf[OldCircularArc]
  }
}

