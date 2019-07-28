package typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DragSourceType extends js.Object

@JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragSourceType")
@js.native
object DragSourceType extends js.Object {
  @js.native
  sealed trait HeaderCell extends DragSourceType
  
  @js.native
  sealed trait RowDrag extends DragSourceType
  
  @js.native
  sealed trait ToolPanel extends DragSourceType
  
  /* 1 */ val HeaderCell: typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod.DragSourceType.HeaderCell with Double = js.native
  /* 2 */ val RowDrag: typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod.DragSourceType.RowDrag with Double = js.native
  /* 0 */ val ToolPanel: typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod.DragSourceType.ToolPanel with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DragSourceType with Double] = js.native
}

