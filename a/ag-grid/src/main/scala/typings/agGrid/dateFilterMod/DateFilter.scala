package typings.agGrid.dateFilterMod

import typings.agGrid.baseFilterMod.FilterConditionType
import typings.agGrid.baseFilterMod.ScalarBaseFilter
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/dateFilter", "DateFilter")
@js.native
class DateFilter () extends ScalarBaseFilter[Date, IDateFilterParams, SerializedDateFilter] {
  var componentRecipes: js.Any = js.native
  var dateFrom: js.Any = js.native
  var dateFromComponent: js.Any = js.native
  var dateFromCondition: js.Any = js.native
  var dateFromConditionComponent: js.Any = js.native
  var dateTo: js.Any = js.native
  var dateToComponent: js.Any = js.native
  var dateToCondition: js.Any = js.native
  var dateToConditionComponent: js.Any = js.native
  var eDateFromConditionPanel: js.Any = js.native
  var eDateFromPanel: js.Any = js.native
  var eDateToConditionPanel: js.Any = js.native
  var eDateToPanel: js.Any = js.native
  /* private */ def createComponents(`type`: js.Any): js.Any = js.native
  /* private */ def defaultComparator(filterDate: js.Any, cellValue: js.Any): js.Any = js.native
  def getDateFrom(): String = js.native
  def getDateTo(): String = js.native
  def getFilterType(): String = js.native
  /* private */ def onDateChanged(`type`: js.Any): js.Any = js.native
  def setDateFrom(date: String, `type`: FilterConditionType): Unit = js.native
  /* private */ def setDateFrom_date(parsedDate: js.Any, `type`: js.Any): js.Any = js.native
  def setDateTo(date: String, `type`: FilterConditionType): Unit = js.native
  /* private */ def setDateTo_date(parsedDate: js.Any, `type`: js.Any): js.Any = js.native
  def setType(filterType: String, `type`: FilterConditionType): Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/filter/dateFilter", "DateFilter")
@js.native
object DateFilter extends js.Object {
  def removeTimezone(from: Date): Date = js.native
}

