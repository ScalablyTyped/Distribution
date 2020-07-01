package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  var shape: String
  var size: String
}

object Shape {
  @scala.inline
  def apply(shape: String, size: String): Shape = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
}

