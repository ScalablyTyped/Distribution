package typings.atAntDashDesignReactDashNative

import typings.atAntDashDesignReactDashNative.libToastDemoBasicMod.ToastExample
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/toast/demo/basic", JSImport.Namespace)
@js.native
object libToastDemoBasicMod extends js.Object {
  @js.native
  trait ToastExample
    extends Component[js.Any, js.Any, js.Any] {
    var timer: js.Any = js.native
    def alwaysShowToast(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MToastExample(): Unit = js.native
  }
  
  @js.native
  class default () extends ToastExample
  
}

