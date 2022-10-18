package typings.antDesignReactNative

import typings.antDesignReactNative.anon.OnChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerViewMod {
  
  @JSImport("@ant-design/react-native/lib/picker-view", JSImport.Default)
  @js.native
  open class default ()
    extends typings.antDesignReactNative.libPickerViewPickerViewMod.default
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/picker-view", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/picker-view", "default.defaultProps")
    @js.native
    def defaultProps: OnChange = js.native
    inline def defaultProps_=(x: OnChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
