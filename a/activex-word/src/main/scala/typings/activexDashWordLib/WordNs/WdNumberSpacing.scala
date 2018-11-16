package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdNumberSpacing extends js.Object

@JSGlobal("Word.WdNumberSpacing")
@js.native
object WdNumberSpacing extends js.Object {
  @js.native
  sealed trait wdNumberSpacingDefault
    extends activexDashWordLib.WordNs.WdNumberSpacing
  
  @js.native
  sealed trait wdNumberSpacingProportional
    extends activexDashWordLib.WordNs.WdNumberSpacing
  
  @js.native
  sealed trait wdNumberSpacingTabular
    extends activexDashWordLib.WordNs.WdNumberSpacing
  
  /* 0 */ val wdNumberSpacingDefault: wdNumberSpacingDefault with scala.Double = js.native
  /* 1 */ val wdNumberSpacingProportional: wdNumberSpacingProportional with scala.Double = js.native
  /* 2 */ val wdNumberSpacingTabular: wdNumberSpacingTabular with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdNumberSpacing with scala.Double] = js.native
}

