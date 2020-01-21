package typings.antd.timePickerMod

import typings.antd.AnonOpenBoolean
import typings.antd.AnonPlaceholder
import typings.moment.mod.Moment
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePicker
  extends Component[TimePickerProps, js.Any, js.Any] {
  var timePickerRef: js.Any = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getAllowClear(): js.UndefOr[Boolean] = js.native
  def getDefaultFormat(): String = js.native
  def getDefaultLocale(): AnonPlaceholder = js.native
  def handleChange(value: Moment): Unit = js.native
  def handleOpenClose(hasOpen: AnonOpenBoolean): Unit = js.native
  def renderClearIcon(prefixCls: String): Element = js.native
  def renderInputIcon(prefixCls: String): Element = js.native
  def renderTimePicker(locale: TimePickerLocale): Element = js.native
  def saveTimePicker(timePickerRef: js.Any): Unit = js.native
}

