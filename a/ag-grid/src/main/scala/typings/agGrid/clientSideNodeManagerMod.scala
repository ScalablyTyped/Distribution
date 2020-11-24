package typings.agGrid

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.clientSideRowModelMod.RowDataTransaction
import typings.agGrid.clientSideRowModelMod.RowNodeTransaction
import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnControllerMod.ColumnController
import typings.agGrid.contextMod.Context
import typings.agGrid.eventServiceMod.EventService
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typings.agGrid.rowNodeMod.RowNode
import typings.agGrid.selectionControllerMod.SelectionController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/rowModels/clientSide/clientSideNodeManager", JSImport.Namespace)
@js.native
object clientSideNodeManagerMod extends js.Object {
  
  @js.native
  class ClientSideNodeManager protected () extends js.Object {
    def this(
      rootNode: RowNode,
      gridOptionsWrapper: GridOptionsWrapper,
      context: Context,
      eventService: EventService,
      columnController: ColumnController,
      gridApi: GridApi,
      columnApi: ColumnApi,
      selectionController: SelectionController
    ) = this()
    
    def addItems(items: js.Any): js.Array[RowNode] = js.native
    
    /* private */ def addRowNode(data: js.Any, index: js.Any): js.Any = js.native
    
    var allNodesMap: js.Any = js.native
    
    var columnApi: js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var context: js.Any = js.native
    
    /* private */ def createNode(dataItem: js.Any, parent: js.Any, level: js.Any): js.Any = js.native
    
    var doesDataFlower: js.Any = js.native
    
    var doingLegacyTreeData: js.Any = js.native
    
    var doingMasterDetail: js.Any = js.native
    
    var eventService: js.Any = js.native
    
    def getCopyOfNodesMap(): StringDictionary[RowNode] = js.native
    
    var getNodeChildDetails: js.Any = js.native
    
    def getRowNode(id: String): RowNode = js.native
    
    var gridApi: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    def insertItemsAtIndex(index: Double, rowData: js.Array[_]): js.Array[RowNode] = js.native
    
    /* private */ def isExpanded(level: js.Any): js.Any = js.native
    
    def isLegacyTreeData(): Boolean = js.native
    
    var isRowMasterFunc: js.Any = js.native
    
    /* private */ def lookupRowNode(data: js.Any): js.Any = js.native
    
    var nextId: js.Any = js.native
    
    def postConstruct(): Unit = js.native
    
    /* private */ def recursiveFunction(rowData: js.Any, parent: js.Any, level: js.Any): js.Any = js.native
    
    var rootNode: js.Any = js.native
    
    var selectionController: js.Any = js.native
    
    /* private */ def setLeafChildren(node: js.Any): js.Any = js.native
    
    def setRowData(rowData: js.Array[_]): js.Array[RowNode] = js.native
    
    var suppressParentsInRowNodes: js.Any = js.native
    
    def updateRowData(rowDataTran: RowDataTransaction, rowNodeOrder: StringDictionary[Double]): RowNodeTransaction = js.native
    
    /* private */ def updatedRowNode(rowNode: js.Any, data: js.Any, update: js.Any): js.Any = js.native
  }
  /* static members */
  @js.native
  object ClientSideNodeManager extends js.Object {
    
    var ROOT_NODE_ID: js.Any = js.native
    
    var TOP_LEVEL: js.Any = js.native
  }
}
