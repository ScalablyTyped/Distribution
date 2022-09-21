package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.MinuteStep
import typings.antDesignReactNative.datePickerViewMod.default
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "DatePickerView")
@js.native
open class DatePickerView () extends default
/* static members */
object DatePickerView {
  
  @JSImport("@ant-design/react-native", "DatePickerView")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "DatePickerView.contextType")
  @js.native
  def contextType: Context[js.Object] = js.native
  inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "DatePickerView.defaultProps")
  @js.native
  def defaultProps: MinuteStep = js.native
  inline def defaultProps_=(x: MinuteStep): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
