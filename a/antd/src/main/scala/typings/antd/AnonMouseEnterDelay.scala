package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMouseEnterDelay extends js.Object {
  var mouseEnterDelay: Double
  var mouseLeaveDelay: Double
}

object AnonMouseEnterDelay {
  @scala.inline
  def apply(mouseEnterDelay: Double, mouseLeaveDelay: Double): AnonMouseEnterDelay = {
    val __obj = js.Dynamic.literal(mouseEnterDelay = mouseEnterDelay.asInstanceOf[js.Any], mouseLeaveDelay = mouseLeaveDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMouseEnterDelay]
  }
}

