package typings.antdMobileRn

import typings.antdMobileRn.anon.Value
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/date-picker-view/demo/basic.native", JSImport.Namespace)
@js.native
object datePickerViewDemoBasicNativeMod extends js.Object {
  @js.native
  trait DatePickerViewExample
    extends Component[js.Object, js.Object, js.Any] {
    @JSName("state")
    var state_DatePickerViewExample: Value = js.native
    def onChange(value: js.Any): Unit = js.native
    def onValueChange(args: js.Any*): Unit = js.native
  }
  
  @js.native
  class default () extends DatePickerViewExample
  
}

