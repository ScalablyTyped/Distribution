package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multipoint
  extends HasZM
     with Geometry {
  var points: js.Array[Position] = js.native
}

object Multipoint {
  @scala.inline
  def apply(points: js.Array[Position]): Multipoint = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multipoint]
  }
  @scala.inline
  implicit class MultipointOps[Self <: Multipoint] (val x: Self) extends AnyVal {
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
    def setPointsVarargs(value: Position*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[Position]): Self = this.set("points", value.asInstanceOf[js.Any])
  }
  
}

