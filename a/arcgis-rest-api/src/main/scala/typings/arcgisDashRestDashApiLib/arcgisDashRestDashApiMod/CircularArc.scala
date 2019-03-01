package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircularArc extends JsonCurve {
  var c: js.Tuple2[Position, Position2D]
}

object CircularArc {
  @scala.inline
  def apply(c: js.Tuple2[Position, Position2D]): CircularArc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("c")(c)
    __obj.asInstanceOf[CircularArc]
  }
}

