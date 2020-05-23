package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ValueUndefined
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/picker-view/demo/basic", JSImport.Namespace)
@js.native
object pickerViewDemoBasicMod extends js.Object {
  @js.native
  trait PickerViewExample
    extends Component[js.Object, js.Object, js.Any] {
    @JSName("state")
    var state_PickerViewExample: ValueUndefined = js.native
    def onChange(value: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends PickerViewExample
  
}

