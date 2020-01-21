package typings.agGrid.mainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "ClientSideNodeManager")
@js.native
class ClientSideNodeManager protected ()
  extends typings.agGrid.clientSideNodeManagerMod.ClientSideNodeManager {
  def this(
    rootNode: typings.agGrid.rowNodeMod.RowNode,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    context: typings.agGrid.contextMod.Context,
    eventService: typings.agGrid.eventServiceMod.EventService,
    columnController: typings.agGrid.columnControllerMod.ColumnController,
    gridApi: typings.agGrid.gridApiMod.GridApi,
    columnApi: typings.agGrid.columnApiMod.ColumnApi,
    selectionController: typings.agGrid.selectionControllerMod.SelectionController
  ) = this()
}

/* static members */
@JSImport("ag-grid/dist/lib/main", "ClientSideNodeManager")
@js.native
object ClientSideNodeManager extends js.Object {
  var ROOT_NODE_ID: js.Any = js.native
  var TOP_LEVEL: js.Any = js.native
}

