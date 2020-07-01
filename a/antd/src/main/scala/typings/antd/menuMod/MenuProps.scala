package typings.antd.menuMod

import typings.antd.antdStrings.click
import typings.antd.antdStrings.hover
import typings.antd.menuContextMod.MenuTheme
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var defaultOpenKeys: js.UndefOr[js.Array[String]] = js.undefined
  var defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var focusable: js.UndefOr[Boolean] = js.undefined
  var forceSubMenuRender: js.UndefOr[Boolean] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlineCollapsed: js.UndefOr[Boolean] = js.undefined
  var inlineIndent: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[MenuMode] = js.undefined
  var motion: js.UndefOr[js.Object] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* param */ ClickParam, Unit]] = js.undefined
  var onDeselect: js.UndefOr[js.Function1[/* param */ SelectParam, Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[String], Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* param */ SelectParam, Unit]] = js.undefined
  var openAnimation: js.UndefOr[String] = js.undefined
  var openKeys: js.UndefOr[js.Array[String]] = js.undefined
  var openTransitionName: js.UndefOr[String] = js.undefined
  var overflowedIndicator: js.UndefOr[ReactNode] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subMenuCloseDelay: js.UndefOr[Double] = js.undefined
  var subMenuOpenDelay: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[MenuTheme] = js.undefined
  var triggerSubMenuAction: js.UndefOr[hover | click] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    className: String = null,
    defaultOpenKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    forceSubMenuRender: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    id: String = null,
    inlineCollapsed: js.UndefOr[Boolean] = js.undefined,
    inlineIndent: js.UndefOr[Double] = js.undefined,
    mode: MenuMode = null,
    motion: js.Object = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onClick: /* param */ ClickParam => Unit = null,
    onDeselect: /* param */ SelectParam => Unit = null,
    onMouseEnter: /* e */ MouseEvent => Unit = null,
    onOpenChange: /* openKeys */ js.Array[String] => Unit = null,
    onSelect: /* param */ SelectParam => Unit = null,
    openAnimation: String = null,
    openKeys: js.Array[String] = null,
    openTransitionName: String = null,
    overflowedIndicator: ReactNode = null,
    prefixCls: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectedKeys: js.Array[String] = null,
    style: CSSProperties = null,
    subMenuCloseDelay: js.UndefOr[Double] = js.undefined,
    subMenuOpenDelay: js.UndefOr[Double] = js.undefined,
    theme: MenuTheme = null,
    triggerSubMenuAction: hover | click = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultOpenKeys != null) __obj.updateDynamic("defaultOpenKeys")(defaultOpenKeys.asInstanceOf[js.Any])
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSubMenuRender)) __obj.updateDynamic("forceSubMenuRender")(forceSubMenuRender.get.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineCollapsed)) __obj.updateDynamic("inlineCollapsed")(inlineCollapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineIndent)) __obj.updateDynamic("inlineIndent")(inlineIndent.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (motion != null) __obj.updateDynamic("motion")(motion.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (openAnimation != null) __obj.updateDynamic("openAnimation")(openAnimation.asInstanceOf[js.Any])
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys.asInstanceOf[js.Any])
    if (openTransitionName != null) __obj.updateDynamic("openTransitionName")(openTransitionName.asInstanceOf[js.Any])
    if (overflowedIndicator != null) __obj.updateDynamic("overflowedIndicator")(overflowedIndicator.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(subMenuCloseDelay)) __obj.updateDynamic("subMenuCloseDelay")(subMenuCloseDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subMenuOpenDelay)) __obj.updateDynamic("subMenuOpenDelay")(subMenuOpenDelay.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (triggerSubMenuAction != null) __obj.updateDynamic("triggerSubMenuAction")(triggerSubMenuAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

