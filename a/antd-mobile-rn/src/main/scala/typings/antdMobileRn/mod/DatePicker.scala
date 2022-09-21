package typings.antdMobileRn.mod

import typings.antdMobileRn.anon.AntLocale
import typings.antdMobileRn.anon.MinuteStep
import typings.antdMobileRn.datePickerIndexNativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn", "DatePicker")
@js.native
open class DatePicker () extends default
/* static members */
object DatePicker {
  
  @JSImport("antd-mobile-rn", "DatePicker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile-rn", "DatePicker.contextTypes")
  @js.native
  def contextTypes: AntLocale = js.native
  inline def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile-rn", "DatePicker.defaultProps")
  @js.native
  def defaultProps: MinuteStep = js.native
  inline def defaultProps_=(x: MinuteStep): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
