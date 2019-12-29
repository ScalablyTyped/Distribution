package typings.atAntDashDesignReactDashNative

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/drawer/demo/basic", JSImport.Namespace)
@js.native
object libDrawerDemoBasicMod extends js.Object {
  @js.native
  trait DrawerExample
    extends Component[js.Any, js.Any, js.Any] {
    var drawer: js.Any = js.native
    def onOpenChange(isOpen: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends DrawerExample
  
}

