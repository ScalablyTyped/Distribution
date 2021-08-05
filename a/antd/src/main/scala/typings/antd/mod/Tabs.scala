package typings.antd.mod

import typings.antd.tabsMod.TabsProps
import typings.rcTabs.tabPaneMod.TabPaneProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  inline def apply(hasTypeClassNameSizeOnEditHideAddCenteredAddIconProps: TabsProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasTypeClassNameSizeOnEditHideAddCenteredAddIconProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("antd", "Tabs")
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof imported_rc-tabs.TabPane` */
  inline def TabPane(
    hasPrefixClsForceRenderClassNameStyleIdActiveAnimatedDestroyInactiveTabPaneTabKeyChildren: TabPaneProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TabPane")(hasPrefixClsForceRenderClassNameStyleIdActiveAnimatedDestroyInactiveTabPaneTabKeyChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
}
