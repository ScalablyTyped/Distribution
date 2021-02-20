package typings.antdMobileRn

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastDemoBasicNativeMod {
  
  @JSImport("antd-mobile-rn/lib/toast/demo/basic.native", JSImport.Default)
  @js.native
  class default () extends ToastExample
  
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
}
