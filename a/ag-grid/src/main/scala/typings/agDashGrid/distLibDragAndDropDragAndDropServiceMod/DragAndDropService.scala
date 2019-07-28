package typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragAndDropService")
@js.native
class DragAndDropService () extends js.Object {
  var columnController: js.Any = js.native
  var dragItem: js.Any = js.native
  var dragService: js.Any = js.native
  var dragSource: js.Any = js.native
  var dragSourceAndParamsList: js.Any = js.native
  var dragging: js.Any = js.native
  var dropTargets: js.Any = js.native
  var eAggregateIcon: js.Any = js.native
  var eDropNotAllowedIcon: js.Any = js.native
  var eGhost: js.Any = js.native
  var eGhostIcon: js.Any = js.native
  var eGhostParent: js.Any = js.native
  var eGroupIcon: js.Any = js.native
  var eHiddenIcon: js.Any = js.native
  var eLeftIcon: js.Any = js.native
  var eMoveIcon: js.Any = js.native
  var ePinnedIcon: js.Any = js.native
  var ePivotIcon: js.Any = js.native
  var ePlusIcon: js.Any = js.native
  var eRightIcon: js.Any = js.native
  var environment: js.Any = js.native
  var eventLastTime: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var lastDropTarget: js.Any = js.native
  var logger: js.Any = js.native
  def addDragSource(dragSource: DragSource): Unit = js.native
  def addDragSource(dragSource: DragSource, allowTouch: Boolean): Unit = js.native
  def addDropTarget(dropTarget: DropTarget): Unit = js.native
  def createDropTargetEvent(
    dropTarget: DropTarget,
    event: MouseEvent,
    hDirection: HDirection,
    vDirection: VDirection,
    fromNudge: Boolean
  ): DraggingEvent = js.native
  /* private */ def createGhost(): js.Any = js.native
  /* private */ def destroy(): js.Any = js.native
  /* private */ def enterDragTargetIfExists(dropTarget: js.Any, mouseEvent: js.Any, hDirection: js.Any, vDirection: js.Any, fromNudge: js.Any): js.Any = js.native
  /* private */ def getAllContainersFromDropTarget(dropTarget: js.Any): js.Any = js.native
  /* private */ def getStringType(`type`: js.Any): js.Any = js.native
  /* private */ def init(): js.Any = js.native
  /* private */ def isMouseOnDropTarget(mouseEvent: js.Any, dropTarget: js.Any): js.Any = js.native
  /* private */ def leaveLastTargetIfExists(mouseEvent: js.Any, hDirection: js.Any, vDirection: js.Any, fromNudge: js.Any): js.Any = js.native
  def nudge(): Unit = js.native
  /* private */ def onDragStart(dragSource: js.Any, mouseEvent: js.Any): js.Any = js.native
  /* private */ def onDragStop(mouseEvent: js.Any): js.Any = js.native
  /* private */ def onDragging(mouseEvent: js.Any, fromNudge: js.Any): js.Any = js.native
  /* private */ def positionGhost(event: js.Any): js.Any = js.native
  def removeDragSource(dragSource: DragSource): Unit = js.native
  /* private */ def removeGhost(): js.Any = js.native
  /* private */ def setBeans(loggerFactory: js.Any): js.Any = js.native
  def setGhostIcon(iconName: String): Unit = js.native
  def setGhostIcon(iconName: String, shake: Boolean): Unit = js.native
  def workOutHDirection(event: MouseEvent): HDirection = js.native
  def workOutVDirection(event: MouseEvent): VDirection = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragAndDropService")
@js.native
object DragAndDropService extends js.Object {
  var GHOST_TEMPLATE: String = js.native
  var ICON_ADD: String = js.native
  var ICON_AGGREGATE: String = js.native
  var ICON_GROUP: String = js.native
  var ICON_LEFT: String = js.native
  var ICON_MOVE: String = js.native
  var ICON_NOT_ALLOWED: String = js.native
  var ICON_PINNED: String = js.native
  var ICON_PIVOT: String = js.native
  var ICON_RIGHT: String = js.native
}

