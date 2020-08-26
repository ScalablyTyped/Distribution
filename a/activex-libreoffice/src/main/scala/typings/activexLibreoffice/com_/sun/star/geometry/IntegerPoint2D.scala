package typings.activexLibreoffice.com_.sun.star.geometry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure defines a two-dimensional point
  *
  * This structure contains x and y integer-valued coordinates of a two-dimensional point.
  * @since OOo 2.0
  */
@js.native
trait IntegerPoint2D extends js.Object {
  var X: Double = js.native
  var Y: Double = js.native
}

object IntegerPoint2D {
  @scala.inline
  def apply(X: Double, Y: Double): IntegerPoint2D = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerPoint2D]
  }
  @scala.inline
  implicit class IntegerPoint2DOps[Self <: IntegerPoint2D] (val x: Self) extends AnyVal {
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

