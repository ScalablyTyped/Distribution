package typings.antDesignIcons.iconFontMod

import typings.antDesignIcons.iconMod.IconBaseProps
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconFontProps extends IconBaseProps {
  var `type`: String
}

object IconFontProps {
  @scala.inline
  def apply(
    `type`: String,
    className: String = null,
    onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLElement] => Unit = null,
    role: String = null,
    rotate: Int | Double = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    title: String = null
  ): IconFontProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconFontProps]
  }
}

