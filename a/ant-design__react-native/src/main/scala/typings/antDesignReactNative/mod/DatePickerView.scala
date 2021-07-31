package typings.antDesignReactNative.mod

import typings.antDesignReactNative.anon.AntLocale
import typings.antDesignReactNative.anon.MinuteStep
import typings.antDesignReactNative.datePickerViewMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native", "DatePickerView")
@js.native
class DatePickerView () extends default
/* static members */
object DatePickerView {
  
  @JSImport("@ant-design/react-native", "DatePickerView")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "DatePickerView.contextTypes")
  @js.native
  def contextTypes: AntLocale = js.native
  @scala.inline
  def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("@ant-design/react-native", "DatePickerView.defaultProps")
  @js.native
  def defaultProps: MinuteStep = js.native
  @scala.inline
  def defaultProps_=(x: MinuteStep): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
