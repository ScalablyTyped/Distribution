package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Left extends js.Object {
  var bottom: Double
  var left: Double
  var position: String
  var right: Double
}

object Left {
  @scala.inline
  def apply(bottom: Double, left: Double, position: String, right: Double): Left = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
}

