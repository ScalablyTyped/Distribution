package typings.antDesignPro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Y1 extends js.Object {
  var x: Double
  var y1: Double
  var y2: js.UndefOr[Double] = js.undefined
}

object Y1 {
  @scala.inline
  def apply(x: Double, y1: Double, y2: js.UndefOr[Double] = js.undefined): Y1 = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    if (!js.isUndefined(y2)) __obj.updateDynamic("y2")(y2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y1]
  }
}

