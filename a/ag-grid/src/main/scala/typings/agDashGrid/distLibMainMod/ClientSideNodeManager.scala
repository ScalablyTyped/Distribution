package typings.agDashGrid.distLibMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "ClientSideNodeManager")
@js.native
class ClientSideNodeManager protected ()
  extends typings.agDashGrid.distLibRowModelsClientSideClientSideNodeManagerMod.ClientSideNodeManager {
  def this(
    rootNode: typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode,
    gridOptionsWrapper: typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    context: typings.agDashGrid.distLibContextContextMod.Context,
    eventService: typings.agDashGrid.distLibEventServiceMod.EventService,
    columnController: typings.agDashGrid.distLibColumnControllerColumnControllerMod.ColumnController,
    gridApi: typings.agDashGrid.distLibGridApiMod.GridApi,
    columnApi: typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi,
    selectionController: typings.agDashGrid.distLibSelectionControllerMod.SelectionController
  ) = this()
}

/* static members */
@JSImport("ag-grid/dist/lib/main", "ClientSideNodeManager")
@js.native
object ClientSideNodeManager extends js.Object {
  var ROOT_NODE_ID: js.Any = js.native
  var TOP_LEVEL: js.Any = js.native
}

