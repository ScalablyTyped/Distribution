package typings.antdMobileRn

import typings.antdMobileRn.anon.TypeofRMCDefaultTabBar
import typings.antdMobileRn.tabsPropsTypeMod.TabsProps
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/tabs/index.native", JSImport.Default)
  @js.native
  class default () extends Tabs
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/tabs/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/tabs/index.native", "default.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofRMCDefaultTabBar = js.native
    @scala.inline
    def DefaultTabBar_=(x: TypeofRMCDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/tabs/index.native", "default.defaultProps")
    @js.native
    def defaultProps: js.Object = js.native
    @scala.inline
    def defaultProps_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Tabs
    extends PureComponent[TabsProps, js.Object, js.Any] {
    
    def renderTabBar(props: js.Any): Element = js.native
  }
}
