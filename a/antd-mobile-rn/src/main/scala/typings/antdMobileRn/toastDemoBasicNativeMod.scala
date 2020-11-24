package typings.antdMobileRn

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn/lib/toast/demo/basic.native", JSImport.Namespace)
@js.native
object toastDemoBasicNativeMod extends js.Object {
  
  @js.native
  trait ToastExample
    extends Component[js.Any, js.Any, js.Any] {
    
    def alwaysShowToast(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MToastExample(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MToastExample(): Unit = js.native
    
    var timer: js.Any = js.native
  }
  
  @js.native
  class default () extends ToastExample
}
