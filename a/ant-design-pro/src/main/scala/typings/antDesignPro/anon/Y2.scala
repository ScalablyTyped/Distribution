package typings.antDesignPro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Y2 extends js.Object {
  var y1: String
  var y2: js.UndefOr[String] = js.undefined
}

object Y2 {
  @scala.inline
  def apply(y1: String, y2: String = null): Y2 = {
    val __obj = js.Dynamic.literal(y1 = y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y2]
  }
}

