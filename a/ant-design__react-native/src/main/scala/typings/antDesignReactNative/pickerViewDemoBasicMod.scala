package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ValueUndefined
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerViewDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/picker-view/demo/basic", JSImport.Default)
  @js.native
  class default () extends PickerViewExample
  
  @js.native
  trait PickerViewExample
    extends Component[js.Object, js.Object, js.Any] {
    
    def onChange(value: js.Any): Unit = js.native
    
    @JSName("state")
    var state_PickerViewExample: ValueUndefined = js.native
  }
}
