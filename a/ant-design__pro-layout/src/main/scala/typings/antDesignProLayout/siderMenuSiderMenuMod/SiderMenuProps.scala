package typings.antDesignProLayout.siderMenuSiderMenuMod

import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.antDesignProLayoutStrings.lg
import typings.antDesignProLayout.antDesignProLayoutStrings.md
import typings.antDesignProLayout.antDesignProLayoutStrings.sm
import typings.antDesignProLayout.antDesignProLayoutStrings.xl
import typings.antDesignProLayout.antDesignProLayoutStrings.xs
import typings.antDesignProLayout.antDesignProLayoutStrings.xxl
import typings.antDesignProLayout.typingsMod.WithFalse
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<'className' | 'collapsed' | 'isMobile' | 'menuData' | 'mode' | 'openKeys' | 'menuProps' | 'style' | 'theme' | 'subMenuItemRender' | 'menuItemRender' | 'computedMatch' | 'location' | 'staticContext' | 'match' | 'route' | 'history' | 'openAnimation' | 'getPopupContainer' | 'defaultSelectedKeys' | 'onMouseEnter' | 'multiple' | 'onSelect' | 'selectable' | 'defaultOpenKeys' | 'motion' | 'inlineCollapsed' | 'subMenuCloseDelay' | 'openTransitionName' | 'forceSubMenuRender' | 'selectedKeys' | 'onDeselect' | 'overflowedIndicator' | 'prefixCls' | 'id' | 'focusable' | 'triggerSubMenuAction' | 'inlineIndent' | 'onClick' | 'subMenuOpenDelay' | 'fixSiderbar' | 'layout' | 'fixedHeader' | 'menu' | 'contentWidth' | 'iconfontUrl' | 'primaryColor' | 'colorWeak' | 'navTheme' | 'title', ['onCollapse']> ]: @ant-design/pro-layout.@ant-design/pro-layout/lib/SiderMenu/BaseMenu.BaseMenuProps[P]} */ trait SiderMenuProps extends js.Object {
  var breakpoint: js.UndefOr[xs | sm | md | lg | xl | xxl | `false`] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var hide: js.UndefOr[Boolean] = js.undefined
  var links: js.UndefOr[js.Array[ReactNode]] = js.undefined
  var logo: js.UndefOr[ReactNode] = js.undefined
  var menuHeaderRender: js.UndefOr[
    WithFalse[
      js.Function3[
        /* logo */ ReactNode, 
        /* title */ ReactNode, 
        /* props */ js.UndefOr[this.type], 
        ReactNode
      ]
    ]
  ] = js.undefined
  var onMenuHeaderClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ WithFalse[js.Array[String]], Unit]] = js.undefined
  var siderWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SiderMenuProps {
  @scala.inline
  def apply(
    breakpoint: xs | sm | md | lg | xl | xxl | `false` = null,
    className: String = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    links: js.Array[ReactNode] = null,
    logo: ReactNode = null,
    menuHeaderRender: WithFalse[
      js.Function3[
        /* logo */ ReactNode, 
        /* title */ ReactNode, 
        /* props */ js.UndefOr[SiderMenuProps], 
        ReactNode
      ]
    ] = null,
    onMenuHeaderClick: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onOpenChange: /* openKeys */ WithFalse[js.Array[String]] => Unit = null,
    siderWidth: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null
  ): SiderMenuProps = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.get.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (menuHeaderRender != null) __obj.updateDynamic("menuHeaderRender")(menuHeaderRender.asInstanceOf[js.Any])
    if (onMenuHeaderClick != null) __obj.updateDynamic("onMenuHeaderClick")(js.Any.fromFunction1(onMenuHeaderClick))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (!js.isUndefined(siderWidth)) __obj.updateDynamic("siderWidth")(siderWidth.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiderMenuProps]
  }
}

