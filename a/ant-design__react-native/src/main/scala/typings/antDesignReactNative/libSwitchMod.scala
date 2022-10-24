package typings.antDesignReactNative

import typings.antDesignReactNative.libSwitchSwitchMod.SwitchProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwitchMod {
  
  object default {
    
    inline def apply(param0: SwitchProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@ant-design/react-native/lib/switch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/switch", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
