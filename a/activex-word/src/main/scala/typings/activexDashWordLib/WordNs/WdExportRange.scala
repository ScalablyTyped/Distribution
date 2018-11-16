package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdExportRange extends js.Object

@JSGlobal("Word.WdExportRange")
@js.native
object WdExportRange extends js.Object {
  @js.native
  sealed trait wdExportAllDocument
    extends activexDashWordLib.WordNs.WdExportRange
  
  @js.native
  sealed trait wdExportCurrentPage
    extends activexDashWordLib.WordNs.WdExportRange
  
  @js.native
  sealed trait wdExportFromTo
    extends activexDashWordLib.WordNs.WdExportRange
  
  @js.native
  sealed trait wdExportSelection
    extends activexDashWordLib.WordNs.WdExportRange
  
  /* 0 */ val wdExportAllDocument: wdExportAllDocument with scala.Double = js.native
  /* 2 */ val wdExportCurrentPage: wdExportCurrentPage with scala.Double = js.native
  /* 3 */ val wdExportFromTo: wdExportFromTo with scala.Double = js.native
  /* 1 */ val wdExportSelection: wdExportSelection with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdExportRange with scala.Double] = js.native
}

