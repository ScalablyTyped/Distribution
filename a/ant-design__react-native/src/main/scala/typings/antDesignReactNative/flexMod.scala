package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Align
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexMod {
  
  @JSImport("@ant-design/react-native/lib/flex", JSImport.Default)
  @js.native
  open class default ()
    extends typings.antDesignReactNative.flexFlexMod.default
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/flex", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/flex", "default.Item")
    @js.native
    def Item: Any = js.native
    inline def Item_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/flex", "default.defaultProps")
    @js.native
    def defaultProps: Align = js.native
    inline def defaultProps_=(x: Align): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
