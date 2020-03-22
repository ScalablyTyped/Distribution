package typings.antDesignIcons.componentsIconMod

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SVGProps
import typings.std.HTMLElement
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconComponentProps extends IconBaseProps {
  var ariaLabel: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[ComponentType[CustomIconComponentProps | SVGProps[SVGSVGElement]]] = js.undefined
  var viewBox: js.UndefOr[String] = js.undefined
}

object IconComponentProps {
  @scala.inline
  def apply(
    ariaLabel: String = null,
    className: String = null,
    component: ComponentType[CustomIconComponentProps | SVGProps[SVGSVGElement]] = null,
    onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLElement] => Unit = null,
    role: String = null,
    rotate: Int | Double = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    title: String = null,
    viewBox: String = null
  ): IconComponentProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconComponentProps]
  }
}

