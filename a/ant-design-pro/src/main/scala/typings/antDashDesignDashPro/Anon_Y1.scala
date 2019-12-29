package typings.antDashDesignDashPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Y1 extends js.Object {
  var y1: String
  var y2: js.UndefOr[String] = js.undefined
}

object Anon_Y1 {
  @scala.inline
  def apply(y1: String, y2: String = null): Anon_Y1 = {
    val __obj = js.Dynamic.literal(y1 = y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Y1]
  }
}

