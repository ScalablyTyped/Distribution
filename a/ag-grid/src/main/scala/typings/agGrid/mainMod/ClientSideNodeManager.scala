package typings.agGrid.mainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object ClientSideNodeManager {
  
  @JSImport("ag-grid/dist/lib/main", "ClientSideNodeManager")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid/dist/lib/main", "ClientSideNodeManager.ROOT_NODE_ID")
  @js.native
  def ROOT_NODE_ID: js.Any = js.native
  @scala.inline
  def ROOT_NODE_ID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT_NODE_ID")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "ClientSideNodeManager.TOP_LEVEL")
  @js.native
  def TOP_LEVEL: js.Any = js.native
  @scala.inline
  def TOP_LEVEL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_LEVEL")(x.asInstanceOf[js.Any])
}
