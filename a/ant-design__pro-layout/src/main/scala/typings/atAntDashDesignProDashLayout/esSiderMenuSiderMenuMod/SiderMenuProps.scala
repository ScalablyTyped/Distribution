package typings.atAntDashDesignProDashLayout.esSiderMenuSiderMenuMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<'className' | 'collapsed' | 'flatMenuKeys' | 'isMobile' | 'menuData' | 'mode' | 'openKeys' | 'style' | 'theme' | 'menuItemRender' | 'location' | 'staticContext' | 'history' | 'computedMatch' | 'match' | 'route' | 'menu' | 'navTheme' | 'contentWidth' | 'layout' | 'title' | 'fixedHeader' | 'iconfontUrl' | 'fixSiderbar' | 'autoHideHeader', ['onCollapse']> ]: @ant-design/pro-layout.@ant-design/pro-layout/es/SiderMenu/BaseMenu.BaseMenuProps[P]} */ trait SiderMenuProps extends js.Object {
  var logo: js.UndefOr[ReactNode] = js.undefined
  var siderWidth: js.UndefOr[Double] = js.undefined
}

object SiderMenuProps {
  @scala.inline
  def apply(logo: ReactNode = null, siderWidth: Int | Double = null): SiderMenuProps = {
    val __obj = js.Dynamic.literal()
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (siderWidth != null) __obj.updateDynamic("siderWidth")(siderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiderMenuProps]
  }
}

