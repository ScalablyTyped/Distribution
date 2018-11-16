package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdDocumentType extends js.Object

@JSGlobal("Word.WdDocumentType")
@js.native
object WdDocumentType extends js.Object {
  @js.native
  sealed trait wdTypeDocument
    extends activexDashWordLib.WordNs.WdDocumentType
  
  @js.native
  sealed trait wdTypeFrameset
    extends activexDashWordLib.WordNs.WdDocumentType
  
  @js.native
  sealed trait wdTypeTemplate
    extends activexDashWordLib.WordNs.WdDocumentType
  
  /* 0 */ val wdTypeDocument: wdTypeDocument with scala.Double = js.native
  /* 2 */ val wdTypeFrameset: wdTypeFrameset with scala.Double = js.native
  /* 1 */ val wdTypeTemplate: wdTypeTemplate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdDocumentType with scala.Double] = js.native
}

