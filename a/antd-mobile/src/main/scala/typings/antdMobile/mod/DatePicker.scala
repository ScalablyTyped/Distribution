package typings.antdMobile.mod

import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.MinuteStep
import typings.antdMobile.datePickerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile", "DatePicker")
@js.native
class DatePicker () extends default
/* static members */
object DatePicker {
  
  @JSImport("antd-mobile", "DatePicker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile", "DatePicker.contextTypes")
  @js.native
  def contextTypes: AntLocale = js.native
  inline def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile", "DatePicker.defaultProps")
  @js.native
  def defaultProps: MinuteStep = js.native
  inline def defaultProps_=(x: MinuteStep): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
