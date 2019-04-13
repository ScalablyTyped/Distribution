package typings
package antdLib.libCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calendar
  extends reactLib.reactMod.Component[CalendarProps, CalendarState, js.Any] {
  var prefixCls: js.UndefOr[java.lang.String] = js.native
  def dateCellRender(value: momentLib.momentMod.Moment): reactLib.reactMod.Global.JSXNs.Element = js.native
  def getDateRange(validRange: js.Tuple2[momentLib.momentMod.Moment, momentLib.momentMod.Moment]): js.Function1[/* current */ momentLib.momentMod.Moment, scala.Boolean] = js.native
  def getDateRange(
    validRange: js.Tuple2[momentLib.momentMod.Moment, momentLib.momentMod.Moment],
    disabledDate: js.Function1[/* current */ momentLib.momentMod.Moment, scala.Boolean]
  ): js.Function1[/* current */ momentLib.momentMod.Moment, scala.Boolean] = js.native
  def getDefaultLocale(): js.Any = js.native
  def monthCellRender(value: momentLib.momentMod.Moment): reactLib.reactMod.Global.JSXNs.Element = js.native
  def onHeaderTypeChange(mode: CalendarMode): scala.Unit = js.native
  def onHeaderValueChange(value: momentLib.momentMod.Moment): scala.Unit = js.native
  def onPanelChange(value: momentLib.momentMod.Moment): scala.Unit = js.native
  def onPanelChange(value: momentLib.momentMod.Moment, mode: CalendarMode): scala.Unit = js.native
  def onSelect(value: momentLib.momentMod.Moment): scala.Unit = js.native
  def renderCalendar(locale: js.Any, localeCode: java.lang.String): reactLib.reactMod.Global.JSXNs.Element = js.native
  @JSName("setValue")
  def setValue_changePanel(value: momentLib.momentMod.Moment, way: antdLib.antdLibStrings.changePanel): scala.Unit = js.native
  @JSName("setValue")
  def setValue_select(value: momentLib.momentMod.Moment, way: antdLib.antdLibStrings.select): scala.Unit = js.native
}

