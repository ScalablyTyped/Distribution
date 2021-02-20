package typings.agGrid

import typings.agGrid.columnMod.Column
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortServiceMod {
  
  @JSImport("ag-grid/dist/lib/rowNodes/sortService", "SortService")
  @js.native
  class SortService () extends StObject {
    
    var columnController: js.Any = js.native
    
    /* private */ def compareRowNodes(sortOptions: js.Any, sortedNodeA: js.Any, sortedNodeB: js.Any): js.Any = js.native
    
    /* private */ def getValue(nodeA: js.Any, column: js.Any): js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    def init(): Unit = js.native
    
    var postSortFunc: js.Any = js.native
    
    /* private */ def pullDownDataForHideOpenParents(rowNode: js.Any, clearOperation: js.Any): js.Any = js.native
    
    def sort(rowNode: RowNode, sortOptions: js.Array[SortOption]): Unit = js.native
    
    def sortAccordingToColumnsState(rowNode: RowNode): Unit = js.native
    
    var sortController: js.Any = js.native
    
    /* private */ def updateChildIndexes(rowNode: js.Any): js.Any = js.native
    
    var valueService: js.Any = js.native
  }
  
  @js.native
  trait SortOption extends StObject {
    
    var column: Column = js.native
    
    var inverter: Double = js.native
  }
  object SortOption {
    
    @scala.inline
    def apply(column: Column, inverter: Double): SortOption = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], inverter = inverter.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortOption]
    }
    
    @scala.inline
    implicit class SortOptionMutableBuilder[Self <: SortOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverter(value: Double): Self = StObject.set(x, "inverter", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SortedRowNode extends StObject {
    
    var currentPos: Double = js.native
    
    var rowNode: RowNode = js.native
  }
  object SortedRowNode {
    
    @scala.inline
    def apply(currentPos: Double, rowNode: RowNode): SortedRowNode = {
      val __obj = js.Dynamic.literal(currentPos = currentPos.asInstanceOf[js.Any], rowNode = rowNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortedRowNode]
    }
    
    @scala.inline
    implicit class SortedRowNodeMutableBuilder[Self <: SortedRowNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentPos(value: Double): Self = StObject.set(x, "currentPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowNode(value: RowNode): Self = StObject.set(x, "rowNode", value.asInstanceOf[js.Any])
    }
  }
}
