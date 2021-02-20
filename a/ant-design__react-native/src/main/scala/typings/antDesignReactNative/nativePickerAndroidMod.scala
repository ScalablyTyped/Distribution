package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ComponentDidMount
import typings.antDesignReactNative.anon.ReadonlyPickerProps
import typings.antDesignReactNative.anon.ValueAny
import typings.antDesignReactNative.pickerTypesMod.PickerProps
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativePickerAndroidMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@ant-design/react-native/lib/picker/NativePicker.android", JSImport.Default)
  @js.native
  class default protected () extends ComponentDidMount {
    def this(props: ReadonlyPickerProps) = this()
    def this(props: PickerProps) = this()
    def this(props: PickerProps, context: js.Any) = this()
  }
  object default {
    
    @JSImport("@ant-design/react-native/lib/picker/NativePicker.android", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/picker/NativePicker.android", "default.Item")
    @js.native
    def Item(_props: ValueAny): Null = js.native
    
    @JSImport("@ant-design/react-native/lib/picker/NativePicker.android", "default.contextType")
    @js.native
    def contextType: js.UndefOr[Context[js.Any]] = js.native
    @scala.inline
    def contextType_=(x: js.UndefOr[Context[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IPickerProp extends StObject {
    
    var doScrollingComplete: js.Function = js.native
    
    var select: js.Function = js.native
  }
  object IPickerProp {
    
    @scala.inline
    def apply(doScrollingComplete: js.Function, select: js.Function): IPickerProp = {
      val __obj = js.Dynamic.literal(doScrollingComplete = doScrollingComplete.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPickerProp]
    }
    
    @scala.inline
    implicit class IPickerPropMutableBuilder[Self <: IPickerProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoScrollingComplete(value: js.Function): Self = StObject.set(x, "doScrollingComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelect(value: js.Function): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    }
  }
}
