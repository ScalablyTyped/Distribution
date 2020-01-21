package typings.airbnbPropTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGt extends js.Object {
  var gt: js.UndefOr[Double] = js.undefined
  var gte: js.UndefOr[Double] = js.undefined
  var lt: js.UndefOr[Double] = js.undefined
  var lte: js.UndefOr[Double] = js.undefined
}

object AnonGt {
  @scala.inline
  def apply(
    gt: Int | Double = null,
    gte: Int | Double = null,
    lt: Int | Double = null,
    lte: Int | Double = null
  ): AnonGt = {
    val __obj = js.Dynamic.literal()
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (gte != null) __obj.updateDynamic("gte")(gte.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (lte != null) __obj.updateDynamic("lte")(lte.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGt]
  }
}

