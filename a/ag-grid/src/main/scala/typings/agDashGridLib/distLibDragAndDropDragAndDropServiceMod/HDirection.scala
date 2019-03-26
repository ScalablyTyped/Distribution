package typings
package agDashGridLib.distLibDragAndDropDragAndDropServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HDirection extends js.Object

@JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "HDirection")
@js.native
object HDirection extends js.Object {
  @js.native
  sealed trait Left
    extends agDashGridLib.distLibDragAndDropDragAndDropServiceMod.HDirection
  
  @js.native
  sealed trait Right
    extends agDashGridLib.distLibDragAndDropDragAndDropServiceMod.HDirection
  
  /* 0 */ val Left: Left with scala.Double = js.native
  /* 1 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    agDashGridLib.distLibDragAndDropDragAndDropServiceMod.HDirection with scala.Double
  ] = js.native
}

