package typings.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import typings.antDesignProLayout.siderMenuSiderMenuMod.PrivateSiderMenuProps
import typings.antDesignProLayout.siderMenuSiderMenuMod.SiderMenuProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siderMenuMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/SiderMenu", JSImport.Default)
  @js.native
  val default: FC[SiderMenuProps & PrivateSiderMenuProps] = js.native
  
  type _To = FC[SiderMenuProps & PrivateSiderMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `siderMenuMod.foo` */
  override def _to: FC[SiderMenuProps & PrivateSiderMenuProps] = default
}
