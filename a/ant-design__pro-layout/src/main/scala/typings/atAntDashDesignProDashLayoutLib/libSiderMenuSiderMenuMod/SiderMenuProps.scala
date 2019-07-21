package typings
package atAntDashDesignProDashLayoutLib.libSiderMenuSiderMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<'className' | 'collapsed' | 'flatMenuKeys' | 'isMobile' | 'menuData' | 'mode' | 'openKeys' | 'style' | 'theme' | 'menuItemRender', ['onCollapse']> ]: @ant-design/pro-layout.@ant-design/pro-layout/lib/SiderMenu/BaseMenu.BaseMenuProps[P]} */ trait SiderMenuProps extends js.Object {
  var logo: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var siderWidth: js.UndefOr[scala.Double] = js.undefined
}

object SiderMenuProps {
  @scala.inline
  def apply(logo: reactLib.reactMod.ReactNode = null, siderWidth: scala.Int | scala.Double = null): SiderMenuProps = {
    val __obj = js.Dynamic.literal()
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (siderWidth != null) __obj.updateDynamic("siderWidth")(siderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiderMenuProps]
  }
}

