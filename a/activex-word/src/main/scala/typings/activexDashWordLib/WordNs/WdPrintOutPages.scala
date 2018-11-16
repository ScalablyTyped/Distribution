package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdPrintOutPages extends js.Object

@JSGlobal("Word.WdPrintOutPages")
@js.native
object WdPrintOutPages extends js.Object {
  @js.native
  sealed trait wdPrintAllPages
    extends activexDashWordLib.WordNs.WdPrintOutPages
  
  @js.native
  sealed trait wdPrintEvenPagesOnly
    extends activexDashWordLib.WordNs.WdPrintOutPages
  
  @js.native
  sealed trait wdPrintOddPagesOnly
    extends activexDashWordLib.WordNs.WdPrintOutPages
  
  /* 0 */ val wdPrintAllPages: wdPrintAllPages with scala.Double = js.native
  /* 2 */ val wdPrintEvenPagesOnly: wdPrintEvenPagesOnly with scala.Double = js.native
  /* 1 */ val wdPrintOddPagesOnly: wdPrintOddPagesOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdPrintOutPages with scala.Double] = js.native
}

