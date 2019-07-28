package typings.antd.esMenuMod

import typings.antd.esMenuMenuContextMod.MenuTheme
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined antd.antd/es/menu.MenuProps & antd.antd/es/layout/Sider.SiderContextProps */
trait InternalMenuProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var collapsedWidth: js.UndefOr[String | Double] = js.undefined
  var defaultOpenKeys: js.UndefOr[js.Array[String]] = js.undefined
  var defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var focusable: js.UndefOr[Boolean] = js.undefined
  var forceSubMenuRender: js.UndefOr[Boolean] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlineCollapsed: js.UndefOr[Boolean] = js.undefined
  var inlineIndent: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[MenuMode] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* param */ ClickParam, Unit]] = js.undefined
  var onDeselect: js.UndefOr[js.Function1[/* param */ SelectParam, Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[String], Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* param */ SelectParam, Unit]] = js.undefined
  var openAnimation: js.UndefOr[String | js.Object] = js.undefined
  var openKeys: js.UndefOr[js.Array[String]] = js.undefined
  var openTransitionName: js.UndefOr[String | js.Object] = js.undefined
  var overflowedIndicator: js.UndefOr[ReactNode] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var siderCollapsed: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subMenuCloseDelay: js.UndefOr[Double] = js.undefined
  var subMenuOpenDelay: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[MenuTheme] = js.undefined
}

object InternalMenuProps {
  @scala.inline
  def apply(
    className: String = null,
    collapsedWidth: String | Double = null,
    defaultOpenKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    forceSubMenuRender: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    id: String = null,
    inlineCollapsed: js.UndefOr[Boolean] = js.undefined,
    inlineIndent: Int | Double = null,
    mode: MenuMode = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onClick: /* param */ ClickParam => Unit = null,
    onDeselect: /* param */ SelectParam => Unit = null,
    onMouseEnter: /* e */ MouseEvent => Unit = null,
    onOpenChange: /* openKeys */ js.Array[String] => Unit = null,
    onSelect: /* param */ SelectParam => Unit = null,
    openAnimation: String | js.Object = null,
    openKeys: js.Array[String] = null,
    openTransitionName: String | js.Object = null,
    overflowedIndicator: ReactNode = null,
    prefixCls: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectedKeys: js.Array[String] = null,
    siderCollapsed: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    subMenuCloseDelay: Int | Double = null,
    subMenuOpenDelay: Int | Double = null,
    theme: MenuTheme = null
  ): InternalMenuProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (collapsedWidth != null) __obj.updateDynamic("collapsedWidth")(collapsedWidth.asInstanceOf[js.Any])
    if (defaultOpenKeys != null) __obj.updateDynamic("defaultOpenKeys")(defaultOpenKeys)
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys)
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable)
    if (!js.isUndefined(forceSubMenuRender)) __obj.updateDynamic("forceSubMenuRender")(forceSubMenuRender)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(inlineCollapsed)) __obj.updateDynamic("inlineCollapsed")(inlineCollapsed)
    if (inlineIndent != null) __obj.updateDynamic("inlineIndent")(inlineIndent.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (openAnimation != null) __obj.updateDynamic("openAnimation")(openAnimation.asInstanceOf[js.Any])
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys)
    if (openTransitionName != null) __obj.updateDynamic("openTransitionName")(openTransitionName.asInstanceOf[js.Any])
    if (overflowedIndicator != null) __obj.updateDynamic("overflowedIndicator")(overflowedIndicator.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys)
    if (!js.isUndefined(siderCollapsed)) __obj.updateDynamic("siderCollapsed")(siderCollapsed)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subMenuCloseDelay != null) __obj.updateDynamic("subMenuCloseDelay")(subMenuCloseDelay.asInstanceOf[js.Any])
    if (subMenuOpenDelay != null) __obj.updateDynamic("subMenuOpenDelay")(subMenuOpenDelay.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[InternalMenuProps]
  }
}

