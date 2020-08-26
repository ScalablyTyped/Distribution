package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polyline
  extends HasZM
     with Geometry {
  var paths: js.Array[js.Array[Position]] = js.native
}

object Polyline {
  @scala.inline
  def apply(paths: js.Array[js.Array[Position]]): Polyline = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polyline]
  }
  @scala.inline
  implicit class PolylineOps[Self <: Polyline] (val x: Self) extends AnyVal {
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
    def setPathsVarargs(value: js.Array[Position]*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Array[js.Array[Position]]): Self = this.set("paths", value.asInstanceOf[js.Any])
  }
  
}

