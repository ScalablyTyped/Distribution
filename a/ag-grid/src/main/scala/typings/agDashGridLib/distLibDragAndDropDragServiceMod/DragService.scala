package typings
package agDashGridLib.distLibDragAndDropDragServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/dragAndDrop/dragService", "DragService")
@js.native
class DragService () extends js.Object {
  var columnApi: js.Any = js.native
  var currentDragParams: js.Any = js.native
  var dragEndFunctions: js.Any = js.native
  var dragSources: js.Any = js.native
  var dragging: js.Any = js.native
  var eventService: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var logger: js.Any = js.native
  var loggerFactory: js.Any = js.native
  var mouseEventLastTime: js.Any = js.native
  var mouseStartEvent: js.Any = js.native
  var onMouseMoveListener: js.Any = js.native
  var onMouseUpListener: js.Any = js.native
  var onTouchEndListener: js.Any = js.native
  var onTouchMoveListener: js.Any = js.native
  var touchLastTime: js.Any = js.native
  var touchStart: js.Any = js.native
  def addDragSource(params: DragListenerParams): scala.Unit = js.native
  def addDragSource(params: DragListenerParams, includeTouch: scala.Boolean): scala.Unit = js.native
  /* private */ def destroy(): js.Any = js.native
  /* private */ def getFirstActiveTouch(touchList: js.Any): js.Any = js.native
  /* private */ def init(): js.Any = js.native
  /* private */ def isEventNearStartEvent(currentEvent: js.Any, startEvent: js.Any): js.Any = js.native
  /* private */ def onCommonMove(currentEvent: js.Any, startEvent: js.Any): js.Any = js.native
  /* private */ def onMouseDown(params: js.Any, mouseEvent: js.Any): js.Any = js.native
  /* private */ def onMouseMove(mouseEvent: js.Any): js.Any = js.native
  def onMouseUp(mouseEvent: stdLib.MouseEvent): scala.Unit = js.native
  /* private */ def onTouchMove(touchEvent: js.Any): js.Any = js.native
  /* private */ def onTouchStart(params: js.Any, touchEvent: js.Any): js.Any = js.native
  def onTouchUp(touchEvent: stdLib.TouchEvent): scala.Unit = js.native
  def onUpCommon(eventOrTouch: stdLib.MouseEvent): scala.Unit = js.native
  def onUpCommon(eventOrTouch: stdLib.Touch): scala.Unit = js.native
  def removeDragSource(params: DragListenerParams): scala.Unit = js.native
  /* private */ def removeListener(dragSourceAndListener: js.Any): js.Any = js.native
  /* private */ def setNoSelectToBody(noSelect: js.Any): js.Any = js.native
}

