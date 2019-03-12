package typings
package antdLib.libTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends AbstractTooltipProps {
  var overlay: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | RenderFunction] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | RenderFunction] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    align: TooltipAlignConfig = null,
    arrowPointAtCenter: js.UndefOr[scala.Boolean] = js.undefined,
    autoAdjustOverflow: scala.Boolean | antdLib.libTooltipPlacementsMod.AdjustOverflow = null,
    builtinPlacements: js.Object = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ js.UndefOr[stdLib.HTMLElement] => stdLib.HTMLElement = null,
    getTooltipContainer: /* triggerNode */ stdLib.Element => stdLib.HTMLElement = null,
    mouseEnterDelay: scala.Int | scala.Double = null,
    mouseLeaveDelay: scala.Int | scala.Double = null,
    onVisibleChange: /* visible */ scala.Boolean => scala.Unit = null,
    openClassName: java.lang.String = null,
    overlay: reactLib.reactMod.ReactNs.ReactNode | RenderFunction = null,
    overlayClassName: java.lang.String = null,
    overlayStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    placement: TooltipPlacement = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    title: reactLib.reactMod.ReactNs.ReactNode | RenderFunction = null,
    transitionName: java.lang.String = null,
    trigger: TooltipTrigger = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(arrowPointAtCenter)) __obj.updateDynamic("arrowPointAtCenter")(arrowPointAtCenter)
    if (autoAdjustOverflow != null) __obj.updateDynamic("autoAdjustOverflow")(autoAdjustOverflow.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (getTooltipContainer != null) __obj.updateDynamic("getTooltipContainer")(js.Any.fromFunction1(getTooltipContainer))
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName)
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[TooltipProps]
  }
}

