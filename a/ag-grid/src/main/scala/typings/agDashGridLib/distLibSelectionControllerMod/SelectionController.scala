package typings
package agDashGridLib.distLibSelectionControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/selectionController", "SelectionController")
@js.native
class SelectionController () extends js.Object {
  var columnApi: js.Any = js.native
  var eventService: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var groupSelectsChildren: js.Any = js.native
  var lastSelectedNode: js.Any = js.native
  var logger: js.Any = js.native
  var rowModel: js.Any = js.native
  var selectedNodes: js.Any = js.native
  def clearOtherNodes(rowNodeToKeepSelected: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Double = js.native
  def deselectAllRowNodes(): scala.Unit = js.native
  def deselectAllRowNodes(justFiltered: scala.Boolean): scala.Unit = js.native
  def deselectIndex(rowIndex: scala.Double): scala.Unit = js.native
  def deselectNode(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Unit = js.native
  def getBestCostNodeSelection(): js.Any = js.native
  def getLastSelectedNode(): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getNodeForIdIfSelected(id: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  def getSelectedNodes(): js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.native
  def getSelectedRows(): js.Array[_] = js.native
  def init(): scala.Unit = js.native
  def isEmpty(): scala.Boolean = js.native
  /* private */ def onRowSelected(event: js.Any): js.Any = js.native
  def removeGroupsFromSelection(): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def selectAllRowNodes(): scala.Unit = js.native
  def selectAllRowNodes(justFiltered: scala.Boolean): scala.Unit = js.native
  def selectIndex(index: js.Any, tryMulti: scala.Boolean): scala.Unit = js.native
  def selectNode(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode, tryMulti: scala.Boolean): scala.Unit = js.native
  /* private */ def setBeans(loggerFactory: js.Any): js.Any = js.native
  def setLastSelectedNode(rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode): scala.Unit = js.native
  def setRowModel(rowModel: js.Any): scala.Unit = js.native
  /* private */ def syncInNewRowNode(rowNode: js.Any): js.Any = js.native
  /* private */ def syncInOldRowNode(rowNode: js.Any, oldNode: js.Any): js.Any = js.native
  def syncInRowNode(
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    oldNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  ): scala.Unit = js.native
  def updateGroupsFromChildrenSelections(): scala.Unit = js.native
}

