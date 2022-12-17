package typings.antDesignReactNative

import typings.antDesignReactNative.antDesignReactNativeStrings.dialog
import typings.antDesignReactNative.antDesignReactNativeStrings.dropdown
import typings.react.mod.ComponentType
import typings.reactNativePickerPicker.mod.Picker
import typings.reactNativePickerPicker.typingsPickerMod.PickerItemProps
import typings.reactNativePickerPicker.typingsPickerMod.PickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerNativePickerDotiosMod {
  
  @JSImport("@ant-design/react-native/lib/picker/NativePicker.ios", JSImport.Default)
  @js.native
  open class default[T] protected () extends Picker[T] {
    def this(props: PickerProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PickerProps[T], context: Any) = this()
  }
  object default {
    
    @JSImport("@ant-design/react-native/lib/picker/NativePicker.ios", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ant-design/react-native/lib/picker/NativePicker.ios", "default.Item")
    @js.native
    def Item: ComponentType[
        PickerItemProps[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify T */ Any
        ]
      ] = js.native
    inline def Item_=(
      x: ComponentType[
          PickerItemProps[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify T */ Any
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    /**
      * On Android, display the options in a dialog (this is the default).
      */
    /* static member */
    @JSImport("@ant-design/react-native/lib/picker/NativePicker.ios", "default.MODE_DIALOG")
    @js.native
    val MODE_DIALOG: dialog = js.native
    
    /**
      * On Android, display the options in a dropdown.
      */
    /* static member */
    @JSImport("@ant-design/react-native/lib/picker/NativePicker.ios", "default.MODE_DROPDOWN")
    @js.native
    val MODE_DROPDOWN: dropdown = js.native
  }
}
