package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arc extends JsonCurve {
  var a: js.Tuple7[Position, Position2D, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]
}

object Arc {
  @scala.inline
  def apply(
    a: js.Tuple7[Position, Position2D, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]
  ): Arc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("a")(a)
    __obj.asInstanceOf[Arc]
  }
}

