package typings.antdMobileRn

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToastDemoBasicDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/toast/demo/basic.native", JSImport.Default)
  @js.native
  open class default () extends ToastExample
  
  @js.native
  trait ToastExample extends Component[Any, Any, Any] {
    
    def alwaysShowToast(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MToastExample(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MToastExample(): Unit = js.native
    
    var timer: Any = js.native
  }
}
