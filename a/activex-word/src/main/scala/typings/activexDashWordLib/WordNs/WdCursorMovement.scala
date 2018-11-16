package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdCursorMovement extends js.Object

@JSGlobal("Word.WdCursorMovement")
@js.native
object WdCursorMovement extends js.Object {
  @js.native
  sealed trait wdCursorMovementLogical
    extends activexDashWordLib.WordNs.WdCursorMovement
  
  @js.native
  sealed trait wdCursorMovementVisual
    extends activexDashWordLib.WordNs.WdCursorMovement
  
  /* 0 */ val wdCursorMovementLogical: wdCursorMovementLogical with scala.Double = js.native
  /* 1 */ val wdCursorMovementVisual: wdCursorMovementVisual with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdCursorMovement with scala.Double] = js.native
}

