package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircularArc extends JsonCurve {
  var c: js.Tuple2[Position, Position2D] = js.native
}

object CircularArc {
  @scala.inline
  def apply(c: js.Tuple2[Position, Position2D]): CircularArc = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularArc]
  }
  @scala.inline
  implicit class CircularArcOps[Self <: CircularArc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setC(value: js.Tuple2[Position, Position2D]): Self = this.set("c", value.asInstanceOf[js.Any])
  }
  
}

