package typings.agGrid

import typings.agGrid.anon.ColId
import typings.agGrid.columnMod.Column
import typings.agGrid.eventsMod.ColumnEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortControllerMod {
  
  @JSImport("ag-grid/dist/lib/sortController", "SortController")
  @js.native
  class SortController () extends StObject {
    
    /* private */ def clearSortBarThisColumn(columnToSkip: js.Any, source: js.Any): js.Any = js.native
    
    var columnApi: js.Any = js.native
    
    var columnController: js.Any = js.native
    
    /* private */ def compareColIds(sortModelEntry: js.Any, column: js.Any): js.Any = js.native
    
    /* private */ def dispatchSortChangedEvents(): js.Any = js.native
    
    var eventService: js.Any = js.native
    
    def getColumnsWithSortingOrdered(): js.Array[Column] = js.native
    
    /* private */ def getNextSortDirection(column: js.Any): js.Any = js.native
    
    def getSortForRowController(): js.Array[_] = js.native
    
    def getSortModel(): js.Array[ColId] = js.native
    
    var gridApi: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    def onSortChanged(): Unit = js.native
    
    def progressSort(column: Column, multiSort: Boolean): Unit = js.native
    def progressSort(column: Column, multiSort: Boolean, source: ColumnEventType): Unit = js.native
    
    def setSortForColumn(column: Column, sort: String, multiSort: Boolean): Unit = js.native
    def setSortForColumn(column: Column, sort: String, multiSort: Boolean, source: ColumnEventType): Unit = js.native
    
    def setSortModel(sortModel: js.Any): Unit = js.native
    def setSortModel(sortModel: js.Any, source: ColumnEventType): Unit = js.native
  }
  /* static members */
  object SortController {
    
    @JSImport("ag-grid/dist/lib/sortController", "SortController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/sortController", "SortController.DEFAULT_SORTING_ORDER")
    @js.native
    def DEFAULT_SORTING_ORDER: js.Any = js.native
    @scala.inline
    def DEFAULT_SORTING_ORDER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SORTING_ORDER")(x.asInstanceOf[js.Any])
  }
}
