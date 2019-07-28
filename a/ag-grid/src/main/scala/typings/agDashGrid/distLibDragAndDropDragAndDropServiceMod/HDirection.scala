package typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HDirection extends js.Object

@JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "HDirection")
@js.native
object HDirection extends js.Object {
  @js.native
  sealed trait Left extends HDirection
  
  @js.native
  sealed trait Right extends HDirection
  
  /* 0 */ val Left: typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod.HDirection.Left with Double = js.native
  /* 1 */ val Right: typings.agDashGrid.distLibDragAndDropDragAndDropServiceMod.HDirection.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HDirection with Double] = js.native
}

