package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdHeaderFooterIndex extends js.Object

@JSGlobal("Word.WdHeaderFooterIndex")
@js.native
object WdHeaderFooterIndex extends js.Object {
  @js.native
  sealed trait wdHeaderFooterEvenPages
    extends activexDashWordLib.WordNs.WdHeaderFooterIndex
  
  @js.native
  sealed trait wdHeaderFooterFirstPage
    extends activexDashWordLib.WordNs.WdHeaderFooterIndex
  
  @js.native
  sealed trait wdHeaderFooterPrimary
    extends activexDashWordLib.WordNs.WdHeaderFooterIndex
  
  /* 3 */ val wdHeaderFooterEvenPages: wdHeaderFooterEvenPages with scala.Double = js.native
  /* 2 */ val wdHeaderFooterFirstPage: wdHeaderFooterFirstPage with scala.Double = js.native
  /* 1 */ val wdHeaderFooterPrimary: wdHeaderFooterPrimary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdHeaderFooterIndex with scala.Double] = js.native
}

