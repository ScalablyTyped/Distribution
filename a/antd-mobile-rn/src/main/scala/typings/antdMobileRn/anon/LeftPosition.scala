package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeftPosition extends js.Object {
  var left: Double
  var position: String
  var top: Double
}

object LeftPosition {
  @scala.inline
  def apply(left: Double, position: String, top: Double): LeftPosition = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftPosition]
  }
}

