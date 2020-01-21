package typings.agGrid.numberFilterMod

import typings.agGrid.baseFilterMod.FilterConditionType
import typings.agGrid.baseFilterMod.ScalarBaseFilter
import typings.agGrid.textFilterMod.INumberFilterParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/numberFilter", "NumberFilter")
@js.native
class NumberFilter () extends ScalarBaseFilter[Double, INumberFilterParams, SerializedNumberFilter] {
  var eFilterTextConditionField: js.Any = js.native
  var eFilterTextField: js.Any = js.native
  var eFilterToConditionText: js.Any = js.native
  var eFilterToTextField: js.Any = js.native
  var eNumberToConditionPanel: js.Any = js.native
  var eNumberToPanel: js.Any = js.native
  var filterNumber: js.Any = js.native
  var filterNumberCondition: js.Any = js.native
  var filterNumberConditionTo: js.Any = js.native
  var filterNumberTo: js.Any = js.native
  /* private */ def addFilterChangedEventListeners(`type`: js.Any, filterElement: js.Any, filterToElement: js.Any): js.Any = js.native
  @JSName("afterGuiAttached")
  def afterGuiAttached_MNumberFilter(): Unit = js.native
  /* private */ def asNumber(value: js.Any): js.Any = js.native
  def getFilter(`type`: FilterConditionType): js.Any = js.native
  /* private */ def onTextFieldsChanged(`type`: js.Any, filterElement: js.Any, filterToElement: js.Any): js.Any = js.native
  def setFilter(filter: js.Any, `type`: FilterConditionType): Unit = js.native
  def setFilterTo(filter: js.Any, `type`: FilterConditionType): Unit = js.native
  def setType(filterType: String, `type`: FilterConditionType): Unit = js.native
  /* private */ def stringToFloat(value: js.Any): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/filter/numberFilter", "NumberFilter")
@js.native
object NumberFilter extends js.Object {
  var LESS_THAN: String = js.native
}

