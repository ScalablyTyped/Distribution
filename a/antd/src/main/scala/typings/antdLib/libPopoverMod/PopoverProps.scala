package typings
package antdLib.libPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps
  extends antdLib.libTooltipMod.AbstractTooltipProps {
  var content: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    align: antdLib.libTooltipMod.TooltipAlignConfig = null,
    arrowPointAtCenter: js.UndefOr[scala.Boolean] = js.undefined,
    autoAdjustOverflow: scala.Boolean | antdLib.libTooltipPlacementsMod.AdjustOverflow = null,
    builtinPlacements: js.Object = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    content: reactLib.reactMod.ReactNs.ReactNode = null,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    getPopupContainer: js.Function1[/* triggerNode */ js.UndefOr[reactLib.HTMLElement], reactLib.HTMLElement] = null,
    getTooltipContainer: js.Function1[/* triggerNode */ reactLib.Element, reactLib.HTMLElement] = null,
    mouseEnterDelay: scala.Int | scala.Double = null,
    mouseLeaveDelay: scala.Int | scala.Double = null,
    onVisibleChange: js.Function1[/* visible */ scala.Boolean, scala.Unit] = null,
    openClassName: java.lang.String = null,
    overlayClassName: java.lang.String = null,
    overlayStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    placement: antdLib.libTooltipMod.TooltipPlacement = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null,
    transitionName: java.lang.String = null,
    trigger: antdLib.libTooltipMod.TooltipTrigger = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): PopoverProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(arrowPointAtCenter)) __obj.updateDynamic("arrowPointAtCenter")(arrowPointAtCenter)
    if (autoAdjustOverflow != null) __obj.updateDynamic("autoAdjustOverflow")(autoAdjustOverflow.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(getPopupContainer)
    if (getTooltipContainer != null) __obj.updateDynamic("getTooltipContainer")(getTooltipContainer)
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(onVisibleChange)
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[PopoverProps]
  }
}

