package typings.agGrid

import typings.agGrid.bodyDropTargetMod.DropListener
import typings.agGrid.dragAndDropServiceMod.DraggingEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bodyDropPivotTargetMod {
  
  @JSImport("ag-grid/dist/lib/headerRendering/bodyDropPivotTarget", "BodyDropPivotTarget")
  @js.native
  class BodyDropPivotTarget protected ()
    extends StObject
       with DropListener {
    def this(pinned: String) = this()
    
    /* private */ def clearColumnsList(): js.Any = js.native
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ var columnsToAggregate: js.Any = js.native
    
    /* private */ var columnsToGroup: js.Any = js.native
    
    /* private */ var columnsToPivot: js.Any = js.native
    
    /* CompleteClass */
    override def getIconName(): String = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /* CompleteClass */
    override def onDragEnter(params: DraggingEvent): Unit = js.native
    
    /* CompleteClass */
    override def onDragLeave(params: DraggingEvent): Unit = js.native
    
    /* CompleteClass */
    override def onDragStop(params: DraggingEvent): Unit = js.native
    
    /* CompleteClass */
    override def onDragging(params: DraggingEvent): Unit = js.native
    
    /* private */ var pinned: js.Any = js.native
  }
}
