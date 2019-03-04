package typings
package antdLib.libTypographyBaseMod

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
    onExpand: js.Function0[scala.Unit] = null,
    rows: scala.Int | scala.Double = null
  ): EllipsisConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable)
    if (onExpand != null) __obj.updateDynamic("onExpand")(onExpand)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipsisConfig]
  }
}

