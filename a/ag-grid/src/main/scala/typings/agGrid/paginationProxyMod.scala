package typings.agGrid

import typings.agGrid.beanStubMod.BeanStub
import typings.agGrid.gridPanelMod.GridPanel
import typings.agGrid.iRowModelMod.IRowModel
import typings.agGrid.iRowModelMod.RowBounds
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationProxyMod {
  
  @JSImport("ag-grid/dist/lib/rowModels/paginationProxy", "PaginationAutoPageSizeService")
  @js.native
  class PaginationAutoPageSizeService () extends BeanStub {
    
    /* private */ def checkPageSize(): js.Any = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /* private */ var gridPanel: js.Any = js.native
    
    /* private */ def notActive(): js.Any = js.native
    
    /* private */ def onBodyHeightChanged(): js.Any = js.native
    
    /* private */ def onScrollVisibilityChanged(): js.Any = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    /* private */ var scrollVisibleService: js.Any = js.native
  }
  
  @JSImport("ag-grid/dist/lib/rowModels/paginationProxy", "PaginationProxy")
  @js.native
  class PaginationProxy ()
    extends BeanStub
       with IRowModel {
    
    /* private */ var active: js.Any = js.native
    
    /* private */ var bottomRowBounds: js.Any = js.native
    
    /* private */ var bottomRowIndex: js.Any = js.native
    
    /* private */ var columnApi: js.Any = js.native
    
    /* private */ var currentPage: js.Any = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    /** Iterate through each node. What this does depends on the model type. For clientSide, goes through
      * all nodes. For pagination, goes through current page. For virtualPage, goes through what's loaded in memory. */
    /* CompleteClass */
    override def forEachNode(callback: js.Function1[/* rowNode */ RowNode, Unit]): Unit = js.native
    
    def getCurrentPage(): Double = js.native
    
    /** Returns total height of all the rows - used to size the height of the grid div that contains the rows */
    /* CompleteClass */
    override def getCurrentPageHeight(): Double = js.native
    
    /** Returns all rows in range that should be selected. If there is a gap in range (non ClientSideRowModel) then
      *  then no rows should be returned  */
    /* CompleteClass */
    override def getNodesInRangeForSelection(first: RowNode, last: RowNode): js.Array[RowNode] = js.native
    
    /** Returns the first and last rows to render. */
    /* CompleteClass */
    override def getPageFirstRow(): Double = js.native
    
    /* CompleteClass */
    override def getPageLastRow(): Double = js.native
    
    def getPageSize(): Double = js.native
    
    def getPixelOffset(): Double = js.native
    
    /** Returns the rowNode at the given index. */
    /* CompleteClass */
    override def getRow(index: Double): RowNode = js.native
    
    /** Returns row top and bottom for a given row */
    /* CompleteClass */
    override def getRowBounds(index: Double): RowBounds = js.native
    
    /** This is legacy, not used by ag-Grid, but keeping for backward compatibility */
    /* CompleteClass */
    override def getRowCount(): Double = js.native
    
    /** Returns the row index at the given pixel */
    /* CompleteClass */
    override def getRowIndexAtPixel(pixel: Double): Double = js.native
    
    /** Returns the rowNode for given id. */
    /* CompleteClass */
    override def getRowNode(id: String): RowNode = js.native
    
    def getTotalPages(): Double = js.native
    
    def getTotalRowCount(): Double = js.native
    
    /** The base class returns the type. We use this instead of 'instanceof' as the client might provide
      * their own implementation of the models in the future. */
    /* CompleteClass */
    override def getType(): String = js.native
    
    def goToFirstPage(): Unit = js.native
    
    def goToLastPage(): Unit = js.native
    
    def goToNextPage(): Unit = js.native
    
    def goToPage(page: Double): Unit = js.native
    
    def goToPageWithIndex(index: js.Any): Unit = js.native
    
    def goToPreviousPage(): Unit = js.native
    
    /* private */ var gridApi: js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /** Returns true if this model has no rows, regardless of model filter. EG if rows present, but filtered
      * out, this still returns false. If it returns true, then the grid shows the 'no rows' overlay - but we
      * don't show that overlay if the rows are just filtered out. */
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    def isLastPageFound(): Boolean = js.native
    
    /**
      * It tells us if this row model knows about the last row that it can produce. This is used by the
      * PaginationPanel, if last row is not found, then the 'last' button is disabled and the last page is
      * not shown. This is always true for ClientSideRowModel. It toggles for InfiniteRowModel.
      */
    /* CompleteClass */
    override def isLastRowFound(): Boolean = js.native
    
    /** Returns true if the provided rowNode is in the list of rows to render */
    /* CompleteClass */
    override def isRowPresent(rowNode: RowNode): Boolean = js.native
    
    /** Returns true if no rows (either no rows at all, or the rows are filtered out). This is what the grid
      * uses to know if there are rows to render or not. */
    /* CompleteClass */
    override def isRowsToRender(): Boolean = js.native
    
    /* private */ def onModelUpdated(modelUpdatedEvent: js.Any): js.Any = js.native
    
    /* private */ var pageSize: js.Any = js.native
    
    /* private */ var pixelOffset: js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    /* private */ var rowModel: js.Any = js.native
    
    /* private */ var selectionController: js.Any = js.native
    
    /* private */ def setIndexesAndBounds(): js.Any = js.native
    
    /* private */ def setPageSize(): js.Any = js.native
    
    /* private */ var topRowBounds: js.Any = js.native
    
    /* private */ var topRowIndex: js.Any = js.native
    
    /* private */ var totalPages: js.Any = js.native
  }
}
