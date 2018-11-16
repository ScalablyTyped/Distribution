package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdShowSourceDocuments extends js.Object

@JSGlobal("Word.WdShowSourceDocuments")
@js.native
object WdShowSourceDocuments extends js.Object {
  @js.native
  sealed trait wdShowSourceDocumentsBoth
    extends activexDashWordLib.WordNs.WdShowSourceDocuments
  
  @js.native
  sealed trait wdShowSourceDocumentsNone
    extends activexDashWordLib.WordNs.WdShowSourceDocuments
  
  @js.native
  sealed trait wdShowSourceDocumentsOriginal
    extends activexDashWordLib.WordNs.WdShowSourceDocuments
  
  @js.native
  sealed trait wdShowSourceDocumentsRevised
    extends activexDashWordLib.WordNs.WdShowSourceDocuments
  
  /* 3 */ val wdShowSourceDocumentsBoth: wdShowSourceDocumentsBoth with scala.Double = js.native
  /* 0 */ val wdShowSourceDocumentsNone: wdShowSourceDocumentsNone with scala.Double = js.native
  /* 1 */ val wdShowSourceDocumentsOriginal: wdShowSourceDocumentsOriginal with scala.Double = js.native
  /* 2 */ val wdShowSourceDocumentsRevised: wdShowSourceDocumentsRevised with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdShowSourceDocuments with scala.Double] = js.native
}

