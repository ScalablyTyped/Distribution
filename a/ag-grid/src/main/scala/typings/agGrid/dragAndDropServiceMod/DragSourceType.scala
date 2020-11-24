package typings.agGrid.dragAndDropServiceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DragSourceType extends js.Object
@JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "DragSourceType")
@js.native
object DragSourceType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DragSourceType with Double] = js.native
  
  @js.native
  sealed trait HeaderCell extends DragSourceType
  /* 1 */ @js.native
  object HeaderCell extends TopLevel[HeaderCell with Double]
  
  @js.native
  sealed trait RowDrag extends DragSourceType
  /* 2 */ @js.native
  object RowDrag extends TopLevel[RowDrag with Double]
  
  @js.native
  sealed trait ToolPanel extends DragSourceType
  /* 0 */ @js.native
  object ToolPanel extends TopLevel[ToolPanel with Double]
}
