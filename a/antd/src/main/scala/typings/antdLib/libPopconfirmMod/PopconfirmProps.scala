package typings
package antdLib.libPopconfirmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopconfirmProps
  extends antdLib.libTooltipMod.AbstractTooltipProps {
  var cancelButtonProps: js.UndefOr[antdLib.libButtonButtonMod.NativeButtonProps] = js.undefined
  var cancelText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var okButtonProps: js.UndefOr[antdLib.libButtonButtonMod.NativeButtonProps] = js.undefined
  var okText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var okType: js.UndefOr[antdLib.libButtonButtonMod.ButtonType] = js.undefined
  var onCancel: js.UndefOr[
    js.Function1[
      /* e */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent]], 
      scala.Unit
    ]
  ] = js.undefined
  var onConfirm: js.UndefOr[
    js.Function1[
      /* e */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent]], 
      scala.Unit
    ]
  ] = js.undefined
  @JSName("onVisibleChange")
  var onVisibleChange_PopconfirmProps: js.UndefOr[
    js.Function2[
      /* visible */ scala.Boolean, 
      /* e */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent]], 
      scala.Unit
    ]
  ] = js.undefined
  var title: reactLib.reactMod.ReactNs.ReactNode
}

object PopconfirmProps {
  @scala.inline
  def apply(
    title: reactLib.reactMod.ReactNs.ReactNode,
    align: antdLib.libTooltipMod.TooltipAlignConfig = null,
    arrowPointAtCenter: js.UndefOr[scala.Boolean] = js.undefined,
    autoAdjustOverflow: scala.Boolean | antdLib.libTooltipPlacementsMod.AdjustOverflow = null,
    builtinPlacements: js.Object = null,
    cancelButtonProps: antdLib.libButtonButtonMod.NativeButtonProps = null,
    cancelText: reactLib.reactMod.ReactNs.ReactNode = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ js.UndefOr[stdLib.HTMLElement] => stdLib.HTMLElement = null,
    getTooltipContainer: /* triggerNode */ stdLib.Element => stdLib.HTMLElement = null,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    mouseEnterDelay: scala.Int | scala.Double = null,
    mouseLeaveDelay: scala.Int | scala.Double = null,
    okButtonProps: antdLib.libButtonButtonMod.NativeButtonProps = null,
    okText: reactLib.reactMod.ReactNs.ReactNode = null,
    okType: antdLib.libButtonButtonMod.ButtonType = null,
    onCancel: /* e */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent]] => scala.Unit = null,
    onConfirm: /* e */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent]] => scala.Unit = null,
    onVisibleChange: (/* visible */ scala.Boolean, /* e */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[_, reactLib.NativeMouseEvent]]) => scala.Unit = null,
    openClassName: java.lang.String = null,
    overlayClassName: java.lang.String = null,
    overlayStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    placement: antdLib.libTooltipMod.TooltipPlacement = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    transitionName: java.lang.String = null,
    trigger: antdLib.libTooltipMod.TooltipTrigger = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): PopconfirmProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(arrowPointAtCenter)) __obj.updateDynamic("arrowPointAtCenter")(arrowPointAtCenter)
    if (autoAdjustOverflow != null) __obj.updateDynamic("autoAdjustOverflow")(autoAdjustOverflow.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements)
    if (cancelButtonProps != null) __obj.updateDynamic("cancelButtonProps")(cancelButtonProps)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (getTooltipContainer != null) __obj.updateDynamic("getTooltipContainer")(js.Any.fromFunction1(getTooltipContainer))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (okButtonProps != null) __obj.updateDynamic("okButtonProps")(okButtonProps)
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (okType != null) __obj.updateDynamic("okType")(okType)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction1(onConfirm))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction2(onVisibleChange))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[PopconfirmProps]
  }
}

