package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdLineType extends js.Object

@JSGlobal("Word.WdLineType")
@js.native
object WdLineType extends js.Object {
  @js.native
  sealed trait wdTableRow
    extends activexDashWordLib.WordNs.WdLineType
  
  @js.native
  sealed trait wdTextLine
    extends activexDashWordLib.WordNs.WdLineType
  
  /* 1 */ val wdTableRow: wdTableRow with scala.Double = js.native
  /* 0 */ val wdTextLine: wdTextLine with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdLineType with scala.Double] = js.native
}

