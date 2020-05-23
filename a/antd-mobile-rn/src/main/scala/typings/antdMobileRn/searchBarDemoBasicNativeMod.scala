package typings.antdMobileRn

import typings.antdMobileRn.anon.ValueString
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/search-bar/demo/basic.native", JSImport.Namespace)
@js.native
object searchBarDemoBasicNativeMod extends js.Object {
  @js.native
  trait SearchBarDemo
    extends Component[js.Any, js.Any, js.Any] {
    @JSName("state")
    var state_SearchBarDemo: ValueString = js.native
    def clear(): Unit = js.native
    def onChange(value: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends SearchBarDemo
  
}

