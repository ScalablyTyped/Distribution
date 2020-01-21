package typings.antDesignReactNative

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/search-bar/demo/basic", JSImport.Namespace)
@js.native
object searchBarDemoBasicMod extends js.Object {
  @js.native
  trait SearchBarDemo
    extends Component[js.Any, js.Any, js.Any] {
    @JSName("state")
    var state_SearchBarDemo: AnonValueString = js.native
    def clear(): Unit = js.native
    def onChange(value: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends SearchBarDemo
  
}

