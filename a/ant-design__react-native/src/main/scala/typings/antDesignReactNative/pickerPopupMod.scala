package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ActionTextActiveOpacity
import typings.antDesignReactNative.anon.ComponentDidUpdate
import typings.antDesignReactNative.anon.ReadonlyPopupPickerProps
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerPopupMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@ant-design/react-native/lib/picker/Popup", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ComponentDidUpdate {
    def this(props: ReadonlyPopupPickerProps) = this()
  }
  object default {
    
    @JSImport("@ant-design/react-native/lib/picker/Popup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/picker/Popup", "default.contextType")
    @js.native
    def contextType: js.UndefOr[Context[Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/picker/Popup", "default.defaultProps")
    @js.native
    def defaultProps: ActionTextActiveOpacity = js.native
    inline def defaultProps_=(x: ActionTextActiveOpacity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
