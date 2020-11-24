package typings.antDesignReactNative

import typings.react.mod.ComponentType
import typings.reactNativeCommunityPicker.mod.Picker
import typings.reactNativeCommunityPicker.pickerMod.PickerItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/picker/NativePicker.ios", JSImport.Namespace)
@js.native
object nativePickerIosMod extends js.Object {
  
  @js.native
  class default () extends Picker
  /* static members */
  @js.native
  object default extends js.Object {
    
    var Item: ComponentType[PickerItemProps] = js.native
    
    /**
      * On Android, display the options in a dialog.
      */
    var MODE_DIALOG: String = js.native
    
    /**
      * On Android, display the options in a dropdown (this is the default).
      */
    var MODE_DROPDOWN: String = js.native
  }
}
