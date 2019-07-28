package typings.atom.atomMod

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
    val __obj = js.Dynamic.literal(left = left, top = top)
  
    __obj.asInstanceOf[PixelPosition]
  }
}

