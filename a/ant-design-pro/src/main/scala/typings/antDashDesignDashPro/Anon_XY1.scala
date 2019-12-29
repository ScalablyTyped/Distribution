package typings.antDashDesignDashPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XY1 extends js.Object {
  var x: Double
  var y1: Double
  var y2: js.UndefOr[Double] = js.undefined
}

object Anon_XY1 {
  @scala.inline
  def apply(x: Double, y1: Double, y2: Int | Double = null): Anon_XY1 = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_XY1]
  }
}

