package typings.antDesignReactNative

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/popover/demo/basic", JSImport.Namespace)
@js.native
object popoverDemoBasicMod extends js.Object {
  @js.native
  trait PopoverExample
    extends Component[js.Any, js.Any, js.Any] {
    var renderList: js.Any = js.native
    def onSelect(value: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends PopoverExample {
    def this(props: js.Any) = this()
  }
  
  val description: /* "Popover example" */ String = js.native
  val title: /* "Popover" */ String = js.native
}

