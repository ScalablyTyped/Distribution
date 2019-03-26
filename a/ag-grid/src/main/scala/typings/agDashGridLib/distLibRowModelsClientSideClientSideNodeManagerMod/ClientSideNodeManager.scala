package typings
package agDashGridLib.distLibRowModelsClientSideClientSideNodeManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/clientSide/clientSideNodeManager", "ClientSideNodeManager")
@js.native
class ClientSideNodeManager protected () extends js.Object {
  def this(rootNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode, gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper, context: agDashGridLib.distLibContextContextMod.Context, eventService: agDashGridLib.distLibEventServiceMod.EventService, columnController: agDashGridLib.distLibColumnControllerColumnControllerMod.ColumnController, gridApi: agDashGridLib.distLibGridApiMod.GridApi, columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi, selectionController: agDashGridLib.distLibSelectionControllerMod.SelectionController) = this()
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
  def addItems(items: js.Any): js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  /* private */ def addRowNode(data: js.Any): js.Any = js.native
  /* private */ def addRowNode(data: js.Any, index: js.Any): js.Any = js.native
  /* private */ def createNode(dataItem: js.Any, parent: js.Any, level: js.Any): js.Any = js.native
  def getCopyOfNodesMap(): org.scalablytyped.runtime.StringDictionary[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  def getRowNode(id: java.lang.String): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def insertItemsAtIndex(index: scala.Double, rowData: js.Array[_]): js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  /* private */ def isExpanded(level: js.Any): js.Any = js.native
  def isLegacyTreeData(): scala.Boolean = js.native
  /* private */ def lookupRowNode(data: js.Any): js.Any = js.native
  def postConstruct(): scala.Unit = js.native
  /* private */ def recursiveFunction(rowData: js.Any, parent: js.Any, level: js.Any): js.Any = js.native
  /* private */ def setLeafChildren(node: js.Any): js.Any = js.native
  def setRowData(rowData: js.Array[_]): js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  def updateRowData(
    rowDataTran: agDashGridLib.distLibRowModelsClientSideClientSideRowModelMod.RowDataTransaction,
    rowNodeOrder: org.scalablytyped.runtime.StringDictionary[scala.Double]
  ): agDashGridLib.distLibRowModelsClientSideClientSideRowModelMod.RowNodeTransaction = js.native
  /* private */ def updatedRowNode(rowNode: js.Any, data: js.Any, update: js.Any): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rowModels/clientSide/clientSideNodeManager", "ClientSideNodeManager")
@js.native
object ClientSideNodeManager extends js.Object {
  var ROOT_NODE_ID: js.Any = js.native
  var TOP_LEVEL: js.Any = js.native
}

