package typings
package antdDashMobileDashRnLib.libDrawerPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerWebProps extends DrawerProps {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var contentStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var docked: js.UndefOr[scala.Boolean] = js.undefined
  var dragHandleStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var dragToggleDistance: js.UndefOr[scala.Double] = js.undefined
  var overlayStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var sidebarStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var touch: js.UndefOr[scala.Boolean] = js.undefined
  var transitions: js.UndefOr[scala.Boolean] = js.undefined
}

object DrawerWebProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    contentStyle: reactLib.reactMod.CSSProperties = null,
    docked: js.UndefOr[scala.Boolean] = js.undefined,
    dragHandleStyle: reactLib.reactMod.CSSProperties = null,
    dragToggleDistance: scala.Int | scala.Double = null,
    onOpenChange: /* isOpen */ scala.Boolean => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    overlayStyle: reactLib.reactMod.CSSProperties = null,
    position: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.left | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.right | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.top | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.bottom = null,
    prefixCls: java.lang.String = null,
    sidebar: reactLib.reactMod.ReactNode = null,
    sidebarStyle: reactLib.reactMod.CSSProperties = null,
    style: reactLib.reactMod.CSSProperties = null,
    touch: js.UndefOr[scala.Boolean] = js.undefined,
    transitions: js.UndefOr[scala.Boolean] = js.undefined
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

