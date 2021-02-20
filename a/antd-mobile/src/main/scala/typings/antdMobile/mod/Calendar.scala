package typings.antdMobile.mod

import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.TimePickerPickerPrefixCls
import typings.antdMobile.calendarMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile", "Calendar")
@js.native
class Calendar () extends default
/* static members */
object Calendar {
  
  @JSImport("antd-mobile", "Calendar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile", "Calendar.contextTypes")
  @js.native
  def contextTypes: AntLocale = js.native
  @scala.inline
  def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile", "Calendar.defaultProps")
  @js.native
  def defaultProps: TimePickerPickerPrefixCls = js.native
  @scala.inline
  def defaultProps_=(x: TimePickerPickerPrefixCls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
