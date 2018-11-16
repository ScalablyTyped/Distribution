package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdMovementType extends js.Object

@JSGlobal("Word.WdMovementType")
@js.native
object WdMovementType extends js.Object {
  @js.native
  sealed trait wdExtend
    extends activexDashWordLib.WordNs.WdMovementType
  
  @js.native
  sealed trait wdMove
    extends activexDashWordLib.WordNs.WdMovementType
  
  /* 1 */ val wdExtend: wdExtend with scala.Double = js.native
  /* 0 */ val wdMove: wdMove with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdMovementType with scala.Double] = js.native
}

