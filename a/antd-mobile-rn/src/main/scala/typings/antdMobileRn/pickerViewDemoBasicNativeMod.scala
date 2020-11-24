package typings.antdMobileRn

import typings.antdMobileRn.anon.Value
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn/lib/picker-view/demo/basic.native", JSImport.Namespace)
@js.native
object pickerViewDemoBasicNativeMod extends js.Object {
  
  @js.native
  trait PickerViewExample
    extends Component[js.Object, js.Object, js.Any] {
    
    def onChange(value: js.Any): Unit = js.native
    
    @JSName("state")
    var state_PickerViewExample: Value = js.native
  }
  
  @js.native
  class default () extends PickerViewExample
}
