package typings.antdDashMobileDashRn

import typings.antdDashMobileDashRn.libTabsIndexDotNativeMod.Tabs
import typings.antdDashMobileDashRn.libTabsPropsTypeMod.TabsProps
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/tabs/index.native", JSImport.Namespace)
@js.native
object libTabsIndexDotNativeMod extends js.Object {
  @js.native
  trait Tabs
    extends Component[TabsProps, js.Object, js.Any] {
    def renderTabBar(props: js.Any): Element = js.native
  }
  
  @js.native
  class default () extends Tabs
  
  /* static members */
  @js.native
  object default extends js.Object {
    var DefaultTabBar: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RMCDefaultTabBar */ js.Any = js.native
  }
  
}

