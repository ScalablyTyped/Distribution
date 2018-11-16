package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdAlignmentTabAlignment extends js.Object

@JSGlobal("Word.WdAlignmentTabAlignment")
@js.native
object WdAlignmentTabAlignment extends js.Object {
  @js.native
  sealed trait wdCenter
    extends activexDashWordLib.WordNs.WdAlignmentTabAlignment
  
  @js.native
  sealed trait wdLeft
    extends activexDashWordLib.WordNs.WdAlignmentTabAlignment
  
  @js.native
  sealed trait wdRight
    extends activexDashWordLib.WordNs.WdAlignmentTabAlignment
  
  /* 1 */ val wdCenter: wdCenter with scala.Double = js.native
  /* 0 */ val wdLeft: wdLeft with scala.Double = js.native
  /* 2 */ val wdRight: wdRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdAlignmentTabAlignment with scala.Double] = js.native
}

