package typings.antDesignProLayout

import typings.antDesignProLayout.anon.ChangeSetting
import typings.antDesignProLayout.libSettingDrawerMod.SettingItemProps
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutChangeMod {
  
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/LayoutChange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/LayoutChange", JSImport.Default)
  @js.native
  val default: FC[ChangeSetting] = js.native
  
  @scala.inline
  def renderLayoutSettingItem(item: SettingItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("renderLayoutSettingItem")(item.asInstanceOf[js.Any]).asInstanceOf[Element]
}
