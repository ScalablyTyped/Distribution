package typings.agGrid

import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iRowModelMod {
  
  trait IRowModel extends StObject {
    
    /** Iterate through each node. What this does depends on the model type. For clientSide, goes through
      * all nodes. For pagination, goes through current page. For virtualPage, goes through what's loaded in memory. */
    def forEachNode(callback: js.Function1[/* rowNode */ RowNode, Unit]): Unit
    
    /** Returns total height of all the rows - used to size the height of the grid div that contains the rows */
    def getCurrentPageHeight(): Double
    
    /** Returns all rows in range that should be selected. If there is a gap in range (non ClientSideRowModel) then
      *  then no rows should be returned  */
    def getNodesInRangeForSelection(first: RowNode, last: RowNode): js.Array[RowNode]
    
    /** Returns the first and last rows to render. */
    def getPageFirstRow(): Double
    
    def getPageLastRow(): Double
    
    /** Returns the rowNode at the given index. */
    def getRow(index: Double): RowNode
    
    /** Returns row top and bottom for a given row */
    def getRowBounds(index: Double): RowBounds
    
    /** This is legacy, not used by ag-Grid, but keeping for backward compatibility */
    def getRowCount(): Double
    
    /** Returns the row index at the given pixel */
    def getRowIndexAtPixel(pixel: Double): Double
    
    /** Returns the rowNode for given id. */
    def getRowNode(id: String): RowNode
    
    /** The base class returns the type. We use this instead of 'instanceof' as the client might provide
      * their own implementation of the models in the future. */
    def getType(): String
    
    /** Returns true if this model has no rows, regardless of model filter. EG if rows present, but filtered
      * out, this still returns false. If it returns true, then the grid shows the 'no rows' overlay - but we
      * don't show that overlay if the rows are just filtered out. */
    def isEmpty(): Boolean
    
    /**
      * It tells us if this row model knows about the last row that it can produce. This is used by the
      * PaginationPanel, if last row is not found, then the 'last' button is disabled and the last page is
      * not shown. This is always true for ClientSideRowModel. It toggles for InfiniteRowModel.
      */
    def isLastRowFound(): Boolean
    
    /** Returns true if the provided rowNode is in the list of rows to render */
    def isRowPresent(rowNode: RowNode): Boolean
    
    /** Returns true if no rows (either no rows at all, or the rows are filtered out). This is what the grid
      * uses to know if there are rows to render or not. */
    def isRowsToRender(): Boolean
  }
  object IRowModel {
    
    inline def apply(
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
    
    extension [Self <: IRowModel](x: Self) {
      
      inline def setForEachNode(value: js.Function1[/* rowNode */ RowNode, Unit] => Unit): Self = StObject.set(x, "forEachNode", js.Any.fromFunction1(value))
      
      inline def setGetCurrentPageHeight(value: () => Double): Self = StObject.set(x, "getCurrentPageHeight", js.Any.fromFunction0(value))
      
      inline def setGetNodesInRangeForSelection(value: (RowNode, RowNode) => js.Array[RowNode]): Self = StObject.set(x, "getNodesInRangeForSelection", js.Any.fromFunction2(value))
      
      inline def setGetPageFirstRow(value: () => Double): Self = StObject.set(x, "getPageFirstRow", js.Any.fromFunction0(value))
      
      inline def setGetPageLastRow(value: () => Double): Self = StObject.set(x, "getPageLastRow", js.Any.fromFunction0(value))
      
      inline def setGetRow(value: Double => RowNode): Self = StObject.set(x, "getRow", js.Any.fromFunction1(value))
      
      inline def setGetRowBounds(value: Double => RowBounds): Self = StObject.set(x, "getRowBounds", js.Any.fromFunction1(value))
      
      inline def setGetRowCount(value: () => Double): Self = StObject.set(x, "getRowCount", js.Any.fromFunction0(value))
      
      inline def setGetRowIndexAtPixel(value: Double => Double): Self = StObject.set(x, "getRowIndexAtPixel", js.Any.fromFunction1(value))
      
      inline def setGetRowNode(value: String => RowNode): Self = StObject.set(x, "getRowNode", js.Any.fromFunction1(value))
      
      inline def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setIsLastRowFound(value: () => Boolean): Self = StObject.set(x, "isLastRowFound", js.Any.fromFunction0(value))
      
      inline def setIsRowPresent(value: RowNode => Boolean): Self = StObject.set(x, "isRowPresent", js.Any.fromFunction1(value))
      
      inline def setIsRowsToRender(value: () => Boolean): Self = StObject.set(x, "isRowsToRender", js.Any.fromFunction0(value))
    }
  }
  
  trait RowBounds extends StObject {
    
    var rowHeight: Double
    
    var rowTop: Double
  }
  object RowBounds {
    
    inline def apply(rowHeight: Double, rowTop: Double): RowBounds = {
      val __obj = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any], rowTop = rowTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowBounds]
    }
    
    extension [Self <: RowBounds](x: Self) {
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowTop(value: Double): Self = StObject.set(x, "rowTop", value.asInstanceOf[js.Any])
    }
  }
}
