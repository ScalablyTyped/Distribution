package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PixelPosition extends js.Object {
  var left: Double
  var top: Double
}

object PixelPosition {
  @scala.inline
  def apply(left: Double, top: Double): PixelPosition = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelPosition]
  }
}

