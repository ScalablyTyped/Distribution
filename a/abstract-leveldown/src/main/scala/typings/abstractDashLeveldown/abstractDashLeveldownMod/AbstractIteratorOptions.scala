package typings.abstractDashLeveldown.abstractDashLeveldownMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractIteratorOptions[K] extends AbstractOptions {
  var gt: js.UndefOr[K] = js.undefined
  var gte: js.UndefOr[K] = js.undefined
  var keyAsBuffer: js.UndefOr[Boolean] = js.undefined
  var keys: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var lt: js.UndefOr[K] = js.undefined
  var lte: js.UndefOr[K] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var valueAsBuffer: js.UndefOr[Boolean] = js.undefined
  var values: js.UndefOr[Boolean] = js.undefined
}

object AbstractIteratorOptions {
  @scala.inline
  def apply[K](
    StringDictionary: StringDictionary[js.Any] = null,
    gt: K = null,
    gte: K = null,
    keyAsBuffer: js.UndefOr[Boolean] = js.undefined,
    keys: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    lt: K = null,
    lte: K = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    valueAsBuffer: js.UndefOr[Boolean] = js.undefined,
    values: js.UndefOr[Boolean] = js.undefined
  ): AbstractIteratorOptions[K] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (gte != null) __obj.updateDynamic("gte")(gte.asInstanceOf[js.Any])
    if (!js.isUndefined(keyAsBuffer)) __obj.updateDynamic("keyAsBuffer")(keyAsBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(keys)) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (lte != null) __obj.updateDynamic("lte")(lte.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (!js.isUndefined(valueAsBuffer)) __obj.updateDynamic("valueAsBuffer")(valueAsBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(values)) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractIteratorOptions[K]]
  }
}

