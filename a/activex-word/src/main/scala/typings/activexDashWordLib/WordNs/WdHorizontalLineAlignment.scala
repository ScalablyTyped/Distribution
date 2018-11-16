package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdHorizontalLineAlignment extends js.Object

@JSGlobal("Word.WdHorizontalLineAlignment")
@js.native
object WdHorizontalLineAlignment extends js.Object {
  @js.native
  sealed trait wdHorizontalLineAlignCenter
    extends activexDashWordLib.WordNs.WdHorizontalLineAlignment
  
  @js.native
  sealed trait wdHorizontalLineAlignLeft
    extends activexDashWordLib.WordNs.WdHorizontalLineAlignment
  
  @js.native
  sealed trait wdHorizontalLineAlignRight
    extends activexDashWordLib.WordNs.WdHorizontalLineAlignment
  
  /* 1 */ val wdHorizontalLineAlignCenter: wdHorizontalLineAlignCenter with scala.Double = js.native
  /* 0 */ val wdHorizontalLineAlignLeft: wdHorizontalLineAlignLeft with scala.Double = js.native
  /* 2 */ val wdHorizontalLineAlignRight: wdHorizontalLineAlignRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdHorizontalLineAlignment with scala.Double] = js.native
}

