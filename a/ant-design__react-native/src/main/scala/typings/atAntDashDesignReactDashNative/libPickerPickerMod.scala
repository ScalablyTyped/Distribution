package typings.atAntDashDesignReactDashNative

import typings.atAntDashDesignReactDashNative.libPickerPickerTypesMod.PickerProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/picker/Picker", JSImport.Namespace)
@js.native
object libPickerPickerMod extends js.Object {
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
    var defaultProps: Anon_ChildrenArray = js.native
  }
  
}

