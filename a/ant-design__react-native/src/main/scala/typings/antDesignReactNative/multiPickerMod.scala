package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ComponentDidCatch
import typings.antDesignReactNative.anon.OnValueChange
import typings.antDesignReactNative.anon.Readonlydefault
import typings.antDesignReactNative.multiPickerPropsMod.MultiPickerProps
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiPickerMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@ant-design/react-native/lib/picker/MultiPicker", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ComponentDidCatch {
    def this(props: Readonlydefault) = this()
    def this(props: MultiPickerProps) = this()
    def this(props: MultiPickerProps, context: Any) = this()
  }
  object default {
    
    @JSImport("@ant-design/react-native/lib/picker/MultiPicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/picker/MultiPicker", "default.contextType")
    @js.native
    def contextType: js.UndefOr[Context[Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/picker/MultiPicker", "default.defaultProps")
    @js.native
    def defaultProps: OnValueChange = js.native
    inline def defaultProps_=(x: OnValueChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait MultiPickerProp extends StObject {
    
    var getValue: js.Function
  }
  object MultiPickerProp {
    
    inline def apply(getValue: js.Function): MultiPickerProp = {
      val __obj = js.Dynamic.literal(getValue = getValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiPickerProp]
    }
    
    extension [Self <: MultiPickerProp](x: Self) {
      
      inline def setGetValue(value: js.Function): Self = StObject.set(x, "getValue", value.asInstanceOf[js.Any])
    }
  }
}
