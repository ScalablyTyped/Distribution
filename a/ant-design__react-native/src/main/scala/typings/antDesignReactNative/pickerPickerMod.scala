package typings.antDesignReactNative

import typings.antDesignReactNative.pickerTypesMod.PickerProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/picker/Picker", JSImport.Namespace)
@js.native
object pickerPickerMod extends js.Object {
  @js.native
  trait Picker
    extends Component[PickerProps, js.Object, js.Any] {
    def getValue(): js.Any = js.native
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MPicker(nextProps: js.Any): Boolean = js.native
  }
  
  @js.native
  class default () extends Picker
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Item: js.Any = js.native
    var defaultProps: AnonChildrenArray = js.native
  }
  
}

