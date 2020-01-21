package typings.antDesignPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonY1 extends js.Object {
  var y1: String
  var y2: js.UndefOr[String] = js.undefined
}

object AnonY1 {
  @scala.inline
  def apply(y1: String, y2: String = null): AnonY1 = {
    val __obj = js.Dynamic.literal(y1 = y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonY1]
  }
}

