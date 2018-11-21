package typings
package antdLib.libCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calendar
  extends reactLib.reactMod.Component[CalendarProps, CalendarState, js.Any] {
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCalendar(nextProps: CalendarProps): scala.Unit = js.native
  def dateCellRender(value: momentLib.momentMod.momentNs.Moment): reactLib.reactMod.Global.JSXNs.Element = js.native
  def getDateRange(validRange: js.Tuple2[momentLib.momentMod.momentNs.Moment, momentLib.momentMod.momentNs.Moment]): js.Function1[/* current */ momentLib.momentMod.momentNs.Moment, scala.Boolean] = js.native
  def getDateRange(
    validRange: js.Tuple2[momentLib.momentMod.momentNs.Moment, momentLib.momentMod.momentNs.Moment],
    disabledDate: js.Function1[/* current */ momentLib.momentMod.momentNs.Moment, scala.Boolean]
  ): js.Function1[/* current */ momentLib.momentMod.momentNs.Moment, scala.Boolean] = js.native
  def monthCellRender(value: momentLib.momentMod.momentNs.Moment): reactLib.reactMod.Global.JSXNs.Element = js.native
  def onHeaderTypeChange(`type`: java.lang.String): scala.Unit = js.native
  def onHeaderValueChange(value: momentLib.momentMod.momentNs.Moment): scala.Unit = js.native
  def onPanelChange(value: momentLib.momentMod.momentNs.Moment): scala.Unit = js.native
  def onPanelChange(value: momentLib.momentMod.momentNs.Moment, mode: CalendarMode): scala.Unit = js.native
  def onSelect(value: momentLib.momentMod.momentNs.Moment): scala.Unit = js.native
  def renderCalendar(locale: js.Any, localeCode: java.lang.String): reactLib.reactMod.Global.JSXNs.Element = js.native
  def setType(`type`: java.lang.String): scala.Unit = js.native
  @JSName("setValue")
  def setValue_changePanel(value: momentLib.momentMod.momentNs.Moment, way: antdLib.antdLibStrings.changePanel): scala.Unit = js.native
  @JSName("setValue")
  def setValue_select(value: momentLib.momentMod.momentNs.Moment, way: antdLib.antdLibStrings.select): scala.Unit = js.native
}

