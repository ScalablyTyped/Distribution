package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a rectangular area by position and size. */
@js.native
trait Rectangle extends js.Object {
  /** specifies the height. */
  var Height: Double = js.native
  /** specifies the width. */
  var Width: Double = js.native
  /** specifies the x-coordinate. */
  var X: Double = js.native
  /** specifies the y-coordinate. */
  var Y: Double = js.native
}

object Rectangle {
  @scala.inline
  def apply(Height: Double, Width: Double, X: Double, Y: Double): Rectangle = {
    val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangle]
  }
  @scala.inline
  implicit class RectangleOps[Self <: Rectangle] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("X", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("Y", value.asInstanceOf[js.Any])
  }
  
}

