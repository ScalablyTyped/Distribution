package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.AntLocale
import typings.antDesignReactNative.anon.Mode
import typings.antDesignReactNative.datePickerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "DatePicker")
@js.native
class DatePicker () extends default
/* static members */
object DatePicker {
  
  @JSImport("@ant-design/react-native", "DatePicker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "DatePicker.contextTypes")
  @js.native
  def contextTypes: AntLocale = js.native
  @scala.inline
  def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "DatePicker.defaultProps")
  @js.native
  def defaultProps: Mode = js.native
  @scala.inline
  def defaultProps_=(x: Mode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
