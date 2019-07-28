package typings.amcharts

import typings.amcharts.stockEventMod.default
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartDate extends js.Object {
  var chart: this.type
  var date: js.UndefOr[Date] = js.undefined
  var endDate: js.UndefOr[Date] = js.undefined
  var eventObject: js.UndefOr[default] = js.undefined
  var graph: js.UndefOr[typings.amcharts.stockGraphMod.default] = js.undefined
  var panel: js.UndefOr[typings.amcharts.stockPanelMod.default] = js.undefined
  var period: js.UndefOr[String] = js.undefined
  var startDate: js.UndefOr[Date] = js.undefined
  var `type`: String
}

object Anon_ChartDate {
  @scala.inline
  def apply(
    chart: Anon_ChartDate,
    `type`: String,
    date: Date = null,
    endDate: Date = null,
    eventObject: default = null,
    graph: typings.amcharts.stockGraphMod.default = null,
    panel: typings.amcharts.stockPanelMod.default = null,
    period: String = null,
    startDate: Date = null
  ): Anon_ChartDate = {
    val __obj = js.Dynamic.literal(chart = chart)
    __obj.updateDynamic("type")(`type`)
    if (date != null) __obj.updateDynamic("date")(date)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (eventObject != null) __obj.updateDynamic("eventObject")(eventObject)
    if (graph != null) __obj.updateDynamic("graph")(graph)
    if (panel != null) __obj.updateDynamic("panel")(panel)
    if (period != null) __obj.updateDynamic("period")(period)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[Anon_ChartDate]
  }
}

