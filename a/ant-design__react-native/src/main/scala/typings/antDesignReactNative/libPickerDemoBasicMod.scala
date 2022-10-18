package typings.antDesignReactNative

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/picker/demo/basic", JSImport.Default)
  @js.native
  open class default protected () extends PopupExample {
    def this(props: Any) = this()
  }
  
  @js.native
  trait PopupExample extends Component[Any, Any, Any] {
    
    def onChange(value: Any): Unit = js.native
    
    def onPress(): Unit = js.native
  }
}
