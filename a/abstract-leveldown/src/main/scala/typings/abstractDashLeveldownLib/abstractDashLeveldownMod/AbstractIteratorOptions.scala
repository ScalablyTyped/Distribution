package typings
package abstractDashLeveldownLib.abstractDashLeveldownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractIteratorOptions[K] extends AbstractOptions {
  var gt: js.UndefOr[K] = js.undefined
  var gte: js.UndefOr[K] = js.undefined
  var keyAsBuffer: js.UndefOr[scala.Boolean] = js.undefined
  var keys: js.UndefOr[scala.Boolean] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var lt: js.UndefOr[K] = js.undefined
  var lte: js.UndefOr[K] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var valueAsBuffer: js.UndefOr[scala.Boolean] = js.undefined
  var values: js.UndefOr[scala.Boolean] = js.undefined
}

object AbstractIteratorOptions {
  @scala.inline
  def apply[K](
    gt: K = null,
    gte: K = null,
    keyAsBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    keys: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null,
    lt: K = null,
    lte: K = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    valueAsBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    values: js.UndefOr[scala.Boolean] = js.undefined
  ): AbstractIteratorOptions[K] = {
    val __obj = js.Dynamic.literal()
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (gte != null) __obj.updateDynamic("gte")(gte.asInstanceOf[js.Any])
    if (!js.isUndefined(keyAsBuffer)) __obj.updateDynamic("keyAsBuffer")(keyAsBuffer)
    if (!js.isUndefined(keys)) __obj.updateDynamic("keys")(keys)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (lte != null) __obj.updateDynamic("lte")(lte.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(valueAsBuffer)) __obj.updateDynamic("valueAsBuffer")(valueAsBuffer)
    if (!js.isUndefined(values)) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[AbstractIteratorOptions[K]]
  }
}

