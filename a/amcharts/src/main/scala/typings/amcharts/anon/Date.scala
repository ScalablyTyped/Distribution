package typings.amcharts.anon

import typings.amcharts.stockEventMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var chart: this.type
  var date: js.UndefOr[typings.std.Date] = js.undefined
  var endDate: js.UndefOr[typings.std.Date] = js.undefined
  var eventObject: js.UndefOr[default] = js.undefined
  var graph: js.UndefOr[typings.amcharts.stockGraphMod.default] = js.undefined
  var panel: js.UndefOr[typings.amcharts.stockPanelMod.default] = js.undefined
  var period: js.UndefOr[String] = js.undefined
  var startDate: js.UndefOr[typings.std.Date] = js.undefined
  var `type`: String
}

object Date {
  @scala.inline
  def apply(
    chart: Date,
    `type`: String,
    date: typings.std.Date = null,
    endDate: typings.std.Date = null,
    eventObject: default = null,
    graph: typings.amcharts.stockGraphMod.default = null,
    panel: typings.amcharts.stockPanelMod.default = null,
    period: String = null,
    startDate: typings.std.Date = null
  ): Date = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (eventObject != null) __obj.updateDynamic("eventObject")(eventObject.asInstanceOf[js.Any])
    if (graph != null) __obj.updateDynamic("graph")(graph.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

