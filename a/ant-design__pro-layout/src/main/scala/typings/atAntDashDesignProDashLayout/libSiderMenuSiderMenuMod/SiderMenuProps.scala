package typings.atAntDashDesignProDashLayout.libSiderMenuSiderMenuMod

import typings.antd.libMenuMod.MenuProps
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutNumbers.`false`
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.lg
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.md
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.sm
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.xl
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.xs
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.xxl
import typings.atAntDashDesignProDashLayout.libTypingsMod.WithFalse
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<'className' | 'collapsed' | 'flatMenuKeys' | 'isMobile' | 'menuData' | 'mode' | 'openKeys' | 'style' | 'theme' | 'menuItemRender' | 'location' | 'staticContext' | 'history' | 'computedMatch' | 'match' | 'route' | 'onClick' | 'subMenuCloseDelay' | 'getPopupContainer' | 'selectedKeys' | 'defaultOpenKeys' | 'onOpenChange' | 'inlineCollapsed' | 'motion' | 'focusable' | 'defaultSelectedKeys' | 'prefixCls' | 'overflowedIndicator' | 'subMenuOpenDelay' | 'selectable' | 'id' | 'onSelect' | 'onDeselect' | 'multiple' | 'inlineIndent' | 'openTransitionName' | 'onMouseEnter' | 'openAnimation' | 'forceSubMenuRender' | 'menu' | 'navTheme' | 'contentWidth' | 'layout' | 'title' | 'fixedHeader' | 'iconfontUrl' | 'fixSiderbar' | 'autoHideHeader', ['onCollapse']> ]: @ant-design/pro-layout.@ant-design/pro-layout/lib/SiderMenu/BaseMenu.BaseMenuProps[P]} */ trait SiderMenuProps extends js.Object {
  var breakpoint: js.UndefOr[xs | sm | md | lg | xl | xxl | `false`] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var logo: js.UndefOr[ReactNode] = js.undefined
  var menuHeaderRender: js.UndefOr[WithFalse[js.Function2[/* logo */ ReactNode, /* title */ ReactNode, ReactNode]]] = js.undefined
  /**
    * 要给菜单的props, 参考antd-menu的属性。https://ant.design/components/menu-cn/
    */
  var menuProps: js.UndefOr[MenuProps] = js.undefined
  var onMenuHeaderClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
  var siderWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SiderMenuProps {
  @scala.inline
  def apply(
    breakpoint: xs | sm | md | lg | xl | xxl | `false` = null,
    className: String = null,
    logo: ReactNode = null,
    menuHeaderRender: WithFalse[js.Function2[/* logo */ ReactNode, /* title */ ReactNode, ReactNode]] = null,
    menuProps: MenuProps = null,
    onMenuHeaderClick: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    siderWidth: Int | Double = null,
    style: CSSProperties = null
  ): SiderMenuProps = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (menuHeaderRender != null) __obj.updateDynamic("menuHeaderRender")(menuHeaderRender.asInstanceOf[js.Any])
    if (menuProps != null) __obj.updateDynamic("menuProps")(menuProps)
    if (onMenuHeaderClick != null) __obj.updateDynamic("onMenuHeaderClick")(js.Any.fromFunction1(onMenuHeaderClick))
    if (siderWidth != null) __obj.updateDynamic("siderWidth")(siderWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SiderMenuProps]
  }
}

