package typings.agGrid

import typings.agGrid.anon.ColId
import typings.agGrid.columnMod.Column
import typings.agGrid.eventsMod.ColumnEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/sortController", JSImport.Namespace)
@js.native
object sortControllerMod extends js.Object {
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
    def getColumnsWithSortingOrdered(): js.Array[Column] = js.native
    /* private */ def getNextSortDirection(column: js.Any): js.Any = js.native
    def getSortForRowController(): js.Array[_] = js.native
    def getSortModel(): js.Array[ColId] = js.native
    def onSortChanged(): Unit = js.native
    def progressSort(column: Column, multiSort: Boolean): Unit = js.native
    def progressSort(column: Column, multiSort: Boolean, source: ColumnEventType): Unit = js.native
    def setSortForColumn(column: Column, sort: String, multiSort: Boolean): Unit = js.native
    def setSortForColumn(column: Column, sort: String, multiSort: Boolean, source: ColumnEventType): Unit = js.native
    def setSortModel(sortModel: js.Any): Unit = js.native
    def setSortModel(sortModel: js.Any, source: ColumnEventType): Unit = js.native
  }
  
  /* static members */
  @js.native
  object SortController extends js.Object {
    var DEFAULT_SORTING_ORDER: js.Any = js.native
  }
  
}

