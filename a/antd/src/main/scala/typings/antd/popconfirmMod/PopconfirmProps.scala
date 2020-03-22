package typings.antd.popconfirmMod

import typings.antd.buttonButtonMod.ButtonType
import typings.antd.buttonButtonMod.NativeButtonProps
import typings.antd.placementsMod.AdjustOverflow
import typings.antd.tooltipMod.AbstractTooltipProps
import typings.antd.tooltipMod.TooltipPlacement
import typings.rcTrigger.interfaceMod.ActionType
import typings.rcTrigger.interfaceMod.AlignType
import typings.rcTrigger.interfaceMod.BuildInPlacements
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopconfirmProps extends AbstractTooltipProps {
  var cancelButtonProps: js.UndefOr[NativeButtonProps] = js.undefined
  var cancelText: js.UndefOr[ReactNode] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var okButtonProps: js.UndefOr[NativeButtonProps] = js.undefined
  var okText: js.UndefOr[ReactNode] = js.undefined
  var okType: js.UndefOr[ButtonType] = js.undefined
  var onCancel: js.UndefOr[
    js.Function1[/* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], Unit]
  ] = js.undefined
  var onConfirm: js.UndefOr[
    js.Function1[/* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], Unit]
  ] = js.undefined
  @JSName("onVisibleChange")
  var onVisibleChange_PopconfirmProps: js.UndefOr[
    js.Function2[
      /* visible */ Boolean, 
      /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      Unit
    ]
  ] = js.undefined
  var title: ReactNode
}

object PopconfirmProps {
  @scala.inline
  def apply(
    align: AlignType = null,
    arrowPointAtCenter: js.UndefOr[Boolean] = js.undefined,
    autoAdjustOverflow: Boolean | AdjustOverflow = null,
    builtinPlacements: BuildInPlacements = null,
    cancelButtonProps: NativeButtonProps = null,
    cancelText: ReactNode = null,
    children: ReactNode = null,
    className: String = null,
    defaultVisible: js.UndefOr[Boolean] = js.undefined,
    destroyTooltipOnHide: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    getTooltipContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    icon: ReactNode = null,
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
    okButtonProps: NativeButtonProps = null,
    okText: ReactNode = null,
    okType: ButtonType = null,
    onCancel: /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]] => Unit = null,
    onConfirm: /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]] => Unit = null,
    onVisibleChange: (/* visible */ Boolean, /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]]) => Unit = null,
    openClassName: String = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: TooltipPlacement = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    title: ReactNode = null,
    transitionName: String = null,
    trigger: ActionType = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PopconfirmProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowPointAtCenter)) __obj.updateDynamic("arrowPointAtCenter")(arrowPointAtCenter.asInstanceOf[js.Any])
    if (autoAdjustOverflow != null) __obj.updateDynamic("autoAdjustOverflow")(autoAdjustOverflow.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (cancelButtonProps != null) __obj.updateDynamic("cancelButtonProps")(cancelButtonProps.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyTooltipOnHide)) __obj.updateDynamic("destroyTooltipOnHide")(destroyTooltipOnHide.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (getTooltipContainer != null) __obj.updateDynamic("getTooltipContainer")(js.Any.fromFunction1(getTooltipContainer))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (okButtonProps != null) __obj.updateDynamic("okButtonProps")(okButtonProps.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (okType != null) __obj.updateDynamic("okType")(okType.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction1(onConfirm))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction2(onVisibleChange))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopconfirmProps]
  }
}

