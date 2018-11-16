package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdDocumentMedium extends js.Object

@JSGlobal("Word.WdDocumentMedium")
@js.native
object WdDocumentMedium extends js.Object {
  @js.native
  sealed trait wdDocument
    extends activexDashWordLib.WordNs.WdDocumentMedium
  
  @js.native
  sealed trait wdEmailMessage
    extends activexDashWordLib.WordNs.WdDocumentMedium
  
  @js.native
  sealed trait wdWebPage
    extends activexDashWordLib.WordNs.WdDocumentMedium
  
  /* 1 */ val wdDocument: wdDocument with scala.Double = js.native
  /* 0 */ val wdEmailMessage: wdEmailMessage with scala.Double = js.native
  /* 2 */ val wdWebPage: wdWebPage with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdDocumentMedium with scala.Double] = js.native
}

