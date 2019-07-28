package typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VDirection extends js.Object

@JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "VDirection")
@js.native
object VDirection extends js.Object {
  @js.native
  sealed trait Down extends VDirection
  
  @js.native
  sealed trait Up extends VDirection
  
  /* 1 */ val Down: typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod.VDirection.Down with Double = js.native
  /* 0 */ val Up: typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod.VDirection.Up with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VDirection with Double] = js.native
}

