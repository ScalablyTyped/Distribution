package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlRowCol extends js.Object

@JSGlobal("Word.XlRowCol")
@js.native
object XlRowCol extends js.Object {
  @js.native
  sealed trait xlColumns
    extends activexDashWordLib.WordNs.XlRowCol
  
  @js.native
  sealed trait xlRows
    extends activexDashWordLib.WordNs.XlRowCol
  
  /* 2 */ val xlColumns: xlColumns with scala.Double = js.native
  /* 1 */ val xlRows: xlRows with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlRowCol with scala.Double] = js.native
}

