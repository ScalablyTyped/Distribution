package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arc extends JsonCurve {
  var a: js.Tuple7[Position, Position2D, Double, Double, Double, Double, Double] = js.native
}

object Arc {
  @scala.inline
  def apply(a: js.Tuple7[Position, Position2D, Double, Double, Double, Double, Double]): Arc = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
  @scala.inline
  implicit class ArcOps[Self <: Arc] (val x: Self) extends AnyVal {
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
    def setA(value: js.Tuple7[Position, Position2D, Double, Double, Double, Double, Double]): Self = this.set("a", value.asInstanceOf[js.Any])
  }
  
}

