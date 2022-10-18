package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.Cascade
import typings.antDesignReactNative.libPickerMod.default
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "Picker")
@js.native
open class Picker () extends default
/* static members */
object Picker {
  
  @JSImport("@ant-design/react-native", "Picker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "Picker.contextType")
  @js.native
  def contextType: Context[js.Object] = js.native
  inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "Picker.defaultProps")
  @js.native
  def defaultProps: Cascade = js.native
  inline def defaultProps_=(x: Cascade): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
