package typings
package antdLib.libTimeDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePicker
  extends reactLib.reactMod.Component[TimePickerProps, js.Any, js.Any] {
  var timePickerRef: js.Any = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getDefaultFormat(): java.lang.String = js.native
  def handleChange(value: momentLib.momentMod.momentNs.Moment): scala.Unit = js.native
  def handleOpenClose(hasOpen: antdLib.Anon_Open): scala.Unit = js.native
  def renderTimePicker(locale: TimePickerLocale): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveTimePicker(timePickerRef: js.Any): scala.Unit = js.native
}

