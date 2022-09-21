package typings.antDesignReactNative

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/switch/demo/basic", JSImport.Default)
  @js.native
  open class default protected () extends SwitchExample {
    def this(props: Any) = this()
  }
  
  @js.native
  trait SwitchExample extends Component[Any, Any, Any] {
    
    def toggle(): Unit = js.native
  }
}
