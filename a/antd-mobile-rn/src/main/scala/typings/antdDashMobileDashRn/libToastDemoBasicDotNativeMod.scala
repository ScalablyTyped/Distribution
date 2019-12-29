package typings.antdDashMobileDashRn

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/toast/demo/basic.native", JSImport.Namespace)
@js.native
object libToastDemoBasicDotNativeMod extends js.Object {
  @js.native
  trait ToastExample
    extends Component[js.Any, js.Any, js.Any] {
    var timer: js.Any = js.native
    def alwaysShowToast(): Unit = js.native
    @JSName("componentDidMount")
    def componentDidMount_MToastExample(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MToastExample(): Unit = js.native
  }
  
  @js.native
  class default () extends ToastExample
  
}

