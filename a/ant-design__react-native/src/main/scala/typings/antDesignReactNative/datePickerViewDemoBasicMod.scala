package typings.antDesignReactNative

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/date-picker-view/demo/basic", JSImport.Namespace)
@js.native
object datePickerViewDemoBasicMod extends js.Object {
  @js.native
  trait DatePickerViewExample
    extends Component[js.Object, js.Object, js.Any] {
    @JSName("state")
    var state_DatePickerViewExample: AnonValue = js.native
    def onChange(value: js.Any): Unit = js.native
    def onValueChange(args: js.Any*): Unit = js.native
  }
  
  @js.native
  class default () extends DatePickerViewExample
  
}

