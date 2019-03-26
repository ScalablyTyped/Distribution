package typings
package agDashGridLib.distLibRowModelsPaginationProxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/paginationProxy", "PaginationProxy")
@js.native
class PaginationProxy ()
  extends agDashGridLib.distLibContextBeanStubMod.BeanStub
     with agDashGridLib.distLibInterfacesIRowModelMod.IRowModel {
  var active: js.Any = js.native
  var bottomRowBounds: js.Any = js.native
  var bottomRowIndex: js.Any = js.native
  var columnApi: js.Any = js.native
  var currentPage: js.Any = js.native
  var eventService: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var pageSize: js.Any = js.native
  var pixelOffset: js.Any = js.native
  var rowModel: js.Any = js.native
  var selectionController: js.Any = js.native
  var topRowBounds: js.Any = js.native
  var topRowIndex: js.Any = js.native
  var totalPages: js.Any = js.native
  /** Iterate through each node. What this does depends on the model type. For clientSide, goes through
    * all nodes. For pagination, goes through current page. For virtualPage, goes through what's loaded in memory. */
  /* CompleteClass */
  override def forEachNode(callback: js.Function1[/* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, scala.Unit]): scala.Unit = js.native
  def getCurrentPage(): scala.Double = js.native
  /** Returns total height of all the rows - used to size the height of the grid div that contains the rows */
  /* CompleteClass */
  override def getCurrentPageHeight(): scala.Double = js.native
  /** Returns all rows in range that should be selected. If there is a gap in range (non ClientSideRowModel) then
    *  then no rows should be returned  */
  /* CompleteClass */
  override def getNodesInRangeForSelection(
    first: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    last: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  ): js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  /** Returns the first and last rows to render. */
  /* CompleteClass */
  override def getPageFirstRow(): scala.Double = js.native
  /* CompleteClass */
  override def getPageLastRow(): scala.Double = js.native
  def getPageSize(): scala.Double = js.native
  def getPixelOffset(): scala.Double = js.native
  /** Returns the rowNode at the given index. */
  /* CompleteClass */
  override def getRow(index: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  /** Returns row top and bottom for a given row */
  /* CompleteClass */
  override def getRowBounds(index: scala.Double): agDashGridLib.distLibInterfacesIRowModelMod.RowBounds = js.native
  /** This is legacy, not used by ag-Grid, but keeping for backward compatibility */
  /* CompleteClass */
  override def getRowCount(): scala.Double = js.native
  /** Returns the row index at the given pixel */
  /* CompleteClass */
  override def getRowIndexAtPixel(pixel: scala.Double): scala.Double = js.native
  /** Returns the rowNode for given id. */
  /* CompleteClass */
  override def getRowNode(id: java.lang.String): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getTotalPages(): scala.Double = js.native
  def getTotalRowCount(): scala.Double = js.native
  /** The base class returns the type. We use this instead of 'instanceof' as the client might provide
    * their own implementation of the models in the future. */
  /* CompleteClass */
  override def getType(): java.lang.String = js.native
  def goToFirstPage(): scala.Unit = js.native
  def goToLastPage(): scala.Unit = js.native
  def goToNextPage(): scala.Unit = js.native
  def goToPage(page: scala.Double): scala.Unit = js.native
  def goToPageWithIndex(index: js.Any): scala.Unit = js.native
  def goToPreviousPage(): scala.Unit = js.native
  /** Returns true if this model has no rows, regardless of model filter. EG if rows present, but filtered
    * out, this still returns false. If it returns true, then the grid shows the 'no rows' overlay - but we
    * don't show that overlay if the rows are just filtered out. */
  /* CompleteClass */
  override def isEmpty(): scala.Boolean = js.native
  def isLastPageFound(): scala.Boolean = js.native
  /**
    * It tells us if this row model knows about the last row that it can produce. This is used by the
    * PaginationPanel, if last row is not found, then the 'last' button is disabled and the last page is
    * not shown. This is always true for ClientSideRowModel. It toggles for InfiniteRowModel.
    */
  /* CompleteClass */
  override def isLastRowFound(): scala.Boolean = js.native
  /** Returns true if the provided rowNode is in the list of rows to render */
  /* CompleteClass */
  override def isRowPresent(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Boolean = js.native
  /** Returns true if no rows (either no rows at all, or the rows are filtered out). This is what the grid
    * uses to know if there are rows to render or not. */
  /* CompleteClass */
  override def isRowsToRender(): scala.Boolean = js.native
  /* private */ def onModelUpdated(): js.Any = js.native
  /* private */ def onModelUpdated(modelUpdatedEvent: js.Any): js.Any = js.native
  /* private */ def postConstruct(): js.Any = js.native
  /* private */ def setIndexesAndBounds(): js.Any = js.native
  /* private */ def setPageSize(): js.Any = js.native
}

