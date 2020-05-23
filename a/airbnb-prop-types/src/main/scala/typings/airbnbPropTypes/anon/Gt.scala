package typings.airbnbPropTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gt extends js.Object {
  var gt: js.UndefOr[Double] = js.undefined
  var gte: js.UndefOr[Double] = js.undefined
  var lt: js.UndefOr[Double] = js.undefined
  var lte: js.UndefOr[Double] = js.undefined
}

object Gt {
  @scala.inline
  def apply(
    gt: js.UndefOr[Double] = js.undefined,
    gte: js.UndefOr[Double] = js.undefined,
    lt: js.UndefOr[Double] = js.undefined,
    lte: js.UndefOr[Double] = js.undefined
  ): Gt = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gt)) __obj.updateDynamic("gt")(gt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gte)) __obj.updateDynamic("gte")(gte.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lt)) __obj.updateDynamic("lt")(lt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lte)) __obj.updateDynamic("lte")(lte.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gt]
  }
}

