package typings.antdMobileRn

import typings.antdMobileRn.anon.TypeofRMCDefaultTabBar
import typings.antdMobileRn.tabsPropsTypeMod.TabsProps
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn/lib/tabs/index.native", JSImport.Namespace)
@js.native
object tabsIndexNativeMod extends js.Object {
  
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
    
    var DefaultTabBar: TypeofRMCDefaultTabBar = js.native
  }
}
