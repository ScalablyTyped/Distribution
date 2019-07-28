package typings.adone.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortKeysOptions extends js.Object {
  var compare: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.undefined
  var deep: js.UndefOr[Boolean] = js.undefined
}

object SortKeysOptions {
  @scala.inline
  def apply(
    compare: (/* a */ js.Any, /* b */ js.Any) => Double = null,
    deep: js.UndefOr[Boolean] = js.undefined
  ): SortKeysOptions = {
    val __obj = js.Dynamic.literal()
    if (compare != null) __obj.updateDynamic("compare")(js.Any.fromFunction2(compare))
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    __obj.asInstanceOf[SortKeysOptions]
  }
}

