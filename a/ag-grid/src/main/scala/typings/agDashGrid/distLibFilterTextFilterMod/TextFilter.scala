package typings.agDashGrid.distLibFilterTextFilterMod

import typings.agDashGrid.distLibFilterBaseFilterMod.ComparableBaseFilter
import typings.agDashGrid.distLibFilterBaseFilterMod.FilterConditionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/textFilter", "TextFilter")
@js.native
class TextFilter () extends ComparableBaseFilter[String, ITextFilterParams, SerializedTextFilter] {
  var comparator: js.Any = js.native
  var eFilterConditionTextField: js.Any = js.native
  var eFilterTextField: js.Any = js.native
  var filterConditionText: js.Any = js.native
  var filterText: js.Any = js.native
  var formatter: js.Any = js.native
  /* private */ def addFilterChangedListener(`type`: js.Any): js.Any = js.native
  @JSName("afterGuiAttached")
  def afterGuiAttached_MTextFilter(): Unit = js.native
  /* private */ def checkIndividualFilter(params: js.Any, filterType: js.Any, filterText: js.Any): js.Any = js.native
  def getFilter(): String = js.native
  /* private */ def onFilterTextFieldChanged(`type`: js.Any): js.Any = js.native
  def setFilter(filter: String, `type`: FilterConditionType): Unit = js.native
  def setType(filterType: String, `type`: FilterConditionType): Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/filter/textFilter", "TextFilter")
@js.native
object TextFilter extends js.Object {
  @JSName("DEFAULT_COMPARATOR")
  var DEFAULT_COMPARATOR_Original: TextComparator = js.native
  @JSName("DEFAULT_FORMATTER")
  var DEFAULT_FORMATTER_Original: TextFormatter = js.native
  @JSName("DEFAULT_LOWERCASE_FORMATTER")
  var DEFAULT_LOWERCASE_FORMATTER_Original: TextFormatter = js.native
  def DEFAULT_COMPARATOR(filter: String, gridValue: js.Any, filterText: String): Boolean = js.native
  def DEFAULT_FORMATTER(from: String): String = js.native
  def DEFAULT_LOWERCASE_FORMATTER(from: String): String = js.native
}

