package typings.agGrid.iRowModelMod

import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowModel extends js.Object {
  /** Iterate through each node. What this does depends on the model type. For clientSide, goes through
    * all nodes. For pagination, goes through current page. For virtualPage, goes through what's loaded in memory. */
  def forEachNode(callback: js.Function1[/* rowNode */ RowNode, Unit]): Unit = js.native
  /** Returns total height of all the rows - used to size the height of the grid div that contains the rows */
  def getCurrentPageHeight(): Double = js.native
  /** Returns all rows in range that should be selected. If there is a gap in range (non ClientSideRowModel) then
    *  then no rows should be returned  */
  def getNodesInRangeForSelection(first: RowNode, last: RowNode): js.Array[RowNode] = js.native
  /** Returns the first and last rows to render. */
  def getPageFirstRow(): Double = js.native
  def getPageLastRow(): Double = js.native
  /** Returns the rowNode at the given index. */
  def getRow(index: Double): RowNode = js.native
  /** Returns row top and bottom for a given row */
  def getRowBounds(index: Double): RowBounds = js.native
  /** This is legacy, not used by ag-Grid, but keeping for backward compatibility */
  def getRowCount(): Double = js.native
  /** Returns the row index at the given pixel */
  def getRowIndexAtPixel(pixel: Double): Double = js.native
  /** Returns the rowNode for given id. */
  def getRowNode(id: String): RowNode = js.native
  /** The base class returns the type. We use this instead of 'instanceof' as the client might provide
    * their own implementation of the models in the future. */
  def getType(): String = js.native
  /** Returns true if this model has no rows, regardless of model filter. EG if rows present, but filtered
    * out, this still returns false. If it returns true, then the grid shows the 'no rows' overlay - but we
    * don't show that overlay if the rows are just filtered out. */
  def isEmpty(): Boolean = js.native
  /**
    * It tells us if this row model knows about the last row that it can produce. This is used by the
    * PaginationPanel, if last row is not found, then the 'last' button is disabled and the last page is
    * not shown. This is always true for ClientSideRowModel. It toggles for InfiniteRowModel.
    */
  def isLastRowFound(): Boolean = js.native
  /** Returns true if the provided rowNode is in the list of rows to render */
  def isRowPresent(rowNode: RowNode): Boolean = js.native
  /** Returns true if no rows (either no rows at all, or the rows are filtered out). This is what the grid
    * uses to know if there are rows to render or not. */
  def isRowsToRender(): Boolean = js.native
}

object IRowModel {
  @scala.inline
  def apply(
    forEachNode: js.Function1[/* rowNode */ RowNode, Unit] => Unit,
    getCurrentPageHeight: () => Double,
    getNodesInRangeForSelection: (RowNode, RowNode) => js.Array[RowNode],
    getPageFirstRow: () => Double,
    getPageLastRow: () => Double,
    getRow: Double => RowNode,
    getRowBounds: Double => RowBounds,
    getRowCount: () => Double,
    getRowIndexAtPixel: Double => Double,
    getRowNode: String => RowNode,
    getType: () => String,
    isEmpty: () => Boolean,
    isLastRowFound: () => Boolean,
    isRowPresent: RowNode => Boolean,
    isRowsToRender: () => Boolean
  ): IRowModel = {
    val __obj = js.Dynamic.literal(forEachNode = js.Any.fromFunction1(forEachNode), getCurrentPageHeight = js.Any.fromFunction0(getCurrentPageHeight), getNodesInRangeForSelection = js.Any.fromFunction2(getNodesInRangeForSelection), getPageFirstRow = js.Any.fromFunction0(getPageFirstRow), getPageLastRow = js.Any.fromFunction0(getPageLastRow), getRow = js.Any.fromFunction1(getRow), getRowBounds = js.Any.fromFunction1(getRowBounds), getRowCount = js.Any.fromFunction0(getRowCount), getRowIndexAtPixel = js.Any.fromFunction1(getRowIndexAtPixel), getRowNode = js.Any.fromFunction1(getRowNode), getType = js.Any.fromFunction0(getType), isEmpty = js.Any.fromFunction0(isEmpty), isLastRowFound = js.Any.fromFunction0(isLastRowFound), isRowPresent = js.Any.fromFunction1(isRowPresent), isRowsToRender = js.Any.fromFunction0(isRowsToRender))
    __obj.asInstanceOf[IRowModel]
  }
  @scala.inline
  implicit class IRowModelOps[Self <: IRowModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForEachNode(value: js.Function1[/* rowNode */ RowNode, Unit] => Unit): Self = this.set("forEachNode", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCurrentPageHeight(value: () => Double): Self = this.set("getCurrentPageHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNodesInRangeForSelection(value: (RowNode, RowNode) => js.Array[RowNode]): Self = this.set("getNodesInRangeForSelection", js.Any.fromFunction2(value))
    @scala.inline
    def setGetPageFirstRow(value: () => Double): Self = this.set("getPageFirstRow", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPageLastRow(value: () => Double): Self = this.set("getPageLastRow", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRow(value: Double => RowNode): Self = this.set("getRow", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRowBounds(value: Double => RowBounds): Self = this.set("getRowBounds", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRowCount(value: () => Double): Self = this.set("getRowCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRowIndexAtPixel(value: Double => Double): Self = this.set("getRowIndexAtPixel", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRowNode(value: String => RowNode): Self = this.set("getRowNode", js.Any.fromFunction1(value))
    @scala.inline
    def setGetType(value: () => String): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setIsLastRowFound(value: () => Boolean): Self = this.set("isLastRowFound", js.Any.fromFunction0(value))
    @scala.inline
    def setIsRowPresent(value: RowNode => Boolean): Self = this.set("isRowPresent", js.Any.fromFunction1(value))
    @scala.inline
    def setIsRowsToRender(value: () => Boolean): Self = this.set("isRowsToRender", js.Any.fromFunction0(value))
  }
  
}

