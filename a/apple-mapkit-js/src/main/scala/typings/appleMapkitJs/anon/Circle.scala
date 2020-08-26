package typings.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Circle extends js.Object {
  val Circle: String = js.native
  val Rectangle: String = js.native
}

object Circle {
  @scala.inline
  def apply(Circle: String, Rectangle: String): Circle = {
    val __obj = js.Dynamic.literal(Circle = Circle.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
  @scala.inline
  implicit class CircleOps[Self <: Circle] (val x: Self) extends AnyVal {
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
    def setCircle(value: String): Self = this.set("Circle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRectangle(value: String): Self = this.set("Rectangle", value.asInstanceOf[js.Any])
  }
  
}

