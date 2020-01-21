package typings.appleMapkitJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCircle extends js.Object {
  val Circle: String
  val Rectangle: String
}

object AnonCircle {
  @scala.inline
  def apply(Circle: String, Rectangle: String): AnonCircle = {
    val __obj = js.Dynamic.literal(Circle = Circle.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCircle]
  }
}

