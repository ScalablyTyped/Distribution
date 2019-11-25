package typings.arcgisDashRestDashApi.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircularArc extends JsonCurve {
  var c: js.Tuple2[Position, Position2D]
}

object CircularArc {
  @scala.inline
  def apply(c: js.Tuple2[Position, Position2D]): CircularArc = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CircularArc]
  }
}

