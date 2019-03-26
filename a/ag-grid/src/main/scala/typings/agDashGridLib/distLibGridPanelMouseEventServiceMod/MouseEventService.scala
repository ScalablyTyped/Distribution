package typings
package agDashGridLib.distLibGridPanelMouseEventServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/gridPanel/mouseEventService", "MouseEventService")
@js.native
class MouseEventService () extends js.Object {
  var eGridDiv: js.Any = js.native
  var gridInstanceId: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  def getGridCellForEvent(event: stdLib.KeyboardEvent): agDashGridLib.distLibEntitiesGridCellMod.GridCell = js.native
  def getGridCellForEvent(event: stdLib.MouseEvent): agDashGridLib.distLibEntitiesGridCellMod.GridCell = js.native
  def getRenderedCellForEvent(event: stdLib.Event): agDashGridLib.distLibRenderingCellCompMod.CellComp = js.native
  /* private */ def init(): js.Any = js.native
  def isEventFromThisGrid(event: stdLib.KeyboardEvent): scala.Boolean = js.native
  def isEventFromThisGrid(event: stdLib.MouseEvent): scala.Boolean = js.native
  /* private */ def stampDomElementWithGridInstance(): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/gridPanel/mouseEventService", "MouseEventService")
@js.native
object MouseEventService extends js.Object {
  var GRID_DOM_KEY: js.Any = js.native
  var gridInstanceSequence: js.Any = js.native
}

