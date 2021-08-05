package typings.agGrid

import typings.agGrid.dragAndDropServiceMod.DragSourceType
import typings.agGrid.dragAndDropServiceMod.DraggingEvent
import typings.agGrid.dragAndDropServiceMod.DropTarget
import typings.agGrid.gridPanelMod.GridPanel
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bodyDropTargetMod {
  
  @JSImport("ag-grid/dist/lib/headerRendering/bodyDropTarget", "BodyDropTarget")
  @js.native
  class BodyDropTarget protected ()
    extends StObject
       with DropTarget {
    def this(pinned: String, eContainer: HTMLElement) = this()
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ var context: js.Any = js.native
    
    /* private */ var currentDropListener: js.Any = js.native
    
    /* private */ var dragAndDropService: js.Any = js.native
    
    /* private */ var dropListeners: js.Any = js.native
    
    /* private */ var eContainer: js.Any = js.native
    
    /* private */ var eSecondaryContainers: js.Any = js.native
    
    /** The main container that will get the drop. */
    /* CompleteClass */
    override def getContainer(): HTMLElement = js.native
    
    /* private */ def getDropType(draggingEvent: js.Any): js.Any = js.native
    
    @JSName("getIconName")
    def getIconName_MBodyDropTarget(): String = js.native
    
    @JSName("getSecondaryContainers")
    def getSecondaryContainers_MBodyDropTarget(): js.Array[HTMLElement] = js.native
    
    /* private */ var gridPanel: js.Any = js.native
    
    /* private */ def init(): js.Any = js.native
    
    /* CompleteClass */
    override def isInterestedIn(`type`: DragSourceType): Boolean = js.native
    
    /* private */ var moveColumnController: js.Any = js.native
    
    @JSName("onDragEnter")
    def onDragEnter_MBodyDropTarget(draggingEvent: DraggingEvent): Unit = js.native
    
    @JSName("onDragLeave")
    def onDragLeave_MBodyDropTarget(params: DraggingEvent): Unit = js.native
    
    @JSName("onDragStop")
    def onDragStop_MBodyDropTarget(params: DraggingEvent): Unit = js.native
    
    @JSName("onDragging")
    def onDragging_MBodyDropTarget(params: DraggingEvent): Unit = js.native
    
    /* private */ var pinned: js.Any = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
  }
  
  trait DropListener extends StObject {
    
    def getIconName(): String
    
    def onDragEnter(params: DraggingEvent): Unit
    
    def onDragLeave(params: DraggingEvent): Unit
    
    def onDragStop(params: DraggingEvent): Unit
    
    def onDragging(params: DraggingEvent): Unit
  }
  object DropListener {
    
    inline def apply(
      getIconName: () => String,
      onDragEnter: DraggingEvent => Unit,
      onDragLeave: DraggingEvent => Unit,
      onDragStop: DraggingEvent => Unit,
      onDragging: DraggingEvent => Unit
    ): DropListener = {
      val __obj = js.Dynamic.literal(getIconName = js.Any.fromFunction0(getIconName), onDragEnter = js.Any.fromFunction1(onDragEnter), onDragLeave = js.Any.fromFunction1(onDragLeave), onDragStop = js.Any.fromFunction1(onDragStop), onDragging = js.Any.fromFunction1(onDragging))
      __obj.asInstanceOf[DropListener]
    }
    
    extension [Self <: DropListener](x: Self) {
      
      inline def setGetIconName(value: () => String): Self = StObject.set(x, "getIconName", js.Any.fromFunction0(value))
      
      inline def setOnDragEnter(value: DraggingEvent => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragLeave(value: DraggingEvent => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragStop(value: DraggingEvent => Unit): Self = StObject.set(x, "onDragStop", js.Any.fromFunction1(value))
      
      inline def setOnDragging(value: DraggingEvent => Unit): Self = StObject.set(x, "onDragging", js.Any.fromFunction1(value))
    }
  }
}
