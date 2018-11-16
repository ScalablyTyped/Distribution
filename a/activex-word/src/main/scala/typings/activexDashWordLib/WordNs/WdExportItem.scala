package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdExportItem extends js.Object

@JSGlobal("Word.WdExportItem")
@js.native
object WdExportItem extends js.Object {
  @js.native
  sealed trait wdExportDocumentContent
    extends activexDashWordLib.WordNs.WdExportItem
  
  @js.native
  sealed trait wdExportDocumentWithMarkup
    extends activexDashWordLib.WordNs.WdExportItem
  
  /* 0 */ val wdExportDocumentContent: wdExportDocumentContent with scala.Double = js.native
  /* 7 */ val wdExportDocumentWithMarkup: wdExportDocumentWithMarkup with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdExportItem with scala.Double] = js.native
}

