package typings
package antdLib.libDropdownDropdownDashButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- antdLib.libDropdownDropdownMod.DropDownProps because var conflicts: className, prefixCls. Inlined trigger, overlay, onVisibleChange, visible, disabled, align, getPopupContainer, transitionName, placement, overlayClassName, overlayStyle, forceRender, mouseEnterDelay, mouseLeaveDelay, openClassName */ trait DropdownButtonProps
  extends antdLib.libButtonButtonDashGroupMod.ButtonGroupProps {
  var align: js.UndefOr[js.Object] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var forceRender: js.UndefOr[scala.Boolean] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ reactLib.Element, reactLib.HTMLElement]] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var htmlType: js.UndefOr[antdLib.libButtonButtonMod.ButtonHTMLType] = js.undefined
  var mouseEnterDelay: js.UndefOr[scala.Double] = js.undefined
  var mouseLeaveDelay: js.UndefOr[scala.Double] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLButtonElement]] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ scala.Boolean, scala.Unit]] = js.undefined
  var openClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlay: reactLib.reactMod.ReactNs.ReactNode | antdLib.libDropdownDropdownMod.OverlayFunc
  var overlayClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlayStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var placement: js.UndefOr[antdLib.libDropdownDropdownMod.Placement] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  var trigger: js.UndefOr[
    js.Array[
      antdLib.antdLibStrings.click | antdLib.antdLibStrings.hover | antdLib.antdLibStrings.contextMenu
    ]
  ] = js.undefined
  var `type`: js.UndefOr[DropdownButtonType] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object DropdownButtonProps {
  @scala.inline
  def apply(
    overlay: reactLib.reactMod.ReactNs.ReactNode | antdLib.libDropdownDropdownMod.OverlayFunc,
    align: js.Object = null,
    children: js.Any = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    forceRender: js.UndefOr[scala.Boolean] = js.undefined,
    getPopupContainer: js.Function1[/* triggerNode */ reactLib.Element, reactLib.HTMLElement] = null,
    href: java.lang.String = null,
    htmlType: antdLib.libButtonButtonMod.ButtonHTMLType = null,
    mouseEnterDelay: scala.Int | scala.Double = null,
    mouseLeaveDelay: scala.Int | scala.Double = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLButtonElement] = null,
    onVisibleChange: js.Function1[/* visible */ scala.Boolean, scala.Unit] = null,
    openClassName: java.lang.String = null,
    overlayClassName: java.lang.String = null,
    overlayStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    placement: antdLib.libDropdownDropdownMod.Placement = null,
    prefixCls: java.lang.String = null,
    size: antdLib.libButtonButtonMod.ButtonSize = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    transitionName: java.lang.String = null,
    trigger: js.Array[
      antdLib.antdLibStrings.click | antdLib.antdLibStrings.hover | antdLib.antdLibStrings.contextMenu
    ] = null,
    `type`: DropdownButtonType = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): DropdownButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align)
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(getPopupContainer)
    if (href != null) __obj.updateDynamic("href")(href)
    if (htmlType != null) __obj.updateDynamic("htmlType")(htmlType)
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(onVisibleChange)
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[DropdownButtonProps]
  }
}

