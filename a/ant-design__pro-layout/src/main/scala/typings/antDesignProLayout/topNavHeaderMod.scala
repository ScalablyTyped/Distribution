package typings.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import typings.antDesignProLayout.globalHeaderMod.GlobalHeaderProps
import typings.antDesignProLayout.siderMenuSiderMenuMod.PrivateSiderMenuProps
import typings.antDesignProLayout.siderMenuSiderMenuMod.SiderMenuProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topNavHeaderMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/TopNavHeader", JSImport.Default)
  @js.native
  val default: FC[TopNavHeaderProps] = js.native
  
  type TopNavHeaderProps = SiderMenuProps with GlobalHeaderProps with PrivateSiderMenuProps with js.Object
  
  type _To = FC[TopNavHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `topNavHeaderMod.foo` */
  override def _to: FC[TopNavHeaderProps] = default
}
