package typings.agGrid.dragAndDropServiceMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DragSourceType with Double] = js.native
  /* 1 */ @js.native
  object HeaderCell extends TopLevel[HeaderCell with Double]
  
  /* 2 */ @js.native
  object RowDrag extends TopLevel[RowDrag with Double]
  
  /* 0 */ @js.native
  object ToolPanel extends TopLevel[ToolPanel with Double]
  
}

