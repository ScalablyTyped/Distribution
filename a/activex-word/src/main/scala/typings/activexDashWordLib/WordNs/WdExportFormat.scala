package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdExportFormat extends js.Object

@JSGlobal("Word.WdExportFormat")
@js.native
object WdExportFormat extends js.Object {
  @js.native
  sealed trait wdExportFormatPDF
    extends activexDashWordLib.WordNs.WdExportFormat
  
  @js.native
  sealed trait wdExportFormatXPS
    extends activexDashWordLib.WordNs.WdExportFormat
  
  /* 17 */ val wdExportFormatPDF: wdExportFormatPDF with scala.Double = js.native
  /* 18 */ val wdExportFormatXPS: wdExportFormatXPS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdExportFormat with scala.Double] = js.native
}

