package typings.agGrid

import typings.agGrid.dragAndDropServiceMod.DraggingEvent
import typings.agGrid.dragAndDropServiceMod.DropTarget
import typings.agGrid.gridPanelMod.GridPanel
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bodyDropTargetMod {
  
  @JSImport("ag-grid/dist/lib/headerRendering/bodyDropTarget", "BodyDropTarget")
  @js.native
  class BodyDropTarget protected () extends DropTarget {
    def this(pinned: String, eContainer: HTMLElement) = this()
    
    var columnController: js.Any = js.native
    
    var context: js.Any = js.native
    
    var currentDropListener: js.Any = js.native
    
    var dragAndDropService: js.Any = js.native
    
    var dropListeners: js.Any = js.native
    
    var eContainer: js.Any = js.native
    
    var eSecondaryContainers: js.Any = js.native
    
    /* private */ def getDropType(draggingEvent: js.Any): js.Any = js.native
    
    @JSName("getIconName")
    def getIconName_MBodyDropTarget(): String = js.native
    
    @JSName("getSecondaryContainers")
    def getSecondaryContainers_MBodyDropTarget(): js.Array[HTMLElement] = js.native
    
    var gridPanel: js.Any = js.native
    
    /* private */ def init(): js.Any = js.native
    
    var moveColumnController: js.Any = js.native
    
    @JSName("onDragEnter")
    def onDragEnter_MBodyDropTarget(draggingEvent: DraggingEvent): Unit = js.native
    
    @JSName("onDragLeave")
    def onDragLeave_MBodyDropTarget(params: DraggingEvent): Unit = js.native
    
    @JSName("onDragStop")
    def onDragStop_MBodyDropTarget(params: DraggingEvent): Unit = js.native
    
    @JSName("onDragging")
    def onDragging_MBodyDropTarget(params: DraggingEvent): Unit = js.native
    
    var pinned: js.Any = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
  }
  
  @js.native
  trait DropListener extends StObject {
    
    def getIconName(): String = js.native
    
    def onDragEnter(params: DraggingEvent): Unit = js.native
    
    def onDragLeave(params: DraggingEvent): Unit = js.native
    
    def onDragStop(params: DraggingEvent): Unit = js.native
    
    def onDragging(params: DraggingEvent): Unit = js.native
  }
  object DropListener {
    
    @scala.inline
    def apply(
      getIconName: () => String,
      onDragEnter: DraggingEvent => Unit,
      onDragLeave: DraggingEvent => Unit,
      onDragStop: DraggingEvent => Unit,
      onDragging: DraggingEvent => Unit
    ): DropListener = {
      val __obj = js.Dynamic.literal(getIconName = js.Any.fromFunction0(getIconName), onDragEnter = js.Any.fromFunction1(onDragEnter), onDragLeave = js.Any.fromFunction1(onDragLeave), onDragStop = js.Any.fromFunction1(onDragStop), onDragging = js.Any.fromFunction1(onDragging))
      __obj.asInstanceOf[DropListener]
    }
    
    @scala.inline
    implicit class DropListenerMutableBuilder[Self <: DropListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetIconName(value: () => String): Self = StObject.set(x, "getIconName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDragEnter(value: DraggingEvent => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeave(value: DraggingEvent => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStop(value: DraggingEvent => Unit): Self = StObject.set(x, "onDragStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragging(value: DraggingEvent => Unit): Self = StObject.set(x, "onDragging", js.Any.fromFunction1(value))
    }
  }
}
