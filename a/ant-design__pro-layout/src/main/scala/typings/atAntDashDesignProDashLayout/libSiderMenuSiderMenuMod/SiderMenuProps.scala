package typings.atAntDashDesignProDashLayout.libSiderMenuSiderMenuMod

import typings.atAntDashDesignProDashLayout.libTypingsMod.WithFalse
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<'className' | 'collapsed' | 'flatMenuKeys' | 'isMobile' | 'menuData' | 'mode' | 'openKeys' | 'style' | 'theme' | 'menuItemRender' | 'location' | 'staticContext' | 'history' | 'computedMatch' | 'match' | 'route' | 'menu' | 'navTheme' | 'contentWidth' | 'layout' | 'title' | 'fixedHeader' | 'iconfontUrl' | 'fixSiderbar' | 'autoHideHeader', ['onCollapse']> ]: @ant-design/pro-layout.@ant-design/pro-layout/lib/SiderMenu/BaseMenu.BaseMenuProps[P]} */ trait SiderMenuProps extends js.Object {
  var logo: js.UndefOr[ReactNode] = js.undefined
  var menuHeaderRender: js.UndefOr[WithFalse[js.Function2[/* logo */ ReactNode, /* title */ ReactNode, ReactNode]]] = js.undefined
  var onMenuHeaderClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
  var siderWidth: js.UndefOr[Double] = js.undefined
}

object SiderMenuProps {
  @scala.inline
  def apply(
    logo: ReactNode = null,
    menuHeaderRender: WithFalse[js.Function2[/* logo */ ReactNode, /* title */ ReactNode, ReactNode]] = null,
    onMenuHeaderClick: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    siderWidth: Int | Double = null
  ): SiderMenuProps = {
    val __obj = js.Dynamic.literal()
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (menuHeaderRender != null) __obj.updateDynamic("menuHeaderRender")(menuHeaderRender.asInstanceOf[js.Any])
    if (onMenuHeaderClick != null) __obj.updateDynamic("onMenuHeaderClick")(js.Any.fromFunction1(onMenuHeaderClick))
    if (siderWidth != null) __obj.updateDynamic("siderWidth")(siderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiderMenuProps]
  }
}

