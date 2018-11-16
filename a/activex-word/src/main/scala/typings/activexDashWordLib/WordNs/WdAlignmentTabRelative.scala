package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdAlignmentTabRelative extends js.Object

@JSGlobal("Word.WdAlignmentTabRelative")
@js.native
object WdAlignmentTabRelative extends js.Object {
  @js.native
  sealed trait wdIndent
    extends activexDashWordLib.WordNs.WdAlignmentTabRelative
  
  @js.native
  sealed trait wdMargin
    extends activexDashWordLib.WordNs.WdAlignmentTabRelative
  
  /* 1 */ val wdIndent: wdIndent with scala.Double = js.native
  /* 0 */ val wdMargin: wdMargin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdAlignmentTabRelative with scala.Double] = js.native
}

