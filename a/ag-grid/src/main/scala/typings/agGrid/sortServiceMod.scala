package typings.agGrid

import typings.agGrid.columnMod.Column
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortServiceMod {
  
  @JSImport("ag-grid/dist/lib/rowNodes/sortService", "SortService")
  @js.native
  class SortService () extends StObject {
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ def compareRowNodes(sortOptions: js.Any, sortedNodeA: js.Any, sortedNodeB: js.Any): js.Any = js.native
    
    /* private */ def getValue(nodeA: js.Any, column: js.Any): js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    def init(): Unit = js.native
    
    /* private */ var postSortFunc: js.Any = js.native
    
    /* private */ def pullDownDataForHideOpenParents(rowNode: js.Any, clearOperation: js.Any): js.Any = js.native
    
    def sort(rowNode: RowNode, sortOptions: js.Array[SortOption]): Unit = js.native
    
    def sortAccordingToColumnsState(rowNode: RowNode): Unit = js.native
    
    /* private */ var sortController: js.Any = js.native
    
    /* private */ def updateChildIndexes(rowNode: js.Any): js.Any = js.native
    
    /* private */ var valueService: js.Any = js.native
  }
  
  trait SortOption extends StObject {
    
    var column: Column
    
    var inverter: Double
  }
  object SortOption {
    
    inline def apply(column: Column, inverter: Double): SortOption = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], inverter = inverter.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortOption]
    }
    
    extension [Self <: SortOption](x: Self) {
      
      inline def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setInverter(value: Double): Self = StObject.set(x, "inverter", value.asInstanceOf[js.Any])
    }
  }
  
  trait SortedRowNode extends StObject {
    
    var currentPos: Double
    
    var rowNode: RowNode
  }
  object SortedRowNode {
    
    inline def apply(currentPos: Double, rowNode: RowNode): SortedRowNode = {
      val __obj = js.Dynamic.literal(currentPos = currentPos.asInstanceOf[js.Any], rowNode = rowNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortedRowNode]
    }
    
    extension [Self <: SortedRowNode](x: Self) {
      
      inline def setCurrentPos(value: Double): Self = StObject.set(x, "currentPos", value.asInstanceOf[js.Any])
      
      inline def setRowNode(value: RowNode): Self = StObject.set(x, "rowNode", value.asInstanceOf[js.Any])
    }
  }
}
