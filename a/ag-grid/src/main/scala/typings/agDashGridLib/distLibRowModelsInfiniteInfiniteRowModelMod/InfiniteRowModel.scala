package typings
package agDashGridLib.distLibRowModelsInfiniteInfiniteRowModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/infinite/infiniteRowModel", "InfiniteRowModel")
@js.native
class InfiniteRowModel ()
  extends agDashGridLib.distLibContextBeanStubMod.BeanStub
     with agDashGridLib.distLibInterfacesIRowModelMod.IRowModel {
  var columnApi: js.Any = js.native
  var context: js.Any = js.native
  var datasource: js.Any = js.native
  var eventService: js.Any = js.native
  var filterManager: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var infiniteCache: js.Any = js.native
  var rowHeight: js.Any = js.native
  var rowNodeBlockLoader: js.Any = js.native
  var selectionController: js.Any = js.native
  var sortController: js.Any = js.native
  /* private */ def addEventListeners(): js.Any = js.native
  /* private */ def checkForDeprecated(): js.Any = js.native
  /* private */ def createModelUpdatedEvent(): js.Any = js.native
  /* private */ def destroyCache(): js.Any = js.native
  /* private */ def destroyDatasource(): js.Any = js.native
  /** Iterate through each node. What this does depends on the model type. For clientSide, goes through
    * all nodes. For pagination, goes through current page. For virtualPage, goes through what's loaded in memory. */
  /* CompleteClass */
  override def forEachNode(callback: js.Function1[/* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, scala.Unit]): scala.Unit = js.native
  def forEachNode(
    callback: js.Function2[
      /* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, 
      /* index */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getBlockState(): js.Any = js.native
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
  /** The base class returns the type. We use this instead of 'instanceof' as the client might provide
    * their own implementation of the models in the future. */
  /* CompleteClass */
  override def getType(): java.lang.String = js.native
  def getVirtualRowCount(): scala.Double = js.native
  def init(): scala.Unit = js.native
  /** Returns true if this model has no rows, regardless of model filter. EG if rows present, but filtered
    * out, this still returns false. If it returns true, then the grid shows the 'no rows' overlay - but we
    * don't show that overlay if the rows are just filtered out. */
  /* CompleteClass */
  override def isEmpty(): scala.Boolean = js.native
  /**
    * It tells us if this row model knows about the last row that it can produce. This is used by the
    * PaginationPanel, if last row is not found, then the 'last' button is disabled and the last page is
    * not shown. This is always true for ClientSideRowModel. It toggles for InfiniteRowModel.
    */
  /* CompleteClass */
  override def isLastRowFound(): scala.Boolean = js.native
  def isMaxRowFound(): scala.Boolean = js.native
  /** Returns true if the provided rowNode is in the list of rows to render */
  /* CompleteClass */
  override def isRowPresent(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Boolean = js.native
  /** Returns true if no rows (either no rows at all, or the rows are filtered out). This is what the grid
    * uses to know if there are rows to render or not. */
  /* CompleteClass */
  override def isRowsToRender(): scala.Boolean = js.native
  /* private */ def onCacheUpdated(): js.Any = js.native
  /* private */ def onColumnEverything(): js.Any = js.native
  /* private */ def onFilterChanged(): js.Any = js.native
  /* private */ def onSortChanged(): js.Any = js.native
  def purgeCache(): scala.Unit = js.native
  def refreshCache(): scala.Unit = js.native
  /* private */ def reset(): js.Any = js.native
  /* private */ def resetCache(): js.Any = js.native
  def setDatasource(datasource: agDashGridLib.distLibRowModelsIDatasourceMod.IDatasource): scala.Unit = js.native
  def setVirtualRowCount(rowCount: scala.Double): scala.Unit = js.native
  def setVirtualRowCount(rowCount: scala.Double, maxRowFound: scala.Boolean): scala.Unit = js.native
  def updateRowData(transaction: agDashGridLib.distLibRowModelsClientSideClientSideRowModelMod.RowDataTransaction): scala.Unit = js.native
}

