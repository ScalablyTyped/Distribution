package typings
package antdLib.esTypographyBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipsisConfig extends js.Object {
  var expandable: js.UndefOr[scala.Boolean] = js.undefined
  var onExpand: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
}

object EllipsisConfig {
  @scala.inline
  def apply(
    expandable: js.UndefOr[scala.Boolean] = js.undefined,
    onExpand: () => scala.Unit = null,
    rows: scala.Int | scala.Double = null
  ): EllipsisConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable)
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction0(onExpand))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipsisConfig]
  }
}

