package typings.antd.libTypographyBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipsisConfig extends js.Object {
  var expandable: js.UndefOr[Boolean] = js.undefined
  var onExpand: js.UndefOr[js.Function0[Unit]] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
}

object EllipsisConfig {
  @scala.inline
  def apply(
    expandable: js.UndefOr[Boolean] = js.undefined,
    onExpand: () => Unit = null,
    rows: Int | Double = null
  ): EllipsisConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction0(onExpand))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipsisConfig]
  }
}

