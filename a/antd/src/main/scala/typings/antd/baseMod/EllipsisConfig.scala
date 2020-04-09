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
  var onExpand: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
}

object EllipsisConfig {
  @scala.inline
  def apply(
    expandable: js.UndefOr[Boolean] = js.undefined,
    onExpand: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    rows: Int | Double = null,
    suffix: String = null
  ): EllipsisConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1(onExpand))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipsisConfig]
  }
}

