package typings.antDesignReactNative

import typings.antDesignReactNative.anon.EnableMask
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/toast/demo/basic", JSImport.Default)
  @js.native
  class default () extends ToastExample
  
  @js.native
  trait ToastExample
    extends Component[js.Any, js.Any, js.Any] {
    
    def alwaysShowToast(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MToastExample(): Unit = js.native
    
    @JSName("state")
    var state_ToastExample: EnableMask = js.native
    
    var timer: js.Any = js.native
  }
}
