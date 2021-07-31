package typings.antdMobileRn

import typings.antdMobileRn.anon.Value
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerViewDemoBasicNativeMod {
  
  @JSImport("antd-mobile-rn/lib/picker-view/demo/basic.native", JSImport.Default)
  @js.native
  class default () extends PickerViewExample
  
  @js.native
  trait PickerViewExample
    extends Component[js.Object, js.Object, js.Any] {
    
    def onChange(value: js.Any): Unit = js.native
    
    @JSName("state")
    var state_PickerViewExample: Value = js.native
  }
}
