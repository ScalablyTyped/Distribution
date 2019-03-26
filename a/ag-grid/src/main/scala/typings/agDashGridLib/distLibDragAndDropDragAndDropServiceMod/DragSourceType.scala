package typings
package agDashGridLib.distLibDragAndDropDragAndDropServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DragSourceType extends js.Object

@JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragSourceType")
@js.native
object DragSourceType extends js.Object {
  @js.native
  sealed trait HeaderCell
    extends agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DragSourceType
  
  @js.native
  sealed trait RowDrag
    extends agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DragSourceType
  
  @js.native
  sealed trait ToolPanel
    extends agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DragSourceType
  
  /* 1 */ val HeaderCell: HeaderCell with scala.Double = js.native
  /* 2 */ val RowDrag: RowDrag with scala.Double = js.native
  /* 0 */ val ToolPanel: ToolPanel with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DragSourceType with scala.Double
  ] = js.native
}

