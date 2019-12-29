package typings.antdDashMobile

import typings.antdDashMobile.libTabsPropsTypeMod.TabsProps
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import typings.rmcDashTabs.libPropsTypeMod.TabBarPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/tabs", JSImport.Namespace)
@js.native
object libTabsMod extends js.Object {
  @js.native
  class DefaultTabBar ()
    extends typings.rmcDashTabs.rmcDashTabsMod.DefaultTabBar
  
  @js.native
  trait Tabs
    extends Component[TabsProps, js.Object, js.Any] {
    def renderTabBar(props: TabBarPropsType): Element = js.native
  }
  
  @js.native
  class default () extends Tabs
  
  /* static members */
  @js.native
  object DefaultTabBar extends js.Object {
    var defaultProps: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var DefaultTabBar: TypeofClassDefaultTabBar = js.native
    var defaultProps: Anon_PrefixCls = js.native
  }
  
}

