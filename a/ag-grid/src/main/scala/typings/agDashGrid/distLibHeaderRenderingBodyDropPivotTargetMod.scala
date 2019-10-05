package typings.agDashGrid

import typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod.DraggingEvent
import typings.agDashGrid.distLibHeaderRenderingBodyDropTargetMod.DropListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/headerRendering/bodyDropPivotTarget", JSImport.Namespace)
@js.native
object distLibHeaderRenderingBodyDropPivotTargetMod extends js.Object {
  @js.native
  class BodyDropPivotTarget protected () extends DropListener {
    def this(pinned: String) = this()
    var columnController: js.Any = js.native
    var columnsToAggregate: js.Any = js.native
    var columnsToGroup: js.Any = js.native
    var columnsToPivot: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    var pinned: js.Any = js.native
    /* private */ def clearColumnsList(): js.Any = js.native
    /* CompleteClass */
    override def getIconName(): String = js.native
    /* CompleteClass */
    override def onDragEnter(params: DraggingEvent): Unit = js.native
    /* CompleteClass */
    override def onDragLeave(params: DraggingEvent): Unit = js.native
    /* CompleteClass */
    override def onDragStop(params: DraggingEvent): Unit = js.native
    /* CompleteClass */
    override def onDragging(params: DraggingEvent): Unit = js.native
  }
  
}

