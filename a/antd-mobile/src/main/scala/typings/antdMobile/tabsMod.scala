package typings.antdMobile

import typings.antdMobile.tabsPropsTypeMod.TabsProps
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import typings.rmcTabs.propsTypeMod.TabBarPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/tabs", JSImport.Namespace)
@js.native
object tabsMod extends js.Object {
  @js.native
  class DefaultTabBar ()
    extends typings.rmcTabs.mod.DefaultTabBar
  
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
    var DefaultTabBar: TypeofDefaultTabBar = js.native
    var defaultProps: AnonPrefixCls = js.native
  }
  
}

