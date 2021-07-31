package typings.antDesignReactNative.mod

import typings.antDesignReactNative.listViewMod.default
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "ListView")
@js.native
class ListView[T] () extends default[T]
object ListView {
  
  /* static member */
  object contextTypes {
    
    @JSImport("@ant-design/react-native", "ListView.contextTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native", "ListView.contextTypes.antLocale")
    @js.native
    def antLocale: Requireable[js.Object] = js.native
    @scala.inline
    def antLocale_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("antLocale")(x.asInstanceOf[js.Any])
  }
}
