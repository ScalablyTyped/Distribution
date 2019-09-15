package typings.antd.libBackDashTopMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackTopProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var target: js.UndefOr[js.Function0[HTMLElement | Window]] = js.undefined
  var visibilityHeight: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object BackTopProps {
  @scala.inline
  def apply(
    className: String = null,
    onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    target: () => HTMLElement | Window = null,
    visibilityHeight: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): BackTopProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (target != null) __obj.updateDynamic("target")(js.Any.fromFunction0(target))
    if (visibilityHeight != null) __obj.updateDynamic("visibilityHeight")(visibilityHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[BackTopProps]
  }
}

