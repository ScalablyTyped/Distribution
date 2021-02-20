package typings.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import typings.antDesignProLayout.anon.ChangeSetting
import typings.antDesignProLayout.libSettingDrawerMod.SettingItemProps
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutChangeMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/LayoutChange", JSImport.Default)
  @js.native
  val default: FC[ChangeSetting] = js.native
  
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/LayoutChange", "renderLayoutSettingItem")
  @js.native
  def renderLayoutSettingItem(item: SettingItemProps): Element = js.native
  
  type _To = FC[ChangeSetting]
  
  /* This means you don't have to write `default`, but can instead just say `layoutChangeMod.foo` */
  override def _to: FC[ChangeSetting] = default
}
