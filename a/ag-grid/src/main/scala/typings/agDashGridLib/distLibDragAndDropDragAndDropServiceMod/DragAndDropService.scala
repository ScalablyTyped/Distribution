package typings
package agDashGridLib.distLibDragAndDropDragAndDropServiceMod

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
  def addDragSource(dragSource: DragSource): scala.Unit = js.native
  def addDragSource(dragSource: DragSource, allowTouch: scala.Boolean): scala.Unit = js.native
  def addDropTarget(dropTarget: DropTarget): scala.Unit = js.native
  def createDropTargetEvent(
    dropTarget: DropTarget,
    event: stdLib.MouseEvent,
    hDirection: HDirection,
    vDirection: VDirection,
    fromNudge: scala.Boolean
  ): DraggingEvent = js.native
  /* private */ def createGhost(): js.Any = js.native
  /* private */ def destroy(): js.Any = js.native
  /* private */ def enterDragTargetIfExists(dropTarget: js.Any, mouseEvent: js.Any, hDirection: js.Any, vDirection: js.Any, fromNudge: js.Any): js.Any = js.native
  /* private */ def getAllContainersFromDropTarget(dropTarget: js.Any): js.Any = js.native
  /* private */ def getStringType(`type`: js.Any): js.Any = js.native
  /* private */ def init(): js.Any = js.native
  /* private */ def isMouseOnDropTarget(mouseEvent: js.Any, dropTarget: js.Any): js.Any = js.native
  /* private */ def leaveLastTargetIfExists(mouseEvent: js.Any, hDirection: js.Any, vDirection: js.Any, fromNudge: js.Any): js.Any = js.native
  def nudge(): scala.Unit = js.native
  /* private */ def onDragStart(dragSource: js.Any, mouseEvent: js.Any): js.Any = js.native
  /* private */ def onDragStop(mouseEvent: js.Any): js.Any = js.native
  /* private */ def onDragging(mouseEvent: js.Any, fromNudge: js.Any): js.Any = js.native
  /* private */ def positionGhost(event: js.Any): js.Any = js.native
  def removeDragSource(dragSource: DragSource): scala.Unit = js.native
  /* private */ def removeGhost(): js.Any = js.native
  /* private */ def setBeans(loggerFactory: js.Any): js.Any = js.native
  def setGhostIcon(iconName: java.lang.String): scala.Unit = js.native
  def setGhostIcon(iconName: java.lang.String, shake: scala.Boolean): scala.Unit = js.native
  def workOutHDirection(event: stdLib.MouseEvent): HDirection = js.native
  def workOutVDirection(event: stdLib.MouseEvent): VDirection = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragAndDropService")
@js.native
object DragAndDropService extends js.Object {
  var GHOST_TEMPLATE: java.lang.String = js.native
  var ICON_ADD: java.lang.String = js.native
  var ICON_AGGREGATE: java.lang.String = js.native
  var ICON_GROUP: java.lang.String = js.native
  var ICON_LEFT: java.lang.String = js.native
  var ICON_MOVE: java.lang.String = js.native
  var ICON_NOT_ALLOWED: java.lang.String = js.native
  var ICON_PINNED: java.lang.String = js.native
  var ICON_PIVOT: java.lang.String = js.native
  var ICON_RIGHT: java.lang.String = js.native
}

