package typings.antDesignReactNative

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/date-picker/demo/basic", JSImport.Namespace)
@js.native
object datePickerDemoBasicMod extends js.Object {
  
  @js.native
  trait PopupExample
    extends Component[js.Any, js.Any, js.Any] {
    
    def onChange(value: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends PopupExample {
    def this(props: js.Any) = this()
  }
}
