package typings
package agDashGridLib.distLibSortControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/sortController", "SortController")
@js.native
class SortController () extends js.Object {
  var columnApi: js.Any = js.native
  var columnController: js.Any = js.native
  var eventService: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  /* private */ def clearSortBarThisColumn(columnToSkip: js.Any, source: js.Any): js.Any = js.native
  /* private */ def compareColIds(sortModelEntry: js.Any, column: js.Any): js.Any = js.native
  /* private */ def dispatchSortChangedEvents(): js.Any = js.native
  def getColumnsWithSortingOrdered(): js.Array[agDashGridLib.distLibEntitiesColumnMod.Column] = js.native
  /* private */ def getNextSortDirection(column: js.Any): js.Any = js.native
  def getSortForRowController(): js.Array[_] = js.native
  def getSortModel(): js.Array[agDashGridLib.Anon_ColId] = js.native
  def onSortChanged(): scala.Unit = js.native
  def progressSort(column: agDashGridLib.distLibEntitiesColumnMod.Column, multiSort: scala.Boolean): scala.Unit = js.native
  def progressSort(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    multiSort: scala.Boolean,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setSortForColumn(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    sort: java.lang.String,
    multiSort: scala.Boolean
  ): scala.Unit = js.native
  def setSortForColumn(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    sort: java.lang.String,
    multiSort: scala.Boolean,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setSortModel(sortModel: js.Any): scala.Unit = js.native
  def setSortModel(sortModel: js.Any, source: agDashGridLib.distLibEventsMod.ColumnEventType): scala.Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/sortController", "SortController")
@js.native
object SortController extends js.Object {
  var DEFAULT_SORTING_ORDER: js.Any = js.native
}

