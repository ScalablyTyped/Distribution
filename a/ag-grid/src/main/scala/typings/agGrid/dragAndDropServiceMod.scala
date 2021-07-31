package typings.agGrid

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.columnMod.Column
import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragAndDropServiceMod {
  
  @JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragAndDropService")
  @js.native
  class DragAndDropService () extends StObject {
    
    def addDragSource(dragSource: DragSource): Unit = js.native
    def addDragSource(dragSource: DragSource, allowTouch: Boolean): Unit = js.native
    
    def addDropTarget(dropTarget: DropTarget): Unit = js.native
    
    var columnController: js.Any = js.native
    
    def createDropTargetEvent(
      dropTarget: DropTarget,
      event: MouseEvent,
      hDirection: HDirection,
      vDirection: VDirection,
      fromNudge: Boolean
    ): DraggingEvent = js.native
    
    /* private */ def createGhost(): js.Any = js.native
    
    /* private */ def destroy(): js.Any = js.native
    
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
    
    /* private */ def enterDragTargetIfExists(dropTarget: js.Any, mouseEvent: js.Any, hDirection: js.Any, vDirection: js.Any, fromNudge: js.Any): js.Any = js.native
    
    var environment: js.Any = js.native
    
    var eventLastTime: js.Any = js.native
    
    /* private */ def getAllContainersFromDropTarget(dropTarget: js.Any): js.Any = js.native
    
    /* private */ def getStringType(`type`: js.Any): js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def init(): js.Any = js.native
    
    /* private */ def isMouseOnDropTarget(mouseEvent: js.Any, dropTarget: js.Any): js.Any = js.native
    
    var lastDropTarget: js.Any = js.native
    
    /* private */ def leaveLastTargetIfExists(mouseEvent: js.Any, hDirection: js.Any, vDirection: js.Any, fromNudge: js.Any): js.Any = js.native
    
    var logger: js.Any = js.native
    
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
  object DragAndDropService {
    
    @JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragAndDropService")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragAndDropService.GHOST_TEMPLATE")
    @js.native
    def GHOST_TEMPLATE: String = js.native
    @scala.inline
    def GHOST_TEMPLATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GHOST_TEMPLATE")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragAndDropService.ICON_ADD")
    @js.native
    def ICON_ADD: String = js.native
    @scala.inline
    def ICON_ADD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_ADD")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragAndDropService.ICON_AGGREGATE")
    @js.native
    def ICON_AGGREGATE: String = js.native
    @scala.inline
    def ICON_AGGREGATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_AGGREGATE")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragAndDropService.ICON_GROUP")
    @js.native
    def ICON_GROUP: String = js.native
    @scala.inline
    def ICON_GROUP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_GROUP")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragAndDropService.ICON_LEFT")
    @js.native
    def ICON_LEFT: String = js.native
    @scala.inline
    def ICON_LEFT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragAndDropService.ICON_MOVE")
    @js.native
    def ICON_MOVE: String = js.native
    @scala.inline
    def ICON_MOVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_MOVE")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragAndDropService.ICON_NOT_ALLOWED")
    @js.native
    def ICON_NOT_ALLOWED: String = js.native
    @scala.inline
    def ICON_NOT_ALLOWED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_NOT_ALLOWED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragAndDropService.ICON_PINNED")
    @js.native
    def ICON_PINNED: String = js.native
    @scala.inline
    def ICON_PINNED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_PINNED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragAndDropService.ICON_PIVOT")
    @js.native
    def ICON_PIVOT: String = js.native
    @scala.inline
    def ICON_PIVOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_PIVOT")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragAndDropService.ICON_RIGHT")
    @js.native
    def ICON_RIGHT: String = js.native
    @scala.inline
    def ICON_RIGHT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_RIGHT")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait DragSourceType extends StObject
  @JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragSourceType")
  @js.native
  object DragSourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DragSourceType & Double] = js.native
    
    @js.native
    sealed trait HeaderCell
      extends StObject
         with DragSourceType
    /* 1 */ val HeaderCell: typings.agGrid.dragAndDropServiceMod.DragSourceType.HeaderCell & Double = js.native
    
    @js.native
    sealed trait RowDrag
      extends StObject
         with DragSourceType
    /* 2 */ val RowDrag: typings.agGrid.dragAndDropServiceMod.DragSourceType.RowDrag & Double = js.native
    
    @js.native
    sealed trait ToolPanel
      extends StObject
         with DragSourceType
    /* 0 */ val ToolPanel: typings.agGrid.dragAndDropServiceMod.DragSourceType.ToolPanel & Double = js.native
  }
  
  @js.native
  sealed trait HDirection extends StObject
  @JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "HDirection")
  @js.native
  object HDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HDirection & Double] = js.native
    
    @js.native
    sealed trait Left
      extends StObject
         with HDirection
    /* 0 */ val Left: typings.agGrid.dragAndDropServiceMod.HDirection.Left & Double = js.native
    
    @js.native
    sealed trait Right
      extends StObject
         with HDirection
    /* 1 */ val Right: typings.agGrid.dragAndDropServiceMod.HDirection.Right & Double = js.native
  }
  
  @js.native
  sealed trait VDirection extends StObject
  @JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "VDirection")
  @js.native
  object VDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[VDirection & Double] = js.native
    
    @js.native
    sealed trait Down
      extends StObject
         with VDirection
    /* 1 */ val Down: typings.agGrid.dragAndDropServiceMod.VDirection.Down & Double = js.native
    
    @js.native
    sealed trait Up
      extends StObject
         with VDirection
    /* 0 */ val Up: typings.agGrid.dragAndDropServiceMod.VDirection.Up & Double = js.native
  }
  
  trait DragItem extends StObject {
    
    var columns: js.UndefOr[js.Array[Column]] = js.undefined
    
    var rowNode: js.UndefOr[RowNode] = js.undefined
    
    var visibleState: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  }
  object DragItem {
    
    @scala.inline
    def apply(): DragItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragItem]
    }
    
    @scala.inline
    implicit class DragItemMutableBuilder[Self <: DragItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setRowNode(value: RowNode): Self = StObject.set(x, "rowNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowNodeUndefined: Self = StObject.set(x, "rowNode", js.undefined)
      
      @scala.inline
      def setVisibleState(value: StringDictionary[Boolean]): Self = StObject.set(x, "visibleState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleStateUndefined: Self = StObject.set(x, "visibleState", js.undefined)
    }
  }
  
  trait DragSource extends StObject {
    
    /** If eElement is dragged, then the dragItem is the object that gets passed around. */
    def dragItemCallback(): DragItem
    
    /** This name appears in the ghost icon when dragging */
    var dragItemName: String
    
    /** The drop target associated with this dragSource. So when dragging starts, this target does not get
      * onDragEnter event. */
    var dragSourceDropTarget: js.UndefOr[DropTarget] = js.undefined
    
    /** After how many pixels of dragging should the drag operation start. Default is 4px. */
    var dragStartPixels: js.UndefOr[Double] = js.undefined
    
    /** Callback for drag started */
    var dragStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Callback for drag stopped */
    var dragStopped: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Element which, when dragged, will kick off the DnD process */
    var eElement: HTMLElement
    
    /** So the drop target knows what type of event it is, useful for columns,
      * we we re-ordering or moving dropping from toolPanel */
    var `type`: DragSourceType
  }
  object DragSource {
    
    @scala.inline
    def apply(
      dragItemCallback: () => DragItem,
      dragItemName: String,
      eElement: HTMLElement,
      `type`: DragSourceType
    ): DragSource = {
      val __obj = js.Dynamic.literal(dragItemCallback = js.Any.fromFunction0(dragItemCallback), dragItemName = dragItemName.asInstanceOf[js.Any], eElement = eElement.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragSource]
    }
    
    @scala.inline
    implicit class DragSourceMutableBuilder[Self <: DragSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDragItemCallback(value: () => DragItem): Self = StObject.set(x, "dragItemCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDragItemName(value: String): Self = StObject.set(x, "dragItemName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragSourceDropTarget(value: DropTarget): Self = StObject.set(x, "dragSourceDropTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragSourceDropTargetUndefined: Self = StObject.set(x, "dragSourceDropTarget", js.undefined)
      
      @scala.inline
      def setDragStartPixels(value: Double): Self = StObject.set(x, "dragStartPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragStartPixelsUndefined: Self = StObject.set(x, "dragStartPixels", js.undefined)
      
      @scala.inline
      def setDragStarted(value: () => Unit): Self = StObject.set(x, "dragStarted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDragStartedUndefined: Self = StObject.set(x, "dragStarted", js.undefined)
      
      @scala.inline
      def setDragStopped(value: () => Unit): Self = StObject.set(x, "dragStopped", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDragStoppedUndefined: Self = StObject.set(x, "dragStopped", js.undefined)
      
      @scala.inline
      def setEElement(value: HTMLElement): Self = StObject.set(x, "eElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: DragSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DraggingEvent extends StObject {
    
    var dragItem: DragItem
    
    var dragSource: DragSource
    
    var event: MouseEvent
    
    var fromNudge: Boolean
    
    var hDirection: HDirection
    
    var vDirection: VDirection
    
    var x: Double
    
    var y: Double
  }
  object DraggingEvent {
    
    @scala.inline
    def apply(
      dragItem: DragItem,
      dragSource: DragSource,
      event: MouseEvent,
      fromNudge: Boolean,
      hDirection: HDirection,
      vDirection: VDirection,
      x: Double,
      y: Double
    ): DraggingEvent = {
      val __obj = js.Dynamic.literal(dragItem = dragItem.asInstanceOf[js.Any], dragSource = dragSource.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromNudge = fromNudge.asInstanceOf[js.Any], hDirection = hDirection.asInstanceOf[js.Any], vDirection = vDirection.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraggingEvent]
    }
    
    @scala.inline
    implicit class DraggingEventMutableBuilder[Self <: DraggingEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDragItem(value: DragItem): Self = StObject.set(x, "dragItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragSource(value: DragSource): Self = StObject.set(x, "dragSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromNudge(value: Boolean): Self = StObject.set(x, "fromNudge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHDirection(value: HDirection): Self = StObject.set(x, "hDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVDirection(value: VDirection): Self = StObject.set(x, "vDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropTarget extends StObject {
    
    /** The main container that will get the drop. */
    def getContainer(): HTMLElement
    
    /** Icon to show when drag is over*/
    var getIconName: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** If any secondary containers. For example when moving columns in ag-Grid, we listen for drops
      * in the header as well as the body (main rows and pinned rows) of the grid. */
    var getSecondaryContainers: js.UndefOr[js.Function0[js.Array[HTMLElement]]] = js.undefined
    
    def isInterestedIn(`type`: DragSourceType): Boolean
    
    /** Callback for when drag enters */
    var onDragEnter: js.UndefOr[js.Function1[/* params */ DraggingEvent, Unit]] = js.undefined
    
    /** Callback for when drag leaves */
    var onDragLeave: js.UndefOr[js.Function1[/* params */ DraggingEvent, Unit]] = js.undefined
    
    /** Callback for when drag stops */
    var onDragStop: js.UndefOr[js.Function1[/* params */ DraggingEvent, Unit]] = js.undefined
    
    /** Callback for when dragging */
    var onDragging: js.UndefOr[js.Function1[/* params */ DraggingEvent, Unit]] = js.undefined
  }
  object DropTarget {
    
    @scala.inline
    def apply(getContainer: () => HTMLElement, isInterestedIn: DragSourceType => Boolean): DropTarget = {
      val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction0(getContainer), isInterestedIn = js.Any.fromFunction1(isInterestedIn))
      __obj.asInstanceOf[DropTarget]
    }
    
    @scala.inline
    implicit class DropTargetMutableBuilder[Self <: DropTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetContainer(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIconName(value: () => String): Self = StObject.set(x, "getIconName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIconNameUndefined: Self = StObject.set(x, "getIconName", js.undefined)
      
      @scala.inline
      def setGetSecondaryContainers(value: () => js.Array[HTMLElement]): Self = StObject.set(x, "getSecondaryContainers", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSecondaryContainersUndefined: Self = StObject.set(x, "getSecondaryContainers", js.undefined)
      
      @scala.inline
      def setIsInterestedIn(value: DragSourceType => Boolean): Self = StObject.set(x, "isInterestedIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnter(value: /* params */ DraggingEvent => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: /* params */ DraggingEvent => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragStop(value: /* params */ DraggingEvent => Unit): Self = StObject.set(x, "onDragStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStopUndefined: Self = StObject.set(x, "onDragStop", js.undefined)
      
      @scala.inline
      def setOnDragging(value: /* params */ DraggingEvent => Unit): Self = StObject.set(x, "onDragging", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDraggingUndefined: Self = StObject.set(x, "onDragging", js.undefined)
    }
  }
}
