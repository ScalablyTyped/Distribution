package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdPrintOutRange extends js.Object

@JSGlobal("Word.WdPrintOutRange")
@js.native
object WdPrintOutRange extends js.Object {
  @js.native
  sealed trait wdPrintAllDocument
    extends activexDashWordLib.WordNs.WdPrintOutRange
  
  @js.native
  sealed trait wdPrintCurrentPage
    extends activexDashWordLib.WordNs.WdPrintOutRange
  
  @js.native
  sealed trait wdPrintFromTo
    extends activexDashWordLib.WordNs.WdPrintOutRange
  
  @js.native
  sealed trait wdPrintRangeOfPages
    extends activexDashWordLib.WordNs.WdPrintOutRange
  
  @js.native
  sealed trait wdPrintSelection
    extends activexDashWordLib.WordNs.WdPrintOutRange
  
  /* 0 */ val wdPrintAllDocument: wdPrintAllDocument with scala.Double = js.native
  /* 2 */ val wdPrintCurrentPage: wdPrintCurrentPage with scala.Double = js.native
  /* 3 */ val wdPrintFromTo: wdPrintFromTo with scala.Double = js.native
  /* 4 */ val wdPrintRangeOfPages: wdPrintRangeOfPages with scala.Double = js.native
  /* 1 */ val wdPrintSelection: wdPrintSelection with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdPrintOutRange with scala.Double] = js.native
}

