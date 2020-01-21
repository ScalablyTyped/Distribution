package typings.antdMobileRn

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/picker-view/demo/basic.native", JSImport.Namespace)
@js.native
object pickerViewDemoBasicNativeMod extends js.Object {
  @js.native
  trait PickerViewExample
    extends Component[js.Object, js.Object, js.Any] {
    @JSName("state")
    var state_PickerViewExample: AnonValue = js.native
    def onChange(value: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends PickerViewExample
  
}

