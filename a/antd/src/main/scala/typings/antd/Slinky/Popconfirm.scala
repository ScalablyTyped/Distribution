package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esButtonButtonMod.ButtonType
import typings.antd.esButtonButtonMod.NativeButtonProps
import typings.antd.esPopconfirmMod.PopconfirmProps
import typings.antd.esPopconfirmMod.default
import typings.antd.esTooltipMod.TooltipAlignConfig
import typings.antd.esTooltipMod.TooltipPlacement
import typings.antd.esTooltipMod.TooltipTrigger
import typings.antd.esTooltipPlacementsMod.AdjustOverflow
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, style, className, disabled */
object Popconfirm
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esPopconfirmMod.default].asInstanceOf[String | js.Object]
  def apply(
    title: TagMod[Any],
    align: TooltipAlignConfig = null,
    arrowPointAtCenter: js.UndefOr[Boolean] = js.undefined,
    autoAdjustOverflow: Boolean | AdjustOverflow = null,
    builtinPlacements: js.Object = null,
    cancelButtonProps: NativeButtonProps = null,
    cancelText: TagMod[Any] = null,
    defaultVisible: js.UndefOr[Boolean] = js.undefined,
    destroyTooltipOnHide: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    getTooltipContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    icon: TagMod[Any] = null,
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
    okButtonProps: NativeButtonProps = null,
    okText: TagMod[Any] = null,
    okType: ButtonType = null,
    onCancel: /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]] => Unit = null,
    onConfirm: /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]] => Unit = null,
    onVisibleChange: /* visible */ Boolean => Unit = null,
    onVisibleChange_PopconfirmProps: (/* visible */ Boolean, /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]]) => Unit = null,
    openClassName: String = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: TooltipPlacement = null,
    prefixCls: String = null,
    transitionName: String = null,
    trigger: TooltipTrigger = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(title = title)
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(arrowPointAtCenter)) __obj.updateDynamic("arrowPointAtCenter")(arrowPointAtCenter)
    if (autoAdjustOverflow != null) __obj.updateDynamic("autoAdjustOverflow")(autoAdjustOverflow.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements)
    if (cancelButtonProps != null) __obj.updateDynamic("cancelButtonProps")(cancelButtonProps)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText)
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (!js.isUndefined(destroyTooltipOnHide)) __obj.updateDynamic("destroyTooltipOnHide")(destroyTooltipOnHide)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (getTooltipContainer != null) __obj.updateDynamic("getTooltipContainer")(js.Any.fromFunction1(getTooltipContainer))
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (okButtonProps != null) __obj.updateDynamic("okButtonProps")(okButtonProps)
    if (okText != null) __obj.updateDynamic("okText")(okText)
    if (okType != null) __obj.updateDynamic("okType")(okType)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction1(onConfirm))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (onVisibleChange_PopconfirmProps != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction2(onVisibleChange_PopconfirmProps))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PopconfirmProps
}

