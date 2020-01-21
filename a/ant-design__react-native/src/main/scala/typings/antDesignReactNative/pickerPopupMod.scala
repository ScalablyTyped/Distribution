package typings.antDesignReactNative

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/picker/Popup", JSImport.Namespace)
@js.native
object pickerPopupMod extends js.Object {
  @js.native
  class default protected () extends AnonCallBackCallbackComponentWillReceiveProps {
    def this(props: ReadonlyPopupPickerProps) = this()
  }
  
  @js.native
  object default extends Instantiable1[
          /* props */ ReadonlyPopupPickerProps, 
          AnonCallBackCallbackComponentWillReceiveProps
        ] {
    var contextType: js.UndefOr[Context[_]] = js.native
    var defaultProps: AnonActionTextActiveOpacity = js.native
  }
  
}

