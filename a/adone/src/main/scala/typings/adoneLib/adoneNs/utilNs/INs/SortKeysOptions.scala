package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortKeysOptions extends js.Object {
  var compare: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]] = js.undefined
  var deep: js.UndefOr[scala.Boolean] = js.undefined
}

object SortKeysOptions {
  @scala.inline
  def apply(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double] = null,
    deep: js.UndefOr[scala.Boolean] = js.undefined
  ): SortKeysOptions = {
    val __obj = js.Dynamic.literal()
    if (compare != null) __obj.updateDynamic("compare")(compare)
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    __obj.asInstanceOf[SortKeysOptions]
  }
}

