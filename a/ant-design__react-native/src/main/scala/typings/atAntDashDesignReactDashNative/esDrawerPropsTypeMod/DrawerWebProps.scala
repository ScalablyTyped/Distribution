package typings.atAntDashDesignReactDashNative.esDrawerPropsTypeMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.bottom
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.left
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.right
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.top
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerWebProps extends DrawerProps {
  var className: js.UndefOr[String] = js.undefined
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  var docked: js.UndefOr[Boolean] = js.undefined
  var dragHandleStyle: js.UndefOr[CSSProperties] = js.undefined
  var dragToggleDistance: js.UndefOr[Double] = js.undefined
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var sidebarStyle: js.UndefOr[CSSProperties] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var touch: js.UndefOr[Boolean] = js.undefined
  var transitions: js.UndefOr[Boolean] = js.undefined
}

object DrawerWebProps {
  @scala.inline
  def apply(
    className: String = null,
    contentStyle: CSSProperties = null,
    docked: js.UndefOr[Boolean] = js.undefined,
    dragHandleStyle: CSSProperties = null,
    dragToggleDistance: Int | Double = null,
    onOpenChange: /* isOpen */ Boolean => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    overlayStyle: CSSProperties = null,
    position: left | right | top | bottom = null,
    prefixCls: String = null,
    sidebar: ReactNode = null,
    sidebarStyle: CSSProperties = null,
    style: CSSProperties = null,
    touch: js.UndefOr[Boolean] = js.undefined,
    transitions: js.UndefOr[Boolean] = js.undefined
  ): DrawerWebProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (!js.isUndefined(docked)) __obj.updateDynamic("docked")(docked)
    if (dragHandleStyle != null) __obj.updateDynamic("dragHandleStyle")(dragHandleStyle)
    if (dragToggleDistance != null) __obj.updateDynamic("dragToggleDistance")(dragToggleDistance.asInstanceOf[js.Any])
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.asInstanceOf[js.Any])
    if (sidebarStyle != null) __obj.updateDynamic("sidebarStyle")(sidebarStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch)
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions)
    __obj.asInstanceOf[DrawerWebProps]
  }
}

