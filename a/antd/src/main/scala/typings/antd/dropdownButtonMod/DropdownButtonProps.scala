package typings.antd.dropdownButtonMod

import typings.antd.antdStrings.click
import typings.antd.antdStrings.contextMenu
import typings.antd.antdStrings.hover
import typings.antd.buttonButtonMod.ButtonHTMLType
import typings.antd.buttonGroupMod.ButtonGroupProps
import typings.antd.dropdownDropdownMod.Align
import typings.antd.dropdownDropdownMod.OverlayFunc
import typings.antd.dropdownDropdownMod.Placement
import typings.antd.sizeContextMod.SizeType
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.antd.dropdownDropdownMod.DropDownProps because var conflicts: className, prefixCls. Inlined trigger, overlay, onVisibleChange, visible, disabled, align, getPopupContainer, transitionName, placement, overlayClassName, overlayStyle, forceRender, mouseEnterDelay, mouseLeaveDelay, openClassName */ trait DropdownButtonProps extends ButtonGroupProps {
  var align: js.UndefOr[Align] = js.undefined
  var buttonsRender: js.UndefOr[js.Function1[/* buttons */ js.Array[ReactNode], js.Array[ReactNode]]] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var forceRender: js.UndefOr[Boolean] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var htmlType: js.UndefOr[ButtonHTMLType] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var mouseEnterDelay: js.UndefOr[Double] = js.undefined
  var mouseLeaveDelay: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var openClassName: js.UndefOr[String] = js.undefined
  var overlay: ReactElement | OverlayFunc
  var overlayClassName: js.UndefOr[String] = js.undefined
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[js.Array[click | hover | contextMenu]] = js.undefined
  var `type`: js.UndefOr[DropdownButtonType] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object DropdownButtonProps {
  @scala.inline
  def apply(
    overlay: ReactElement | OverlayFunc,
    align: Align = null,
    buttonsRender: /* buttons */ js.Array[ReactNode] => js.Array[ReactNode] = null,
    children: ReactNode = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    href: String = null,
    htmlType: ButtonHTMLType = null,
    icon: ReactNode = null,
    mouseEnterDelay: js.UndefOr[Double] = js.undefined,
    mouseLeaveDelay: js.UndefOr[Double] = js.undefined,
    onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    onVisibleChange: /* visible */ Boolean => Unit = null,
    openClassName: String = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: Placement = null,
    prefixCls: String = null,
    size: SizeType = null,
    style: CSSProperties = null,
    title: String = null,
    transitionName: String = null,
    trigger: js.Array[click | hover | contextMenu] = null,
    `type`: DropdownButtonType = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DropdownButtonProps = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (buttonsRender != null) __obj.updateDynamic("buttonsRender")(js.Any.fromFunction1(buttonsRender))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender.get.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (htmlType != null) __obj.updateDynamic("htmlType")(htmlType.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseEnterDelay)) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseLeaveDelay)) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownButtonProps]
  }
}

