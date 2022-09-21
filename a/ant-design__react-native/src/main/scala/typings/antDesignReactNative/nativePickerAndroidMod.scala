package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ComponentDidMount
import typings.antDesignReactNative.anon.ReadonlyPickerProps
import typings.antDesignReactNative.anon.ValueAny
import typings.antDesignReactNative.pickerTypesMod.PickerProps
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativePickerAndroidMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@ant-design/react-native/lib/picker/NativePicker.android", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ComponentDidMount {
    def this(props: ReadonlyPickerProps) = this()
    def this(props: PickerProps) = this()
    def this(props: PickerProps, context: Any) = this()
  }
  object default {
    
    @JSImport("@ant-design/react-native/lib/picker/NativePicker.android", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Item(_props: ValueAny): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Item")(_props.asInstanceOf[js.Any]).asInstanceOf[Null]
    
    @JSImport("@ant-design/react-native/lib/picker/NativePicker.android", "default.contextType")
    @js.native
    def contextType: js.UndefOr[Context[Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  trait IPickerProp extends StObject {
    
    var doScrollingComplete: js.Function
    
    var select: js.Function
  }
  object IPickerProp {
    
    inline def apply(doScrollingComplete: js.Function, select: js.Function): IPickerProp = {
      val __obj = js.Dynamic.literal(doScrollingComplete = doScrollingComplete.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPickerProp]
    }
    
    extension [Self <: IPickerProp](x: Self) {
      
      inline def setDoScrollingComplete(value: js.Function): Self = StObject.set(x, "doScrollingComplete", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: js.Function): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    }
  }
}
