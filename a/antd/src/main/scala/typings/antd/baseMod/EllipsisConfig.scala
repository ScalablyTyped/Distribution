package typings.antd.baseMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipsisConfig extends js.Object {
  var expandable: js.UndefOr[Boolean] = js.undefined
  var onEllipsis: js.UndefOr[js.Function1[/* ellipsis */ Boolean, Unit]] = js.undefined
  var onExpand: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
}

object EllipsisConfig {
  @scala.inline
  def apply(
    expandable: js.UndefOr[Boolean] = js.undefined,
    onEllipsis: /* ellipsis */ Boolean => Unit = null,
    onExpand: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    rows: js.UndefOr[Double] = js.undefined,
    suffix: String = null
  ): EllipsisConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.get.asInstanceOf[js.Any])
    if (onEllipsis != null) __obj.updateDynamic("onEllipsis")(js.Any.fromFunction1(onEllipsis))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1(onExpand))
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipsisConfig]
  }
}

