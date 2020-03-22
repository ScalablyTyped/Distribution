package typings.antDesignIcons.componentsIconMod

import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconBaseProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  var spin: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object IconBaseProps {
  @scala.inline
  def apply(
    className: String = null,
    onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLElement] => Unit = null,
    role: String = null,
    rotate: Int | Double = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    title: String = null
  ): IconBaseProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconBaseProps]
  }
}

