package typings.antd.backTopMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.Document_
import typings.std.HTMLElement
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackTopProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var target: js.UndefOr[js.Function0[HTMLElement | Window_ | Document_]] = js.undefined
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
    target: () => HTMLElement | Window_ | Document_ = null,
    visibilityHeight: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): BackTopProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(js.Any.fromFunction0(target))
    if (visibilityHeight != null) __obj.updateDynamic("visibilityHeight")(visibilityHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackTopProps]
  }
}

