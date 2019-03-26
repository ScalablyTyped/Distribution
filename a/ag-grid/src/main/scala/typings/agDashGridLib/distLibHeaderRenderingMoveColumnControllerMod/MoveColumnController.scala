package typings
package agDashGridLib.distLibHeaderRenderingMoveColumnControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/headerRendering/moveColumnController", "MoveColumnController")
@js.native
class MoveColumnController protected ()
  extends agDashGridLib.distLibHeaderRenderingBodyDropTargetMod.DropListener {
  def this(pinned: java.lang.String, eContainer: stdLib.HTMLElement) = this()
  var centerContainer: js.Any = js.native
  var columnController: js.Any = js.native
  var dragAndDropService: js.Any = js.native
  var eContainer: js.Any = js.native
  var failedMoveAttempts: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var gridPanel: js.Any = js.native
  var intervalCount: js.Any = js.native
  var lastDraggingEvent: js.Any = js.native
  var logger: js.Any = js.native
  var loggerFactory: js.Any = js.native
  var movingIntervalId: js.Any = js.native
  var needToMoveLeft: js.Any = js.native
  var needToMoveRight: js.Any = js.native
  var pinned: js.Any = js.native
  /* private */ def attemptMoveColumns(
    dragSourceType: js.Any,
    allMovingColumns: js.Any,
    hDirection: js.Any,
    xAdjusted: js.Any,
    fromEnter: js.Any
  ): js.Any = js.native
  /* private */ def calculateOldIndex(movingCols: js.Any): js.Any = js.native
  /* private */ def calculateValidMoves(movingCols: js.Any, draggingRight: js.Any, x: js.Any): js.Any = js.native
  /* private */ def checkCenterForScrolling(xAdjustedForScroll: js.Any): js.Any = js.native
  /* private */ def ensureIntervalCleared(): js.Any = js.native
  /* private */ def ensureIntervalStarted(): js.Any = js.native
  /* CompleteClass */
  override def getIconName(): java.lang.String = js.native
  def init(): scala.Unit = js.native
  /* private */ def isColumnHidden(displayedColumns: js.Any, col: js.Any): js.Any = js.native
  /* private */ def moveInterval(): js.Any = js.native
  /* private */ def normaliseDirection(hDirection: js.Any): js.Any = js.native
  /* private */ def normaliseX(x: js.Any): js.Any = js.native
  /* CompleteClass */
  override def onDragEnter(params: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent): scala.Unit = js.native
  /* CompleteClass */
  override def onDragLeave(params: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent): scala.Unit = js.native
  def onDragStop(): scala.Unit = js.native
  /* CompleteClass */
  override def onDragStop(params: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent): scala.Unit = js.native
  def onDragging(
    draggingEvent: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent,
    fromEnter: scala.Boolean
  ): scala.Unit = js.native
  /* CompleteClass */
  override def onDragging(params: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent): scala.Unit = js.native
  def registerGridComp(gridPanel: agDashGridLib.distLibGridPanelGridPanelMod.GridPanel): scala.Unit = js.native
  def setColumnsPinned(columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column], pinned: java.lang.String): scala.Unit = js.native
  def setColumnsPinned(
    columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column],
    pinned: java.lang.String,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
  def setColumnsVisible(columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column], visible: scala.Boolean): scala.Unit = js.native
  def setColumnsVisible(
    columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column],
    visible: scala.Boolean,
    source: agDashGridLib.distLibEventsMod.ColumnEventType
  ): scala.Unit = js.native
}

