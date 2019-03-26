package typings
package agDashGridLib.distLibDragAndDropDragAndDropServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VDirection extends js.Object

@JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "VDirection")
@js.native
object VDirection extends js.Object {
  @js.native
  sealed trait Down
    extends agDashGridLib.distLibDragAndDropDragAndDropServiceMod.VDirection
  
  @js.native
  sealed trait Up
    extends agDashGridLib.distLibDragAndDropDragAndDropServiceMod.VDirection
  
  /* 1 */ val Down: Down with scala.Double = js.native
  /* 0 */ val Up: Up with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    agDashGridLib.distLibDragAndDropDragAndDropServiceMod.VDirection with scala.Double
  ] = js.native
}

