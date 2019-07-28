package typings.agDashGrid.distLibRowModelsClientSideClientSideNodeManagerMod

import org.scalablytyped.runtime.StringDictionary
import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibColumnControllerColumnControllerMod.ColumnController
import typings.agDashGrid.distLibContextContextMod.Context
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibEventServiceMod.EventService
import typings.agDashGrid.distLibGridApiMod.GridApi
import typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
import typings.agDashGrid.distLibRowModelsClientSideClientSideRowModelMod.RowDataTransaction
import typings.agDashGrid.distLibRowModelsClientSideClientSideRowModelMod.RowNodeTransaction
import typings.agDashGrid.distLibSelectionControllerMod.SelectionController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/clientSide/clientSideNodeManager", "ClientSideNodeManager")
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
  var allNodesMap: js.Any = js.native
  var columnApi: js.Any = js.native
  var columnController: js.Any = js.native
  var context: js.Any = js.native
  var doesDataFlower: js.Any = js.native
  var doingLegacyTreeData: js.Any = js.native
  var doingMasterDetail: js.Any = js.native
  var eventService: js.Any = js.native
  var getNodeChildDetails: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var isRowMasterFunc: js.Any = js.native
  var nextId: js.Any = js.native
  var rootNode: js.Any = js.native
  var selectionController: js.Any = js.native
  var suppressParentsInRowNodes: js.Any = js.native
  def addItems(items: js.Any): js.Array[RowNode] = js.native
  /* private */ def addRowNode(data: js.Any): js.Any = js.native
  /* private */ def addRowNode(data: js.Any, index: js.Any): js.Any = js.native
  /* private */ def createNode(dataItem: js.Any, parent: js.Any, level: js.Any): js.Any = js.native
  def getCopyOfNodesMap(): StringDictionary[RowNode] = js.native
  def getRowNode(id: String): RowNode = js.native
  def insertItemsAtIndex(index: Double, rowData: js.Array[_]): js.Array[RowNode] = js.native
  /* private */ def isExpanded(level: js.Any): js.Any = js.native
  def isLegacyTreeData(): Boolean = js.native
  /* private */ def lookupRowNode(data: js.Any): js.Any = js.native
  def postConstruct(): Unit = js.native
  /* private */ def recursiveFunction(rowData: js.Any, parent: js.Any, level: js.Any): js.Any = js.native
  /* private */ def setLeafChildren(node: js.Any): js.Any = js.native
  def setRowData(rowData: js.Array[_]): js.Array[RowNode] = js.native
  def updateRowData(rowDataTran: RowDataTransaction, rowNodeOrder: StringDictionary[Double]): RowNodeTransaction = js.native
  /* private */ def updatedRowNode(rowNode: js.Any, data: js.Any, update: js.Any): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rowModels/clientSide/clientSideNodeManager", "ClientSideNodeManager")
@js.native
object ClientSideNodeManager extends js.Object {
  var ROOT_NODE_ID: js.Any = js.native
  var TOP_LEVEL: js.Any = js.native
}

