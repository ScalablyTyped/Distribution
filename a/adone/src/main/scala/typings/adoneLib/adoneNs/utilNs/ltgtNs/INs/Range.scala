package typings
package adoneLib.adoneNs.utilNs.ltgtNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range[T] extends js.Object {
  var end: js.UndefOr[T] = js.undefined
  var gt: js.UndefOr[T] = js.undefined
  var gte: js.UndefOr[T] = js.undefined
  var lt: js.UndefOr[T] = js.undefined
  var lte: js.UndefOr[T] = js.undefined
  var max: js.UndefOr[T] = js.undefined
  var min: js.UndefOr[T] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var start: js.UndefOr[T] = js.undefined
}

object Range {
  @scala.inline
  def apply[T](
    end: T = null,
    gt: T = null,
    gte: T = null,
    lt: T = null,
    lte: T = null,
    max: T = null,
    min: T = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    start: T = null
  ): Range[T] = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (gte != null) __obj.updateDynamic("gte")(gte.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (lte != null) __obj.updateDynamic("lte")(lte.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range[T]]
  }
}

