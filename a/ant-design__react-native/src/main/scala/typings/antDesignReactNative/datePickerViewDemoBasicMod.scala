package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Value
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/date-picker-view/demo/basic", JSImport.Namespace)
@js.native
object datePickerViewDemoBasicMod extends js.Object {
  
  @js.native
  trait DatePickerViewExample
    extends Component[js.Object, js.Object, js.Any] {
    
    def onChange(value: js.Any): Unit = js.native
    
    def onValueChange(args: js.Any*): Unit = js.native
    
    @JSName("state")
    var state_DatePickerViewExample: Value = js.native
  }
  
  @js.native
  class default () extends DatePickerViewExample
}
