package typings.antdMobile

import typings.antdMobile.anon.PrefixCls
import typings.antdMobile.anon.TypeofDefaultTabBar
import typings.antdMobile.tabsPropsTypeMod.TabsProps
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.rmcTabs.defaultTabBarMod.PropsType
import typings.rmcTabs.propsTypeMod.TabBarPropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("antd-mobile/lib/tabs", JSImport.Default)
  @js.native
  class default () extends Tabs
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/tabs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/tabs", "default.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    @scala.inline
    def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/tabs", "default.defaultProps")
    @js.native
    def defaultProps: PrefixCls = js.native
    @scala.inline
    def defaultProps_=(x: PrefixCls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd-mobile/lib/tabs", "DefaultTabBar")
  @js.native
  class DefaultTabBar protected ()
    extends typings.rmcTabs.mod.DefaultTabBar {
    def this(props: PropsType) = this()
  }
  /* static members */
  object DefaultTabBar {
    
    @JSImport("antd-mobile/lib/tabs", "DefaultTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/tabs", "DefaultTabBar.defaultProps")
    @js.native
    def defaultProps: js.Any = js.native
    @scala.inline
    def defaultProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Tabs
    extends PureComponent[TabsProps, js.Object, js.Any] {
    
    def renderTabBar(props: TabBarPropsType): Element = js.native
  }
}
