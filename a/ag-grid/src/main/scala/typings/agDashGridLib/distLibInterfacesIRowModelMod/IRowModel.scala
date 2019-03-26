package typings
package agDashGridLib.distLibInterfacesIRowModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowModel extends js.Object {
  /** Iterate through each node. What this does depends on the model type. For clientSide, goes through
    * all nodes. For pagination, goes through current page. For virtualPage, goes through what's loaded in memory. */
  def forEachNode(callback: js.Function1[/* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, scala.Unit]): scala.Unit
  /** Returns total height of all the rows - used to size the height of the grid div that contains the rows */
  def getCurrentPageHeight(): scala.Double
  /** Returns all rows in range that should be selected. If there is a gap in range (non ClientSideRowModel) then
    *  then no rows should be returned  */
  def getNodesInRangeForSelection(
    first: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    last: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  ): js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode]
  /** Returns the first and last rows to render. */
  def getPageFirstRow(): scala.Double
  def getPageLastRow(): scala.Double
  /** Returns the rowNode at the given index. */
  def getRow(index: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  /** Returns row top and bottom for a given row */
  def getRowBounds(index: scala.Double): RowBounds
  /** This is legacy, not used by ag-Grid, but keeping for backward compatibility */
  def getRowCount(): scala.Double
  /** Returns the row index at the given pixel */
  def getRowIndexAtPixel(pixel: scala.Double): scala.Double
  /** Returns the rowNode for given id. */
  def getRowNode(id: java.lang.String): agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  /** The base class returns the type. We use this instead of 'instanceof' as the client might provide
    * their own implementation of the models in the future. */
  def getType(): java.lang.String
  /** Returns true if this model has no rows, regardless of model filter. EG if rows present, but filtered
    * out, this still returns false. If it returns true, then the grid shows the 'no rows' overlay - but we
    * don't show that overlay if the rows are just filtered out. */
  def isEmpty(): scala.Boolean
  /**
    * It tells us if this row model knows about the last row that it can produce. This is used by the
    * PaginationPanel, if last row is not found, then the 'last' button is disabled and the last page is
    * not shown. This is always true for ClientSideRowModel. It toggles for InfiniteRowModel.
    */
  def isLastRowFound(): scala.Boolean
  /** Returns true if the provided rowNode is in the list of rows to render */
  def isRowPresent(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Boolean
  /** Returns true if no rows (either no rows at all, or the rows are filtered out). This is what the grid
    * uses to know if there are rows to render or not. */
  def isRowsToRender(): scala.Boolean
}

object IRowModel {
  @scala.inline
  def apply(
    forEachNode: js.Function1[/* rowNode */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, scala.Unit] => scala.Unit,
    getCurrentPageHeight: () => scala.Double,
    getNodesInRangeForSelection: (agDashGridLib.distLibEntitiesRowNodeMod.RowNode, agDashGridLib.distLibEntitiesRowNodeMod.RowNode) => js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode],
    getPageFirstRow: () => scala.Double,
    getPageLastRow: () => scala.Double,
    getRow: scala.Double => agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    getRowBounds: scala.Double => RowBounds,
    getRowCount: () => scala.Double,
    getRowIndexAtPixel: scala.Double => scala.Double,
    getRowNode: java.lang.String => agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    getType: () => java.lang.String,
    isEmpty: () => scala.Boolean,
    isLastRowFound: () => scala.Boolean,
    isRowPresent: agDashGridLib.distLibEntitiesRowNodeMod.RowNode => scala.Boolean,
    isRowsToRender: () => scala.Boolean
  ): IRowModel = {
    val __obj = js.Dynamic.literal(forEachNode = js.Any.fromFunction1(forEachNode), getCurrentPageHeight = js.Any.fromFunction0(getCurrentPageHeight), getNodesInRangeForSelection = js.Any.fromFunction2(getNodesInRangeForSelection), getPageFirstRow = js.Any.fromFunction0(getPageFirstRow), getPageLastRow = js.Any.fromFunction0(getPageLastRow), getRow = js.Any.fromFunction1(getRow), getRowBounds = js.Any.fromFunction1(getRowBounds), getRowCount = js.Any.fromFunction0(getRowCount), getRowIndexAtPixel = js.Any.fromFunction1(getRowIndexAtPixel), getRowNode = js.Any.fromFunction1(getRowNode), getType = js.Any.fromFunction0(getType), isEmpty = js.Any.fromFunction0(isEmpty), isLastRowFound = js.Any.fromFunction0(isLastRowFound), isRowPresent = js.Any.fromFunction1(isRowPresent), isRowsToRender = js.Any.fromFunction0(isRowsToRender))
  
    __obj.asInstanceOf[IRowModel]
  }
}

