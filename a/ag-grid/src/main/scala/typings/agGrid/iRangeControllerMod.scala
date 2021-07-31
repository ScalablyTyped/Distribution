package typings.agGrid

import typings.agGrid.columnMod.Column
import typings.agGrid.gridCellMod.GridCell
import typings.agGrid.gridPanelMod.GridPanel
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iRangeControllerMod {
  
  trait AddRangeSelectionParams extends StObject {
    
    var columnEnd: String | Column
    
    var columnStart: String | Column
    
    var floatingEnd: String
    
    var floatingStart: String
    
    var rowEnd: Double
    
    var rowStart: Double
  }
  object AddRangeSelectionParams {
    
    @scala.inline
    def apply(
      columnEnd: String | Column,
      columnStart: String | Column,
      floatingEnd: String,
      floatingStart: String,
      rowEnd: Double,
      rowStart: Double
    ): AddRangeSelectionParams = {
      val __obj = js.Dynamic.literal(columnEnd = columnEnd.asInstanceOf[js.Any], columnStart = columnStart.asInstanceOf[js.Any], floatingEnd = floatingEnd.asInstanceOf[js.Any], floatingStart = floatingStart.asInstanceOf[js.Any], rowEnd = rowEnd.asInstanceOf[js.Any], rowStart = rowStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddRangeSelectionParams]
    }
    
    @scala.inline
    implicit class AddRangeSelectionParamsMutableBuilder[Self <: AddRangeSelectionParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnEnd(value: String | Column): Self = StObject.set(x, "columnEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnStart(value: String | Column): Self = StObject.set(x, "columnStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingEnd(value: String): Self = StObject.set(x, "floatingEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingStart(value: String): Self = StObject.set(x, "floatingStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowEnd(value: Double): Self = StObject.set(x, "rowEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowStart(value: Double): Self = StObject.set(x, "rowStart", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRangeController extends StObject {
    
    def addRange(rangeSelection: AddRangeSelectionParams): Unit = js.native
    
    def clearSelection(): Unit = js.native
    
    def extendRangeInDirection(cell: GridCell, key: Double): Boolean = js.native
    
    def extendRangeToCell(cell: GridCell): Unit = js.native
    
    def getCellRangeCount(cell: GridCell): Double = js.native
    
    def getCellRanges(): js.Array[RangeSelection] = js.native
    
    def isCellInAnyRange(cell: GridCell): Boolean = js.native
    
    def onDragStart(mouseEvent: MouseEvent): Unit = js.native
    
    def onDragStop(): Unit = js.native
    
    def onDragging(mouseEvent: MouseEvent): Unit = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    def setRange(rangeSelection: AddRangeSelectionParams): Unit = js.native
    
    def setRangeToCell(cell: GridCell): Unit = js.native
    def setRangeToCell(cell: GridCell, appendRange: Boolean): Unit = js.native
  }
  
  trait RangeSelection extends StObject {
    
    var columns: js.Array[Column]
    
    var end: GridCell
    
    var start: GridCell
  }
  object RangeSelection {
    
    @scala.inline
    def apply(columns: js.Array[Column], end: GridCell, start: GridCell): RangeSelection = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeSelection]
    }
    
    @scala.inline
    implicit class RangeSelectionMutableBuilder[Self <: RangeSelection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setEnd(value: GridCell): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: GridCell): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
