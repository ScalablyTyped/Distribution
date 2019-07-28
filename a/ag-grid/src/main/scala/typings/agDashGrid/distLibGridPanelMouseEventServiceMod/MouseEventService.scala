package typings.agDashGrid.distLibGridPanelMouseEventServiceMod

import typings.agDashGrid.distLibEntitiesGridCellMod.GridCell
import typings.agDashGrid.distLibRenderingCellCompMod.CellComp
import typings.std.Event
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/gridPanel/mouseEventService", "MouseEventService")
@js.native
class MouseEventService () extends js.Object {
  var eGridDiv: js.Any = js.native
  var gridInstanceId: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  def getGridCellForEvent(event: KeyboardEvent): GridCell = js.native
  def getGridCellForEvent(event: MouseEvent): GridCell = js.native
  def getRenderedCellForEvent(event: Event): CellComp = js.native
  /* private */ def init(): js.Any = js.native
  def isEventFromThisGrid(event: KeyboardEvent): Boolean = js.native
  def isEventFromThisGrid(event: MouseEvent): Boolean = js.native
  /* private */ def stampDomElementWithGridInstance(): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/gridPanel/mouseEventService", "MouseEventService")
@js.native
object MouseEventService extends js.Object {
  var GRID_DOM_KEY: js.Any = js.native
  var gridInstanceSequence: js.Any = js.native
}

