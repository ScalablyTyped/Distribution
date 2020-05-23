package typings.antDesignPro.headerDropdownMod

import typings.antDesignPro.antDesignProStrings.bottomCenter
import typings.antDesignPro.antDesignProStrings.bottomLeft
import typings.antDesignPro.antDesignProStrings.bottomRight
import typings.antDesignPro.antDesignProStrings.topCenter
import typings.antDesignPro.antDesignProStrings.topLeft
import typings.antDesignPro.antDesignProStrings.topRight
import typings.antd.antdStrings.click
import typings.antd.antdStrings.contextMenu
import typings.antd.antdStrings.hover
import typings.antd.dropdownDropdownMod.Align
import typings.antd.dropdownDropdownMod.DropDownProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderDropdownProps extends DropDownProps {
  @JSName("overlay")
  var overlay_HeaderDropdownProps: ReactNode | OverlayFunc
  @JSName("placement")
  var placement_HeaderDropdownProps: js.UndefOr[bottomLeft | bottomRight | topLeft | topCenter | topRight | bottomCenter] = js.undefined
}

object HeaderDropdownProps {
  @scala.inline
  def apply(
    align: Align = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    mouseEnterDelay: js.UndefOr[Double] = js.undefined,
    mouseLeaveDelay: js.UndefOr[Double] = js.undefined,
    onVisibleChange: /* visible */ Boolean => Unit = null,
    openClassName: String = null,
    overlay: ReactNode | OverlayFunc = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: bottomLeft | bottomRight | topLeft | topCenter | topRight | bottomCenter = null,
    prefixCls: String = null,
    transitionName: String = null,
    trigger: js.Array[click | hover | contextMenu] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): HeaderDropdownProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender.get.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (!js.isUndefined(mouseEnterDelay)) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseLeaveDelay)) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.get.asInstanceOf[js.Any])
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderDropdownProps]
  }
}

