package typings
package antdLib.libTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractTooltipProps extends js.Object {
  var align: js.UndefOr[TooltipAlignConfig] = js.undefined
  var arrowPointAtCenter: js.UndefOr[scala.Boolean] = js.undefined
  var autoAdjustOverflow: js.UndefOr[scala.Boolean | antdLib.libTooltipPlacementsMod.AdjustOverflow] = js.undefined
  var builtinPlacements: js.UndefOr[js.Object] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var getPopupContainer: js.UndefOr[
    js.Function1[/* triggerNode */ js.UndefOr[stdLib.HTMLElement], stdLib.HTMLElement]
  ] = js.undefined
  var getTooltipContainer: js.UndefOr[js.Function1[/* triggerNode */ stdLib.Element, stdLib.HTMLElement]] = js.undefined
  var mouseEnterDelay: js.UndefOr[scala.Double] = js.undefined
  var mouseLeaveDelay: js.UndefOr[scala.Double] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ scala.Boolean, scala.Unit]] = js.undefined
  var openClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlayClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlayStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var placement: js.UndefOr[TooltipPlacement] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  var trigger: js.UndefOr[TooltipTrigger] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object AbstractTooltipProps {
  @scala.inline
  def apply(
    align: TooltipAlignConfig = null,
    arrowPointAtCenter: js.UndefOr[scala.Boolean] = js.undefined,
    autoAdjustOverflow: scala.Boolean | antdLib.libTooltipPlacementsMod.AdjustOverflow = null,
    builtinPlacements: js.Object = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ js.UndefOr[stdLib.HTMLElement] => stdLib.HTMLElement = null,
    getTooltipContainer: /* triggerNode */ stdLib.Element => stdLib.HTMLElement = null,
    mouseEnterDelay: scala.Int | scala.Double = null,
    mouseLeaveDelay: scala.Int | scala.Double = null,
    onVisibleChange: /* visible */ scala.Boolean => scala.Unit = null,
    openClassName: java.lang.String = null,
    overlayClassName: java.lang.String = null,
    overlayStyle: reactLib.reactMod.CSSProperties = null,
    placement: TooltipPlacement = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    transitionName: java.lang.String = null,
    trigger: TooltipTrigger = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): AbstractTooltipProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(arrowPointAtCenter)) __obj.updateDynamic("arrowPointAtCenter")(arrowPointAtCenter)
    if (autoAdjustOverflow != null) __obj.updateDynamic("autoAdjustOverflow")(autoAdjustOverflow.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (getTooltipContainer != null) __obj.updateDynamic("getTooltipContainer")(js.Any.fromFunction1(getTooltipContainer))
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[AbstractTooltipProps]
  }
}

