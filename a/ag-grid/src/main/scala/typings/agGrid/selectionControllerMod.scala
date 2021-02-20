package typings.agGrid

import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionControllerMod {
  
  @JSImport("ag-grid/dist/lib/selectionController", "SelectionController")
  @js.native
  class SelectionController () extends StObject {
    
    def clearOtherNodes(rowNodeToKeepSelected: RowNode): Double = js.native
    
    var columnApi: js.Any = js.native
    
    def deselectAllRowNodes(): Unit = js.native
    def deselectAllRowNodes(justFiltered: Boolean): Unit = js.native
    
    def deselectIndex(rowIndex: Double): Unit = js.native
    
    def deselectNode(rowNode: RowNode): Unit = js.native
    
    var eventService: js.Any = js.native
    
    def getBestCostNodeSelection(): js.Any = js.native
    
    def getLastSelectedNode(): RowNode = js.native
    
    def getNodeForIdIfSelected(id: Double): RowNode = js.native
    
    def getSelectedNodes(): js.Array[RowNode] = js.native
    
    def getSelectedRows(): js.Array[_] = js.native
    
    var gridApi: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var groupSelectsChildren: js.Any = js.native
    
    def init(): Unit = js.native
    
    def isEmpty(): Boolean = js.native
    
    var lastSelectedNode: js.Any = js.native
    
    var logger: js.Any = js.native
    
    /* private */ def onRowSelected(event: js.Any): js.Any = js.native
    
    def removeGroupsFromSelection(): Unit = js.native
    
    def reset(): Unit = js.native
    
    var rowModel: js.Any = js.native
    
    def selectAllRowNodes(): Unit = js.native
    def selectAllRowNodes(justFiltered: Boolean): Unit = js.native
    
    def selectIndex(index: js.Any, tryMulti: Boolean): Unit = js.native
    
    def selectNode(rowNode: RowNode, tryMulti: Boolean): Unit = js.native
    
    var selectedNodes: js.Any = js.native
    
    /* private */ def setBeans(loggerFactory: js.Any): js.Any = js.native
    
    def setLastSelectedNode(rowNode: RowNode): Unit = js.native
    
    def setRowModel(rowModel: js.Any): Unit = js.native
    
    /* private */ def syncInNewRowNode(rowNode: js.Any): js.Any = js.native
    
    /* private */ def syncInOldRowNode(rowNode: js.Any, oldNode: js.Any): js.Any = js.native
    
    def syncInRowNode(rowNode: RowNode, oldNode: RowNode): Unit = js.native
    
    def updateGroupsFromChildrenSelections(): Unit = js.native
  }
}
