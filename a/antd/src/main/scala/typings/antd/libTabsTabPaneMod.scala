package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.rcTabs.esTabPanelListTabPaneMod.TabPaneProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabsTabPaneMod extends Shortcut {
  
  @JSImport("antd/lib/tabs/TabPane", JSImport.Default)
  @js.native
  val default: FC[TabPaneProps] = js.native
  
  type _To = FC[TabPaneProps]
  
  /* This means you don't have to write `default`, but can instead just say `libTabsTabPaneMod.foo` */
  override def _to: FC[TabPaneProps] = default
}
