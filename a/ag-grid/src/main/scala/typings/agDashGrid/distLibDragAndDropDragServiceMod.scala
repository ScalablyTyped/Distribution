package typings.agDashGrid

import typings.agDashGrid.distLibDragAndDropDragServiceMod.DragListenerParams
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Touch
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/dragAndDrop/dragService", JSImport.Namespace)
@js.native
object distLibDragAndDropDragServiceMod extends js.Object {
  @js.native
  trait DragListenerParams extends js.Object {
    /** After how many pixels of dragging should the drag operation start. Default is 4px. */
    var dragStartPixels: js.UndefOr[Double] = js.native
    /** Dom element to add the drag handling to */
    var eElement: HTMLElement = js.native
    /** Some places may wish to ignore certain events, eg range selection ignores shift clicks */
    var skipMouseEvent: js.UndefOr[js.Function1[/* mouseEvent */ MouseEvent, Boolean]] = js.native
    /** Callback for drag starting */
    def onDragStart(mouseEvent: MouseEvent): Unit = js.native
    def onDragStart(mouseEvent: Touch): Unit = js.native
    /** Callback for drag stopping */
    def onDragStop(mouseEvent: MouseEvent): Unit = js.native
    def onDragStop(mouseEvent: Touch): Unit = js.native
    /** Callback for mouse move while dragging */
    def onDragging(mouseEvent: MouseEvent): Unit = js.native
    def onDragging(mouseEvent: Touch): Unit = js.native
  }
  
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
    def addDragSource(params: DragListenerParams): Unit = js.native
    def addDragSource(params: DragListenerParams, includeTouch: Boolean): Unit = js.native
    /* private */ def destroy(): js.Any = js.native
    /* private */ def getFirstActiveTouch(touchList: js.Any): js.Any = js.native
    /* private */ def init(): js.Any = js.native
    /* private */ def isEventNearStartEvent(currentEvent: js.Any, startEvent: js.Any): js.Any = js.native
    /* private */ def onCommonMove(currentEvent: js.Any, startEvent: js.Any): js.Any = js.native
    /* private */ def onMouseDown(params: js.Any, mouseEvent: js.Any): js.Any = js.native
    /* private */ def onMouseMove(mouseEvent: js.Any): js.Any = js.native
    def onMouseUp(mouseEvent: MouseEvent): Unit = js.native
    /* private */ def onTouchMove(touchEvent: js.Any): js.Any = js.native
    /* private */ def onTouchStart(params: js.Any, touchEvent: js.Any): js.Any = js.native
    def onTouchUp(touchEvent: TouchEvent): Unit = js.native
    def onUpCommon(eventOrTouch: MouseEvent): Unit = js.native
    def onUpCommon(eventOrTouch: Touch): Unit = js.native
    def removeDragSource(params: DragListenerParams): Unit = js.native
    /* private */ def removeListener(dragSourceAndListener: js.Any): js.Any = js.native
    /* private */ def setNoSelectToBody(noSelect: js.Any): js.Any = js.native
  }
  
}

