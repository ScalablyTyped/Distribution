package typings.antdMobileRn

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libActivityIndicatorDemoBasicDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/activity-indicator/demo/basic.native", JSImport.Default)
  @js.native
  open class default protected () extends ActivityIndicatorExample {
    def this(props: Any) = this()
  }
  
  @js.native
  trait ActivityIndicatorExample extends Component[Any, Any, Any] {
    
    var closeTimer: Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MActivityIndicatorExample(): Unit = js.native
    
    def loadingToast(): Unit = js.native
  }
}
