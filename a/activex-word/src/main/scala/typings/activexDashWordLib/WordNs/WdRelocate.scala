package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdRelocate extends js.Object

@JSGlobal("Word.WdRelocate")
@js.native
object WdRelocate extends js.Object {
  @js.native
  sealed trait wdRelocateDown
    extends activexDashWordLib.WordNs.WdRelocate
  
  @js.native
  sealed trait wdRelocateUp
    extends activexDashWordLib.WordNs.WdRelocate
  
  /* 1 */ val wdRelocateDown: wdRelocateDown with scala.Double = js.native
  /* 0 */ val wdRelocateUp: wdRelocateUp with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdRelocate with scala.Double] = js.native
}

