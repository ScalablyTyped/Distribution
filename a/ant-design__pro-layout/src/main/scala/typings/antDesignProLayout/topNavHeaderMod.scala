package typings.antDesignProLayout

import typings.antDesignProLayout.globalHeaderMod.GlobalHeaderProps
import typings.antDesignProLayout.siderMenuSiderMenuMod.PrivateSiderMenuProps
import typings.antDesignProLayout.siderMenuSiderMenuMod.SiderMenuProps
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/pro-layout/lib/TopNavHeader", JSImport.Namespace)
@js.native
object topNavHeaderMod extends js.Object {
  
  val default: FC[TopNavHeaderProps] = js.native
  
  type TopNavHeaderProps = SiderMenuProps with GlobalHeaderProps with PrivateSiderMenuProps with js.Object
}
