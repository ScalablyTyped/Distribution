package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a 2-dimensional point using the Cartesian coordinate system. */
@js.native
trait Point extends js.Object {
  /** specifies the x-coordinate. */
  var X: Double = js.native
  /** specifies the y-coordinate. */
  var Y: Double = js.native
}

object Point {
  @scala.inline
  def apply(X: Double, Y: Double): Point = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
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
    def setX(value: Double): Self = this.set("X", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("Y", value.asInstanceOf[js.Any])
  }
  
}

