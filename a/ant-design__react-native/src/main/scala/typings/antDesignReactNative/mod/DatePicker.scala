package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.Mode
import typings.antDesignReactNative.datePickerMod.default
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "DatePicker")
@js.native
open class DatePicker () extends default
/* static members */
object DatePicker {
  
  @JSImport("@ant-design/react-native", "DatePicker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "DatePicker.contextType")
  @js.native
  def contextType: Context[js.Object] = js.native
  inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "DatePicker.defaultProps")
  @js.native
  def defaultProps: Mode = js.native
  inline def defaultProps_=(x: Mode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
