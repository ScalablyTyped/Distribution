package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ReadonlyPickerPropsAccessibilityActions
import typings.react.mod.ComponentType
import typings.reactNativeCommunityPicker.mod.Picker
import typings.reactNativeCommunityPicker.pickerMod.PickerItemProps
import typings.reactNativeCommunityPicker.pickerMod.PickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativePickerIosMod {
  
  @JSImport("@ant-design/react-native/lib/picker/NativePicker.ios", JSImport.Default)
  @js.native
  class default protected () extends Picker {
    def this(props: ReadonlyPickerPropsAccessibilityActions) = this()
    def this(props: PickerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickerProps, context: js.Any) = this()
  }
  object default {
    
    @JSImport("@ant-design/react-native/lib/picker/NativePicker.ios", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ant-design/react-native/lib/picker/NativePicker.ios", "default.Item")
    @js.native
    def Item: ComponentType[PickerItemProps] = js.native
    inline def Item_=(x: ComponentType[PickerItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    /**
      * On Android, display the options in a dialog.
      */
    /* static member */
    @JSImport("@ant-design/react-native/lib/picker/NativePicker.ios", "default.MODE_DIALOG")
    @js.native
    def MODE_DIALOG: String = js.native
    inline def MODE_DIALOG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_DIALOG")(x.asInstanceOf[js.Any])
    
    /**
      * On Android, display the options in a dropdown (this is the default).
      */
    /* static member */
    @JSImport("@ant-design/react-native/lib/picker/NativePicker.ios", "default.MODE_DROPDOWN")
    @js.native
    def MODE_DROPDOWN: String = js.native
    inline def MODE_DROPDOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_DROPDOWN")(x.asInstanceOf[js.Any])
  }
}
