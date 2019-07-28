package typings.antd.libCalendarMod

import typings.antd.antdStrings.changePanel
import typings.antd.antdStrings.select
import typings.moment.momentMod.Moment
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calendar
  extends Component[CalendarProps, CalendarState, js.Any] {
  var prefixCls: js.UndefOr[String] = js.native
  def dateCellRender(value: Moment): Element = js.native
  def getDateRange(validRange: js.Tuple2[Moment, Moment]): js.Function1[/* current */ Moment, Boolean] = js.native
  def getDateRange(validRange: js.Tuple2[Moment, Moment], disabledDate: js.Function1[/* current */ Moment, Boolean]): js.Function1[/* current */ Moment, Boolean] = js.native
  def getDefaultLocale(): js.Any = js.native
  def monthCellRender(value: Moment): Element = js.native
  def onHeaderTypeChange(mode: CalendarMode): Unit = js.native
  def onHeaderValueChange(value: Moment): Unit = js.native
  def onPanelChange(value: Moment): Unit = js.native
  def onPanelChange(value: Moment, mode: CalendarMode): Unit = js.native
  def onSelect(value: Moment): Unit = js.native
  def renderCalendar(locale: js.Any, localeCode: String): Element = js.native
  @JSName("setValue")
  def setValue_changePanel(value: Moment, way: changePanel): Unit = js.native
  @JSName("setValue")
  def setValue_select(value: Moment, way: select): Unit = js.native
}

