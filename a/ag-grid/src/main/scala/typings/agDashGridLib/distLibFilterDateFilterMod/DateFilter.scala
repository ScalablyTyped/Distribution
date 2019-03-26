package typings
package agDashGridLib.distLibFilterDateFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/dateFilter", "DateFilter")
@js.native
class DateFilter ()
  extends agDashGridLib.distLibFilterBaseFilterMod.ScalarBaseFilter[stdLib.Date, IDateFilterParams, SerializedDateFilter] {
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
  def getDateFrom(): java.lang.String = js.native
  def getDateTo(): java.lang.String = js.native
  def getFilterType(): java.lang.String = js.native
  /* private */ def onDateChanged(`type`: js.Any): js.Any = js.native
  def setDateFrom(date: java.lang.String, `type`: agDashGridLib.distLibFilterBaseFilterMod.FilterConditionType): scala.Unit = js.native
  /* private */ def setDateFrom_date(parsedDate: js.Any, `type`: js.Any): js.Any = js.native
  def setDateTo(date: java.lang.String, `type`: agDashGridLib.distLibFilterBaseFilterMod.FilterConditionType): scala.Unit = js.native
  /* private */ def setDateTo_date(parsedDate: js.Any, `type`: js.Any): js.Any = js.native
  def setType(filterType: java.lang.String, `type`: agDashGridLib.distLibFilterBaseFilterMod.FilterConditionType): scala.Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/filter/dateFilter", "DateFilter")
@js.native
object DateFilter extends js.Object {
  def removeTimezone(from: stdLib.Date): stdLib.Date = js.native
}

