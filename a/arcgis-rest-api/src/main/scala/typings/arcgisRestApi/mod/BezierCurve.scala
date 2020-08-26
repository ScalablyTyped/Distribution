package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BezierCurve extends JsonCurve {
  var b: js.Tuple3[Position, Position2D, Position2D] = js.native
}

object BezierCurve {
  @scala.inline
  def apply(b: js.Tuple3[Position, Position2D, Position2D]): BezierCurve = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[BezierCurve]
  }
  @scala.inline
  implicit class BezierCurveOps[Self <: BezierCurve] (val x: Self) extends AnyVal {
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
    def setB(value: js.Tuple3[Position, Position2D, Position2D]): Self = this.set("b", value.asInstanceOf[js.Any])
  }
  
}

